package com.smedia.sqzserver.common.util;

import java.util.HashMap;

public class AudioCompressor {

	private String dataRate = null;
	private String sampleRate = null;
	private String sampleSize = null;
	private String channelMode = null;
	private String codec = null;
	private HashMap<String, String> valueMap = null;

	public AudioCompressor() {
		valueMap = new HashMap<String, String>();
	}
	
	public void addValue(String name, String value) {
		valueMap.put(name, value);
	}

	public String getCodec() {
		return codec;
	}

	public void setCodec(String codec) {
		this.codec = codec;
	}

	public String getDataRate() {
		if (dataRate == null) {
			dataRate = valueMap.get("DataRate");
		}
		return dataRate;
	}

	public void setDataRate(String dataRate) {
		this.dataRate = dataRate;
	}

	public String getSampleRate() {
		if (sampleRate == null) {
			sampleRate = valueMap.get("SampleRate");
		}
		return sampleRate;
	}

	public void setSampleRate(String sampleRate) {
		this.sampleRate = sampleRate;
	}

	public String getSampleSize() {
		if (sampleSize == null){
			sampleSize = valueMap.get("SampleSize");
		}
		return sampleSize;
	}

	public void setSampleSize(String sampleSize) {
		this.sampleSize = sampleSize;
	}

	public String getChannelMode() {
		if (channelMode == null){
			channelMode = valueMap.get("ChannelMode");
		}
		return channelMode;
	}

	public void setChannelMode(String channelMode) {
		this.channelMode = channelMode;
	}

}
