package com.smedia.sqzserver.common.util;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.FileUtils;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class SqueezeVideoMetadata {

	private String fileName = null;
	// private String audio = null;
	private String audioDuration = null;
	private String numberAudioChannels = null;
	private String audioSampleRate = null;
	private String videoDuration = null;
	private String width = null;
	private String height = null;
	private String displayAspectRatio = null;
	private String frameRate = null;
	private String fileSize = null;

	public SqueezeVideoMetadata(File metadataFile) {
		init(metadataFile);
	}

	private void init(File f) {
		try {
			List<String> strs = FileUtils.readLines(f);
			String[] strList = strs.toArray(new String[strs.size()]);

			String tmp = "";
			for (int i = 0; i < strList.length; i++) {
				tmp = strList[i];
				if (tmp.contains("<VideoInfo>")) {
					// start of valid xml doc
					parse(strList, i);
					return;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void parse(String[] strList, int startIndex) throws Exception {
		StringBuffer sb = new StringBuffer();
		for (int i = startIndex; i < strList.length; i++) {
			sb.append(strList[i]);
		}

		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		String xml = sb.toString();
		InputSource is = new InputSource(new StringReader(xml));
		Document doc = docBuilder.parse(is);

		NodeList nList = doc.getElementsByTagName("VideoInfo");
		int len = nList.getLength();
		org.w3c.dom.Node nodeZero = nList.item(0);

		NodeList kids = nodeZero.getChildNodes();
		org.w3c.dom.Node n = null;
		String name = null;

		for (int i = 0; i < kids.getLength(); i++) {
			n = kids.item(i);
			name = n.getNodeName();
			// System.out.println(name);
			if (name == null) {
				continue;
			}
			if (name.equals("FileName")) {
				fileName = n.getTextContent().trim();
				fileName = fileName.replace("\"", "");
			} else if (name.equals("Audio")) {
				parseAudio(n);
			} else if (name.equals("Video")) {
				parseVideo(n);
			}
		}
	}

	private void parseAudio(org.w3c.dom.Node node) {
		NodeList nList = node.getChildNodes();
		org.w3c.dom.Node n = nList.item(0);
		String name = null;
		for (int i = 0; i < nList.getLength(); i++) {
			n = nList.item(i);
			name = n.getNodeName();
			// System.out.println(name);
			if (name == null) {
				continue;
			}
			if (name.equals("Duration")) {
				audioDuration = n.getTextContent().trim();
			} else if (name.equals("Channels")) {
				numberAudioChannels = n.getTextContent().trim();
			} else if (name.equals("SampleRate")) {
				audioSampleRate = n.getTextContent().trim();
			}
		}
	}

	private void parseVideo(org.w3c.dom.Node node) {
		NodeList nList = node.getChildNodes();
		org.w3c.dom.Node n = nList.item(0);
		String name = null;
		for (int i = 0; i < nList.getLength(); i++) {
			n = nList.item(i);
			name = n.getNodeName();
			// System.out.println(name);
			if (name == null) {
				continue;
			}

			if (name.equals("Duration")) {
				videoDuration = n.getTextContent().trim();
			} else if (name.equals("Width")) {
				width = n.getTextContent().trim();
			} else if (name.equals("Height")) {
				height = n.getTextContent().trim();
			} else if (name.equals("DisplayAspectRatio")) {
				displayAspectRatio = n.getTextContent().trim();
			} else if (name.equals("FrameRate")) {
				frameRate = n.getTextContent().trim();
			}
		}
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getAudioDuration() {
		return audioDuration;
	}

	public void setAudioDuration(String audioDuration) {
		this.audioDuration = audioDuration;
	}

	public String getNumberAudioChannels() {
		return numberAudioChannels;
	}

	public void setNumberAudioChannels(String numberAudioChannels) {
		this.numberAudioChannels = numberAudioChannels;
	}

	public String getAudioSampleRate() {
		return audioSampleRate;
	}

	public void setAudioSampleRate(String audioSampleRate) {
		this.audioSampleRate = audioSampleRate;
	}

	public String getVideoDuration() {
		return videoDuration;
	}

	public void setVideoDuration(String videoDuration) {
		this.videoDuration = videoDuration;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getDisplayAspectRatio() {
		return displayAspectRatio;
	}

	public void setDisplayAspectRatio(String displayAspectRatio) {
		this.displayAspectRatio = displayAspectRatio;
	}

	public String getFrameRate() {
		return frameRate;
	}

	public void setFrameRate(String frameRate) {
		this.frameRate = frameRate;
	}

	public String getFileSize() {
		if (fileSize == null) {
			if (fileName != null) {
				File f = new File(fileName);
				boolean t = f.exists();
				long ts = f.getTotalSpace();
				long sz = f.length();
				fileSize = sz + "";
			}
		}
		return fileSize;
	}

	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}

	public static void main(String[] args) {
		SqueezeVideoMetadata s = new SqueezeVideoMetadata(new File(
				"/Users/trig/dev/sqz_server/apache-karaf-2.2.4/data/sqz_encode_tmp/dc032fad-fc76-4d85-81da-7dcce639aa82/output/linux.mp4.metadata_info"));
		System.out.println("audio duration: " + s.getAudioDuration());
		System.out.println("audio sample rate: " + s.getAudioSampleRate());

		System.out.println("display aspect ratio: " + s.getDisplayAspectRatio());
		System.out.println("audio sample rate: " + s.getAudioSampleRate());

		System.out.println("file name: " + s.getFileName());
		System.out.println("file size: " + s.getFileSize());

		System.out.println("frame rate: " + s.getFrameRate());
		System.out.println("height: " + s.getHeight());

		System.out.println("number audio channels: " + s.getNumberAudioChannels());
		System.out.println("video duration: " + s.getVideoDuration());

		System.out.println("width: " + s.getWidth());
	}

	/*
	 * <VideoInfo> <FileName>
	 * "/Users/trig/dev/sqz_server/apache-karaf-2.2.4/data/sqz_encode_tmp/dc032fad-fc76-4d85-81da-7dcce639aa82/output/linux.mp4"
	 * </FileName> <Audio> <Duration> 71.3781 </Duration> <Channels> 2
	 * </Channels> <SampleRate> 44100 </SampleRate> </Audio> <Video> <Duration>
	 * 71.4 </Duration> <Width> 480 </Width> <Height> 360 </Height>
	 * <DisplayAspectRatio> 1.33333 </DisplayAspectRatio> <FrameRate> 15
	 * </FrameRate> </Video> </VideoInfo>
	 */

}
