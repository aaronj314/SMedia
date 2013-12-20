package com.smedia.sqzserver.common.util;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

//import com.thoughtworks.xstream.XStream;
//import com.thoughtworks.xstream.io.xml.DomDriver;

public class PresetMetaData {

	private String xmlStr = "";
	private List<AudioCompressor> audioCompressorList = null;
	private List<VideoCompressor> videoCompressorList = null;
	private List<Filter> filterList = null;

	// Output DefaultName="WebM_720p_RTMP.spfx" FavWorkflow="" Id="771830784"
	// IsLite="False" IsMBR="False" Name="WebM_720p_RTMP"
	// OutputFormat="WebMediaOutputFormat" SubOutputFormat="None"
	// UsingCustomFilter="False" Version="6.0" Workflow="Web\Formats\WebM
	// (.webm)"

	private String defaultName = "";
	private String isMBR = "";
	private String name = "";
	private String outputFormat = "";
	private String workflow = "";
	private String subOutputFormat = "";
	private boolean isAdaptive = false;
	private boolean isHLSAdaptive= false;
	private HashMap<String, String> formatMap = null;

	public PresetMetaData(String preset) {
		audioCompressorList = new ArrayList<AudioCompressor>();
		videoCompressorList = new ArrayList<VideoCompressor>();
		xmlStr = preset;
		init(preset);
	}

	public boolean isAdaptive() {
		return isAdaptive;
	}
	
	public boolean isHLS() {
		return isHLSAdaptive;
	}

