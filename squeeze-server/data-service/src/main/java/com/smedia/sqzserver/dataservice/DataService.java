package com.smedia.sqzserver.dataservice;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.smedia.sqzserver.dataservice.model.JobDetails;
import com.smedia.sqzserver.dataservice.model.WatchFolderDetails;
import com.smedia.sqzserver.dataservice.model.base.ApplicationSettings;
import com.smedia.sqzserver.dataservice.model.base.ApplicationSettingsExample;
import com.smedia.sqzserver.dataservice.model.base.Destination;
import com.smedia.sqzserver.dataservice.model.base.Job;
import com.smedia.sqzserver.dataservice.model.base.JobOutput;
import com.smedia.sqzserver.dataservice.model.base.JobPreset;
import com.smedia.sqzserver.dataservice.model.base.LicenseKey;
import com.smedia.sqzserver.dataservice.model.base.Metadata;
import com.smedia.sqzserver.dataservice.model.base.OutputMetadata;
import com.smedia.sqzserver.dataservice.model.base.Preset;
import com.smedia.sqzserver.dataservice.model.base.ServerQueue;
import com.smedia.sqzserver.dataservice.model.base.ServerStates;
import com.smedia.sqzserver.dataservice.model.base.Servers;
import com.smedia.sqzserver.dataservice.model.base.Source;
import com.smedia.sqzserver.dataservice.model.base.Status;
import com.smedia.sqzserver.dataservice.model.base.WatchFolder;
import com.smedia.sqzserver.dataservice.model.base.WatchFolderDestination;
import com.smedia.sqzserver.dataservice.model.base.WatchFolderSource;
import com.smedia.sqzserver.dataservice.model.base.WorkflowCategory;

public interface DataService {
	// JobDetails
	public List<JobDetails> fetchJobDetails();
	public List<JobDetails> fetchJobDetails(List<String> statusStateIds);
	public List<JobDetails> fetchJobDetails(int pageSize, int index);
	public List<JobDetails> fetchJobDetails(List<String> statusStateIds, int pageSize, int index);
	public List<JobDetails> fetchJobDetailsLikeName(String name);
	
	public JobDetails fetchJobDetails(String jobId);
	
	public int jobDetailsCount();
	public int jobDetailsCount(List<String> statusStateIds);
	public String createJobForSubmit(JobDetails jobDetails);
	public JobDetails resubmitJob(JobDetails jobDetails);
	public JobDetails createJobDetails(JobDetails jobDetails);
	public float fetchAverageEncodeTime();
	
	//Status
	public List<Status> fetchStatus(String statusId);
	public List<Status> fetchStatusByJobId(String jobId);
	public List<Status> fetchStatus();//TODO:mapper needed
	
	// Preset
	public Preset createPreset(Preset preset);
	public List<Preset> fetchPresets();
	public List<Preset> fetchPresets(int pageSize,int index);
	public List<Preset> fetchPresets(String category);
	public List<WorkflowCategory> fetchPresetCategories();
 	public Preset fetchPreset(String id);
	public List<Preset> fetchPresetsWithXmlData();
	public void deletePreset(String presetId);
	public int getPresetsCount();
	//info/workflow/{workflow}/
	
	//Presets by workflow
	public List<Preset> fetchPresetsByWorkFlow(String workflow);
	public List<Preset> fetchPresetsLikeWorkFlow(String workflow);
	public List<Preset> fetchPresetsLikeName(String name);
	
	// Job
	public List<Job> fetchJobs();
	public Job fetchJob(String jobId);
	public Job createJob(Job job);
	public Job updateJob(Job job);
	public Job updateJobByPrimaryKeySelective(Job job);
	public Job updateJobStartTime(String jobId, Date startTime);
	public Job updateJobFinishTime(String jobId, Date finishTime);
	public void deleteJob(String jobId);
	
	public List<Destination> fetchDetinationsByJobId(String jobId);
	public List<Destination> fetchDetinationsByJobIdAndDestionationId(String jobId,String destinationId);
	
	//job metadata
	public Metadata fetchJobMetadata(String jobId);
	public OutputMetadata fetchJobOutputMetaData(String jobId);
	
	
	// Destinations
	public Destination createDestination(Destination dest);
	public List<Destination>fetchDestinations();
	public Destination fetchDestination(String destinationId);
	public Destination updateDestination(Destination destination);
	public void deleteDestination(String destinationId);
	
