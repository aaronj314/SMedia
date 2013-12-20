package com.smedia.sqzserver.dataservice.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.smedia.sqzserver.dataservice.model.JobDetails;

public interface JobDetailsMapper {
	public List<JobDetails> selectJobDetails();
	public List<JobDetails> selectJobDetails(@Param("statusStateIds") List<String> statusStateIds);
	public List<JobDetails> selectJobDetailsLikeName(String Name);
	public List<JobDetails> selectJobDetailsPaging(@Param("pageSize") int pageSize, @Param("index") int index);
	public List<JobDetails> selectJobDetailsPaging(@Param("statusStateIds") List<String> statusStateIds, @Param("pageSize") int pageSize, @Param("index") int index);
	public JobDetails selectJobDetailsWithId(String jobId);
	public int selectJobDetailsCount();
	public int selectJobDetailsCount(@Param("statusStateIds") List<String> statusStateIds);
	public float selectAverageEncodeTime();
}