	private void init(String xml) {
		try {

			// build fomrat map
			formatMap = new HashMap<String, String>();

			/*
			 * MOVOutputFormat MPEGOutputFormat WebMediaOutputFormat
			 * MXFOutputFormat WMVOutputFormat SWFOutputFormat MP4OutputFormat
			 * FLVOutputFormat QTExportOutputFormat
			 */

			/*
			 * a list of file extensions we may or may not need to support in
			 * the future:
			 * 
			 * http://en.wikipedia.org/wiki/Comparison_of_container_formats
			 * http://en.wikipedia.org/wiki/Audio_file_format
			 * 
			 * 3gp, 3g2, asf, wma, wmv, avi, divx, evo, f4v, mkv, mk3d, mka,
			 * mks, mck, mp4, mpg, mpeg, ps, ts, m2ts, mxf, ogg, mov, qt, rmvb,
			 * vob, ifo, webm, mp3, m4v, rm, mj2, iff, act, aiff, alac, amr,
			 * atrac, wav, au, awb, mmf
			 */

			formatMap.put("MOVOutputFormat".toLowerCase(), "mov");
			formatMap.put("MPEGOutputFormat".toLowerCase(), "mpg");
			formatMap.put("WebMediaOutputFormat".toLowerCase(), "webm");
			formatMap.put("MXFOutputFormat".toLowerCase(), "mxf");
			formatMap.put("WMVOutputFormat".toLowerCase(), "wmv");
			formatMap.put("SWFOutputFormat".toLowerCase(), "swf");
			formatMap.put("MP4OutputFormat".toLowerCase(), "mp4");
			formatMap.put("FLVOutputFormat".toLowerCase(), "flv");
			formatMap.put("QTExportOutputFormat".toLowerCase(), "qt");

			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
			InputSource is = new InputSource(new StringReader(xml));
			Document doc = docBuilder.parse(is);

			NodeList nList = doc.getElementsByTagName("Output");
			int len = nList.getLength();
			org.w3c.dom.Node n = nList.item(0);

			name = n.getAttributes().getNamedItem("Name").getNodeValue();
			defaultName = n.getAttributes().getNamedItem("DefaultName").getNodeValue();
			isMBR = n.getAttributes().getNamedItem("IsMBR").getNodeValue();
			outputFormat = n.getAttributes().getNamedItem("OutputFormat").getNodeValue();
			subOutputFormat = n.getAttributes().getNamedItem("SubOutputFormat").getNodeValue();
			workflow = n.getAttributes().getNamedItem("Workflow").getNodeValue();

			if (subOutputFormat != null) {
				if (subOutputFormat.equals("Adobe HTTP Dynamic Streaming") || subOutputFormat.equals("Microsoft IIS Smooth Streaming")
						|| subOutputFormat.equals("MPEG TS Adaptive Streaming")) {
					isAdaptive = true;
				}
				if (subOutputFormat.equals("MPEG TS Adaptive Streaming")) {
					isHLSAdaptive = true;
				}
			}
			
			NodeList aList = doc.getElementsByTagName("AudioCompressor");

			audioCompressorList = new ArrayList<AudioCompressor>();
			AudioCompressor audioCompressor = null;
			String audioCodec = "";

			for (int i = 0; i < aList.getLength(); i++) {
				audioCodec = aList.item(i).getAttributes().getNamedItem("codec").getNodeValue();
				audioCompressor = getAudioComp(audioCodec, aList.item(i).getChildNodes());
				audioCompressorList.add(audioCompressor);
			}

			// for now only look at the first video node
			// we will handle multiple later
			NodeList videoList = doc.getElementsByTagName("VideoCompressor");
			String videoCodec = null;
			VideoCompressor videoCompressor = null;

			for (int i = 0; i < videoList.getLength(); i++) {
				videoCodec = videoList.item(i).getAttributes().getNamedItem("codec").getNodeValue();
				videoCompressor = getVideoComp(videoCodec, videoList.item(i).getChildNodes());
				videoCompressorList.add(videoCompressor);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private AudioCompressor getAudioComp(String codec, NodeList list) {
		org.w3c.dom.Node node = null;
		AudioCompressor audioCompressor = new AudioCompressor();
		audioCompressor.setCodec(codec);
		for (int i = 0; i < list.getLength(); i++) {
			node = list.item(i);
			if (node.getAttributes() != null && node.getAttributes().getNamedItem("Value") != null) {
				audioCompressor.addValue(node.getNodeName(), node.getAttributes().getNamedItem("Value").getNodeValue());
			}
		}

		return audioCompressor;
	}

	private VideoCompressor getVideoComp(String codec, NodeList list) {
		org.w3c.dom.Node node = null;
		VideoCompressor videoCompressor = new VideoCompressor();
		videoCompressor.setCodec(codec);
		for (int i = 0; i < list.getLength(); i++) {
			node = list.item(i);
			if (node.getAttributes() != null && node.getAttributes().getNamedItem("Value") != null) {
				videoCompressor.addValue(node.getNodeName(), node.getAttributes().getNamedItem("Value").getNodeValue());
			}
		}
		return videoCompressor;
	}

	public String getXmlStr() {
		return xmlStr;
	}

	public void setXmlStr(String xmlStr) {
		this.xmlStr = xmlStr;
	}

	public List<AudioCompressor> getAudioCompressorList() {
		return audioCompressorList;
	}

	public void setAudioCompressorList(List<AudioCompressor> audioCompressorList) {
		this.audioCompressorList = audioCompressorList;
	}

	public List<VideoCompressor> getVideoCompressorList() {
		return videoCompressorList;
	}

	public void setVideoCompressorList(List<VideoCompressor> videoCompressorList) {
		this.videoCompressorList = videoCompressorList;
	}

	public List<Filter> getFilterList() {
		return filterList;
	}

	public void setFilterList(List<Filter> filterList) {
		this.filterList = filterList;
	}

	public String getDefaultName() {
		return defaultName;
	}

	public void setDefaultName(String defaultName) {
		this.defaultName = defaultName;
	}

	public String getIsMBR() {
		return isMBR;
	}

	public void setIsMBR(String isMBR) {
		this.isMBR = isMBR;
	}

	public String getOutputFormat() {
		return outputFormat;
	}

	public void setOutputFormat(String outputFormat) {
		this.outputFormat = outputFormat;
	}

	public String getWorkflow() {
		return workflow;
	}

	public void setWorkflow(String workflow) {
		this.workflow = workflow;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getPresetXml() {
		return formatXml(xmlStr);
	}

	private String formatXml(String xml) {
		// String theXmlStr = xml.replaceAll(">", "> \n");
		try {
			// System.setProperty("javax.xml.parsers.DocumentBuilderFactory",
			// "com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl");
			// System.setProperty("javax.xml.transform.TransformerFactory",
			// "com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl");

			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
			InputSource is = new InputSource(new StringReader(xml));
			Document doc = docBuilder.parse(is);

			Transformer transformer = javax.xml.transform.TransformerFactory.newInstance().newTransformer();
			// Transformer transformer =
			// TransformerFactory..newInstance().newTransformer();
			// transformer.setOutputProperty(OutputKeys.DOCTYPE_PUBLIC,
			// "squeeze_audience");
			transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, "squeeze_audience");
			transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			StreamResult result = new StreamResult(new StringWriter());
			DOMSource source = new DOMSource(doc);
			transformer.transform(source, result);
			String xmlString = result.getWriter().toString();
			// System.out.println(xmlString);
			return xmlString;
		} catch (Exception e) {

		}
		return "The Preset";
	}

	public String getDescription() {
		return outputFormat;
	}

	public String getExpectedFileNameExtension() {

		if (outputFormat == null) {
			return "unknown";
		} else {
			return formatMap.get(outputFormat.toLowerCase());
		}
	}

	public static void main(String[] args) {

		try {
			String filePath = "/Users/trig/dev/sqz_server/test_preset.spfx";

			FileReader fr = new FileReader(new File(filePath));
			BufferedReader br = new BufferedReader(fr);
			StringBuffer sb = new StringBuffer();

			String line = null;
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
			br.close();

			PresetMetaData p = new PresetMetaData(sb.toString());

			System.out.println(p.name);

			System.out.println("video compressor count: " + p.videoCompressorList.size());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
