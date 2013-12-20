package com.smedia.sqzserver.dataservice.dao.base;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.smedia.sqzserver.dataservice.model.base.OutputMetadata;
import com.smedia.sqzserver.dataservice.model.base.OutputMetadataExample;

public interface OutputMetadataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OutputMetadata
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    int countByExample(OutputMetadataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OutputMetadata
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    int deleteByExample(OutputMetadataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OutputMetadata
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    int deleteByPrimaryKey(String outputMetadataId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OutputMetadata
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    int insert(OutputMetadata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OutputMetadata
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    int insertSelective(OutputMetadata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OutputMetadata
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    List<OutputMetadata> selectByExample(OutputMetadataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OutputMetadata
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    OutputMetadata selectByPrimaryKey(String outputMetadataId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OutputMetadata
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    int updateByExampleSelective(@Param("record") OutputMetadata record, @Param("example") OutputMetadataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OutputMetadata
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    int updateByExample(@Param("record") OutputMetadata record, @Param("example") OutputMetadataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OutputMetadata
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    int updateByPrimaryKeySelective(OutputMetadata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OutputMetadata
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    int updateByPrimaryKey(OutputMetadata record);
}