	// JobPreset
	public JobPreset createJobPreset(JobPreset jobPreset);
	public List<JobPreset> fetchJobPresetsForJob(String jobId);
	public JobPreset updateJobPreset(JobPreset job);
	public void deleteJobPreset(String jobId);
	
	// Source
	public Source createSource(Source source);
	public List<Source> fetchSource();
	public Source fetchSource(String sourceId);
	public Source updateSource(Source source);
	public void deleteSource(String sourceId);
	public List<Source> fetchSourcesForJob(String jobId);
	public List<Source> fetchSourcesForJobAndSourceId(String jobId,String sourceId);
	
	//WatchFolder
	public List<WatchFolder>fetchWatchFolders();
	public WatchFolder fetchWatchFolder(String folderId);
	public WatchFolder createWatchFolder(WatchFolder watchFolder);
	public WatchFolder updateWatchFolder(WatchFolder watchFolder);
	public void updateWatchFolderSelectiveById(WatchFolder watchFolder);
	public void deleteWatchFolder(String folderId);
	public List<Destination>fetchDestinationsForWatchFolder(String folderId);
	public Destination fetchWatchFolderByDestinationId(String folderId,String destinationId);
	public List<JobPreset> fetchWatchFolderPresets(String folderId);
	public JobPreset fetchWatchFolderPresetsById(String folderId, String presetId);
	public int getWatchCount();
	
	public WatchFolderSource createWatchFolderSource(WatchFolderSource source);
	
	public WatchFolderDestination createWatchFolderDestination(WatchFolderDestination destination);
	
	public List<WatchFolderDetails> fetchWatchFolderDetails();
	public WatchFolderDetails fetchWatchFolderDetails(String folderId);
	public List<WatchFolderDetails> fetchWatchFolderDetails(int pageSize, int index);
	public WatchFolderDetails createWatchFolderDetail(WatchFolderDetails watchFolderDetails);
	public WatchFolderDetails updateWatchFolderDetail(WatchFolderDetails watchFolderDetails);
	public void deleteWatchFolderDetails(String folderId);
	public List<Source> fetchWatchFolderSources(String folderId);
	public List<Source> fetchWatchFolderSources(String folderId,String sourceId);
	
	
	//queues
	public List<ServerQueue> fetchSeverQueueList();
	public ServerQueue fetchServerQueue(String serverId);
	public List<ServerQueue> fetchServerQueues(String id);
	public ServerQueue createServerQueue(ServerQueue q);
	public ServerQueue updateServerQueue(ServerQueue q);
	public void deleteServerQueue(String id);
	
	//Servers
	public List<Servers>  fetchServerList();
	public List<Servers>  fetchServerListByQueueId(String queueId );
	
	
	//Job Queue
	public int fetchJobQueuesCount(List<String> queueIds);
	
	//Server Statuses
	public ServerStates fetchServerState(Integer serverStateId);
	//Server Queue
	public List<ServerQueue> fetchServerQueueList(String serverId);
	
	//Job Output
	public JobOutput createJobOutput(JobOutput output);
	public List<JobOutput>fetchJobOutput();
	public JobOutput fetchJobOutput(String outputId);
	public JobOutput updateJobOutput(JobOutput output);
	public void deleteJobOutput(String outputId);
	
	
	//Metadata
	public Metadata createMetadata(Metadata metadata);
	public List<Metadata>fetchMetadata();
	public Metadata fetchMetadata(String  metadataId);
	public Metadata updateMetadata(Metadata metadata);
	public void deleteMetadata(String metadataId);
	List<WatchFolderDetails> fetchWatchFolderDetailsLikeName(String Name);
	
	// ApplicationSettings
	public ApplicationSettings fetchApplicationSetting(String name);
	public ApplicationSettings fetchApplicationSettingById(String name);
	public List<ApplicationSettings> fetchApplicationSettingsList();
	public ApplicationSettings createApplicationSetting(ApplicationSettings a);
	public ApplicationSettings updateApplicationSetting(ApplicationSettings a);
	
	// LicenseKey
	public LicenseKey createLicenseKey(String keyStr, String company);
	public void deleteLicenseKey(String keyId);
	public LicenseKey fetchCurrentKey();
	
	
	
}
