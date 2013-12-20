package com.smedia.sqzserver.dataservice.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.ResultHandler;

import com.smedia.sqzserver.dataservice.model.WatchFolderDetails;

public interface WatchFolderDetailsMapper {
	
	public List<WatchFolderDetails> selectWatchFolderDetails();
	public List<WatchFolderDetails> selectWatchFolderDetailsPaging(@Param("pageSize") int pageSize, @Param("index") int index);
	public  List<WatchFolderDetails> selectWatchFolderDetailsLikeName(String name);
	public WatchFolderDetails selectWatchFolderDetailsWithId(String watchFolderId);
	
	
	public void selectPlugins(@Param("watchFolderId") String watchFolderId, ResultHandler handler);
	public void selectAttrs(@Param("watchFolderId")String watchFolderId, ResultHandler handler);

	@Select("Select COUNT(*) from WatchFolders")
	public int selectWatchFolderCount();
}
