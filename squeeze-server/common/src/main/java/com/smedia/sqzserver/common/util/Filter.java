package com.smedia.sqzserver.common.util;

import java.util.List;

public class Filter {

	private String name = "";
	private List<FilterSetting> settingsList = null;

	public Filter() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<FilterSetting> getSettingsList() {
		return settingsList;
	}

	public void setSettingsList(List<FilterSetting> settingList) {
		this.settingsList = settingList;
	}

}
