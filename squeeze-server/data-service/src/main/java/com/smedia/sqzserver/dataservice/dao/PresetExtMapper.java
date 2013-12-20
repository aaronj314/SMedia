package com.smedia.sqzserver.dataservice.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.smedia.sqzserver.dataservice.model.base.Preset;

public interface PresetExtMapper {
	@Select("Select * from Presets LIMIT #{index}, #{pageSize}")
	public List<Preset> selectPresetsPaging(@Param("pageSize") int pageSize, @Param("index") int index);
	
	@Select("Select COUNT(*) from Presets")
	public int selectPresetCount();
}
