package com.smedia.sqzserver.dataservice.dao.base;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.smedia.sqzserver.dataservice.model.base.ApplicationSettings;
import com.smedia.sqzserver.dataservice.model.base.ApplicationSettingsExample;
import com.smedia.sqzserver.dataservice.model.base.ApplicationSettingsKey;

public interface ApplicationSettingsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ApplicationSettings
     *
     * @mbggenerated Mon Feb 06 21:11:44 MST 2012
     */
    int countByExample(ApplicationSettingsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ApplicationSettings
     *
     * @mbggenerated Mon Feb 06 21:11:44 MST 2012
     */
    int deleteByExample(ApplicationSettingsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ApplicationSettings
     *
     * @mbggenerated Mon Feb 06 21:11:44 MST 2012
     */
    int deleteByPrimaryKey(ApplicationSettingsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ApplicationSettings
     *
     * @mbggenerated Mon Feb 06 21:11:44 MST 2012
     */
    int insert(ApplicationSettings record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ApplicationSettings
     *
     * @mbggenerated Mon Feb 06 21:11:44 MST 2012
     */
    int insertSelective(ApplicationSettings record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ApplicationSettings
     *
     * @mbggenerated Mon Feb 06 21:11:44 MST 2012
     */
    List<ApplicationSettings> selectByExample(ApplicationSettingsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ApplicationSettings
     *
     * @mbggenerated Mon Feb 06 21:11:44 MST 2012
     */
    ApplicationSettings selectByPrimaryKey(ApplicationSettingsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ApplicationSettings
     *
     * @mbggenerated Mon Feb 06 21:11:44 MST 2012
     */
    int updateByExampleSelective(@Param("record") ApplicationSettings record, @Param("example") ApplicationSettingsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ApplicationSettings
     *
     * @mbggenerated Mon Feb 06 21:11:44 MST 2012
     */
    int updateByExample(@Param("record") ApplicationSettings record, @Param("example") ApplicationSettingsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ApplicationSettings
     *
     * @mbggenerated Mon Feb 06 21:11:44 MST 2012
     */
    int updateByPrimaryKeySelective(ApplicationSettings record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ApplicationSettings
     *
     * @mbggenerated Mon Feb 06 21:11:44 MST 2012
     */
    int updateByPrimaryKey(ApplicationSettings record);
}