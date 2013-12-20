package com.smedia.sqzserver.common.util;

import java.util.HashMap;

public class VideoCompressor {

	private String dataRate = null;
	private String frameRate = null;
	private String outputSize = null;
	private String maintainSourceAspectRatioEnable = null;
	private String letterBoxOrPillarEnable = null;
	private String frameSizeSameAsSourceEnable = null;
	private String bitRateMode = null;
	private String keyFrameRate = null;
	private String keyFrameRateUnits = null;
	private String codec = null;
	private HashMap<String, String> valueMap = null;

	public VideoCompressor() {
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

	public String getFrameRate() {
		if (frameRate == null) {
			frameRate = valueMap.get("FrameRate");
		}
		return frameRate;
	}

	public void setFrameRate(String frameRate) {
		this.frameRate = frameRate;
	}

	public String getOutputSize() {
		if (outputSize == null) {
			outputSize = valueMap.get("OutputSize");
		}
		return outputSize;
	}

	public void setOutputSize(String outputSize) {
		this.outputSize = outputSize;
	}

	public String getMaintainSourceAspectRatioEnable() {
		if (maintainSourceAspectRatioEnable == null) {
			maintainSourceAspectRatioEnable = valueMap.get("MaintainSourceAspectRatioEnable");
		}
		return maintainSourceAspectRatioEnable;
	}

	public void setMaintainSourceAspectRatioEnable(String maintainSourceAspectRatioEnable) {
		this.maintainSourceAspectRatioEnable = maintainSourceAspectRatioEnable;
	}

	public String getLetterBoxOrPillarEnable() {
		if (letterBoxOrPillarEnable == null) {
			letterBoxOrPillarEnable = valueMap.get("LetterBoxOrPillarEnable");
		}
		return letterBoxOrPillarEnable;
	}

	public void setLetterBoxOrPillarEnable(String letterBoxOrPillarEnable) {
		this.letterBoxOrPillarEnable = letterBoxOrPillarEnable;
	}

	public String getFrameSizeSameAsSourceEnable() {
		if (frameSizeSameAsSourceEnable == null) {
			frameSizeSameAsSourceEnable = valueMap.get("FrameSizeSameAsSourceEnable");
		}
		return frameSizeSameAsSourceEnable;
	}

	public void setFrameSizeSameAsSourceEnable(String frameSizeSameAsSourceEnable) {
		this.frameSizeSameAsSourceEnable = frameSizeSameAsSourceEnable;
	}

	public String getBitRateMode() {
		if (bitRateMode == null) {
			bitRateMode = valueMap.get("BitRateMode");
		}
		return bitRateMode;
	}

	public void setBitRateMode(String bitRateMode) {
		this.bitRateMode = bitRateMode;
	}

	public String getKeyFrameRate() {
		if (keyFrameRate == null) {
			keyFrameRate = valueMap.get("KeyFrameRate");
		}
		return keyFrameRate;
	}

	public void setKeyFrameRate(String keyFrameRate) {
		this.keyFrameRate = keyFrameRate;
	}

	public String getKeyFrameRateUnits() {
		if (keyFrameRateUnits == null) {
			keyFrameRateUnits = valueMap.get("KeyFrameRateUnits");
		}
		return keyFrameRateUnits;
	}

	public void setKeyFrameRateUnits(String keyFrameRateUnits) {
		this.keyFrameRateUnits = keyFrameRateUnits;
	}

}
