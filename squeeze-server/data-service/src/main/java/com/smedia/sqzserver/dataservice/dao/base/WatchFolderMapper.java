package com.smedia.sqzserver.dataservice.dao.base;

import com.smedia.sqzserver.dataservice.model.base.WatchFolder;
import com.smedia.sqzserver.dataservice.model.base.WatchFolderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WatchFolderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WatchFolders
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    int countByExample(WatchFolderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WatchFolders
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    int deleteByExample(WatchFolderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WatchFolders
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    int deleteByPrimaryKey(String watchFolderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WatchFolders
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    int insert(WatchFolder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WatchFolders
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    int insertSelective(WatchFolder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WatchFolders
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    List<WatchFolder> selectByExample(WatchFolderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WatchFolders
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    WatchFolder selectByPrimaryKey(String watchFolderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WatchFolders
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    int updateByExampleSelective(@Param("record") WatchFolder record, @Param("example") WatchFolderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WatchFolders
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    int updateByExample(@Param("record") WatchFolder record, @Param("example") WatchFolderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WatchFolders
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    int updateByPrimaryKeySelective(WatchFolder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WatchFolders
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    int updateByPrimaryKey(WatchFolder record);
}