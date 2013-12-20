package com.smedia.sqzserver.dataservice.dao.base;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.smedia.sqzserver.dataservice.model.base.Servers;
import com.smedia.sqzserver.dataservice.model.base.ServersExample;

public interface ServersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Servers
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    int countByExample(ServersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Servers
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    int deleteByExample(ServersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Servers
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    int deleteByPrimaryKey(String serverId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Servers
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    int insert(Servers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Servers
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    int insertSelective(Servers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Servers
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    List<Servers> selectByExample(ServersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Servers
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    Servers selectByPrimaryKey(String serverId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Servers
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    int updateByExampleSelective(@Param("record") Servers record, @Param("example") ServersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Servers
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    int updateByExample(@Param("record") Servers record, @Param("example") ServersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Servers
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    int updateByPrimaryKeySelective(Servers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Servers
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    int updateByPrimaryKey(Servers record);
}