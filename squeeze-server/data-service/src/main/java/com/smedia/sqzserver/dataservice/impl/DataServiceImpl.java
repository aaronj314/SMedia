package com.smedia.sqzserver.dataservice.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.smedia.sqzserver.dataservice.DataService;
import com.smedia.sqzserver.dataservice.dao.JobDetailsMapper;
import com.smedia.sqzserver.dataservice.dao.PresetExtMapper;
import com.smedia.sqzserver.dataservice.dao.WatchFolderDetailsMapper;
import com.smedia.sqzserver.dataservice.dao.base.ApplicationSettingsMapper;
import com.smedia.sqzserver.dataservice.dao.base.DestinationMapper;
import com.smedia.sqzserver.dataservice.dao.base.JobMapper;
import com.smedia.sqzserver.dataservice.dao.base.JobOutputMapper;
import com.smedia.sqzserver.dataservice.dao.base.JobPresetMapper;
import com.smedia.sqzserver.dataservice.dao.base.JobQueuesMapper;
import com.smedia.sqzserver.dataservice.dao.base.LicenseKeyMapper;
import com.smedia.sqzserver.dataservice.dao.base.MetadataMapper;
import com.smedia.sqzserver.dataservice.dao.base.OutputMetadataMapper;
import com.smedia.sqzserver.dataservice.dao.base.PresetMapper;
import com.smedia.sqzserver.dataservice.dao.base.ServerQueueMapper;
import com.smedia.sqzserver.dataservice.dao.base.ServerStatesMapper;
import com.smedia.sqzserver.dataservice.dao.base.ServersMapper;
import com.smedia.sqzserver.dataservice.dao.base.SourceMapper;
import com.smedia.sqzserver.dataservice.dao.base.StatusMapper;
import com.smedia.sqzserver.dataservice.dao.base.WatchFolderAttrMapper;
import com.smedia.sqzserver.dataservice.dao.base.WatchFolderDestinationMapper;
import com.smedia.sqzserver.dataservice.dao.base.WatchFolderMapper;
import com.smedia.sqzserver.dataservice.dao.base.WatchFolderPluginMapper;
import com.smedia.sqzserver.dataservice.dao.base.WatchFolderPresetMapper;
import com.smedia.sqzserver.dataservice.dao.base.WatchFolderSourceMapper;
import com.smedia.sqzserver.dataservice.dao.base.WorkflowCategoryMapper;
import com.smedia.sqzserver.dataservice.model.JobDetails;
import com.smedia.sqzserver.dataservice.model.WatchFolderDetails;
import com.smedia.sqzserver.dataservice.model.WatchFolderMapHandler;
import com.smedia.sqzserver.dataservice.model.base.ApplicationSettings;
import com.smedia.sqzserver.dataservice.model.base.ApplicationSettingsExample;
import com.smedia.sqzserver.dataservice.model.base.Destination;
import com.smedia.sqzserver.dataservice.model.base.DestinationExample;
import com.smedia.sqzserver.dataservice.model.base.Job;
import com.smedia.sqzserver.dataservice.model.base.JobExample;
import com.smedia.sqzserver.dataservice.model.base.JobOutput;
import com.smedia.sqzserver.dataservice.model.base.JobOutputExample;
import com.smedia.sqzserver.dataservice.model.base.JobPreset;
import com.smedia.sqzserver.dataservice.model.base.JobPresetExample;
import com.smedia.sqzserver.dataservice.model.base.JobQueuesExample;
import com.smedia.sqzserver.dataservice.model.base.JobQueuesExample.Criteria;
import com.smedia.sqzserver.dataservice.model.base.LicenseKey;
import com.smedia.sqzserver.dataservice.model.base.LicenseKeyExample;
import com.smedia.sqzserver.dataservice.model.base.Metadata;
import com.smedia.sqzserver.dataservice.model.base.MetadataExample;
import com.smedia.sqzserver.dataservice.model.base.OutputMetadata;
import com.smedia.sqzserver.dataservice.model.base.Preset;
import com.smedia.sqzserver.dataservice.model.base.PresetExample;
import com.smedia.sqzserver.dataservice.model.base.ServerQueue;
import com.smedia.sqzserver.dataservice.model.base.ServerQueueExample;
import com.smedia.sqzserver.dataservice.model.base.ServerStates;
import com.smedia.sqzserver.dataservice.model.base.Servers;
import com.smedia.sqzserver.dataservice.model.base.ServersExample;
import com.smedia.sqzserver.dataservice.model.base.Source;
import com.smedia.sqzserver.dataservice.model.base.SourceExample;
import com.smedia.sqzserver.dataservice.model.base.Status;
import com.smedia.sqzserver.dataservice.model.base.StatusExample;
import com.smedia.sqzserver.dataservice.model.base.WatchFolder;
import com.smedia.sqzserver.dataservice.model.base.WatchFolderAttr;
import com.smedia.sqzserver.dataservice.model.base.WatchFolderAttrExample;
import com.smedia.sqzserver.dataservice.model.base.WatchFolderDestination;
import com.smedia.sqzserver.dataservice.model.base.WatchFolderDestinationExample;
import com.smedia.sqzserver.dataservice.model.base.WatchFolderExample;
import com.smedia.sqzserver.dataservice.model.base.WatchFolderPlugin;
import com.smedia.sqzserver.dataservice.model.base.WatchFolderPluginExample;
import com.smedia.sqzserver.dataservice.model.base.WatchFolderPreset;
import com.smedia.sqzserver.dataservice.model.base.WatchFolderSource;
import com.smedia.sqzserver.dataservice.model.base.WorkflowCategory;

public class DataServiceImpl implements DataService {

	private JobDetailsMapper jobDetailsMapper;

	private ServerQueueMapper serverQueueMapper;
	private PresetMapper presetMapper;
	private JobMapper jobMapper;
	private DestinationMapper destinationMapper;
	private SourceMapper sourceMapper;
	private JobPresetMapper jobPresetMapper;
	private WatchFolderMapper watchFolderMapper;
	private WatchFolderDetailsMapper watchFolderDetailsMapper;
	private WatchFolderSourceMapper watchFolderSourceMapper;
	private WatchFolderDestinationMapper watchFolderDestinationMapper;
	private WatchFolderPresetMapper watchFolderPresetMapper;
	private WatchFolderAttrMapper watchFolderAttrMapper;
	private WatchFolderPluginMapper watchFolderPluginMapper;
	private PresetExtMapper presetExtMapper;

	private StatusMapper statusMapper;
	private MetadataMapper metadataMapper;
	private JobOutputMapper jobOutputMapper;
	private OutputMetadataMapper outputMetaDataMapper;
	private ApplicationSettingsMapper applicationSettingsMapper;
	private ServersMapper serversMapper;
	private JobQueuesMapper jobQueuesMapper;
	private ServerStatesMapper serverStatesMapper;
	private WorkflowCategoryMapper workflowCategoryMapper;
	private LicenseKeyMapper licenseKeyMapper;

	
	public void setLicenseKeyMapper(LicenseKeyMapper licenseKeyMapper) {
		this.licenseKeyMapper = licenseKeyMapper;
	}

	public void setPresetExtMapper(PresetExtMapper presetExtMapper) {
		this.presetExtMapper = presetExtMapper;
	}

	public void setWatchFolderAttrMapper(WatchFolderAttrMapper watchFolderAttrMapper) {
		this.watchFolderAttrMapper = watchFolderAttrMapper;
	}

	public void setWatchFolderPluginMapper(WatchFolderPluginMapper watchFolderPluginMapper) {
		this.watchFolderPluginMapper = watchFolderPluginMapper;
	}

	public void setWatchFolderSourceMapper(WatchFolderSourceMapper watchFolderSourceMapper) {
		this.watchFolderSourceMapper = watchFolderSourceMapper;
	}

	public void setWatchFolderDestinationMapper(WatchFolderDestinationMapper watchFolderDestinationMapper) {
		this.watchFolderDestinationMapper = watchFolderDestinationMapper;
	}

	public void setWatchFolderPresetMapper(WatchFolderPresetMapper watchFolderPresetMapper) {
		this.watchFolderPresetMapper = watchFolderPresetMapper;
	}

	public StatusMapper getStatusMapper() {
		return statusMapper;
	}

	public void setStatusMapper(StatusMapper statusMapper) {
		this.statusMapper = statusMapper;
	}

	public DataServiceImpl() {
	}

	public void setJobDetailsMapper(JobDetailsMapper jobDetailsMapper) {
		this.jobDetailsMapper = jobDetailsMapper;
	}

	public void setJobMapper(JobMapper jobMapper) {
		this.jobMapper = jobMapper;
	}

	public void setServerQueueMapper(ServerQueueMapper m) {
		this.serverQueueMapper = m;
	}

	public void setPresetMapper(PresetMapper presetMapper) {
		this.presetMapper = presetMapper;
	}

	public void setJobPresetMapper(JobPresetMapper jobPresetMapper) {
		this.jobPresetMapper = jobPresetMapper;
	}

	public void setDestinationMapper(DestinationMapper destinationMapper) {
		this.destinationMapper = destinationMapper;
	}

	public void setSourceMapper(SourceMapper sourceMapper) {
		this.sourceMapper = sourceMapper;
	}

	public ApplicationSettingsMapper getApplicationSettingsMapper() {
		return applicationSettingsMapper;
	}

	public void setApplicationSettingsMapper(ApplicationSettingsMapper applicationSettingsMapper) {
		this.applicationSettingsMapper = applicationSettingsMapper;
	}

	public ServersMapper getServersMapper() {
		return serversMapper;
	}

	public void setServersMapper(ServersMapper serversMapper) {
		this.serversMapper = serversMapper;
	}

	public JobQueuesMapper getJobQueuesMapper() {
		return jobQueuesMapper;
	}

	public void setJobQueuesMapper(JobQueuesMapper jobQueuesMapper) {
		this.jobQueuesMapper = jobQueuesMapper;
	}

	public ServerStatesMapper getServerStatesMapper() {
		return serverStatesMapper;
	}

	public void setServerStatesMapper(ServerStatesMapper serverStatesMapper) {
		this.serverStatesMapper = serverStatesMapper;
	}

	public WatchFolderDetailsMapper getWatchFolderDetailsMapper() {
		return watchFolderDetailsMapper;
	}

	public void setWatchFolderDetailsMapper(WatchFolderDetailsMapper watchFolderDetailsMapper) {
		this.watchFolderDetailsMapper = watchFolderDetailsMapper;
	}

	@Override
	public List<JobDetails> fetchJobDetails() {
		return jobDetailsMapper.selectJobDetails();
	}

	@Override
	public List<JobDetails> fetchJobDetails(List<String> statusStateIds) {
		return jobDetailsMapper.selectJobDetails(statusStateIds);
	}

	@Override
	public List<JobDetails> fetchJobDetails(int pageSize, int index) {
		return jobDetailsMapper.selectJobDetailsPaging(pageSize, index);
	}

	@Override
	public List<JobDetails> fetchJobDetails(List<String> statusStateIds, int pageSize, int index) {
		return jobDetailsMapper.selectJobDetailsPaging(statusStateIds, pageSize, index);
	}

	@Override
	public int jobDetailsCount() {
		return jobDetailsMapper.selectJobDetailsCount();
	}

	@Override
	public int jobDetailsCount(List<String> statusStateIds) {
		return jobDetailsMapper.selectJobDetailsCount(statusStateIds);
	}

	@Override
	public JobDetails fetchJobDetails(String jobId) {
		return jobDetailsMapper.selectJobDetailsWithId(jobId);
	}

	@Override
	public float fetchAverageEncodeTime() {
		return jobDetailsMapper.selectAverageEncodeTime();
	}

	@Override
	public String createJobForSubmit(JobDetails jobDetails) {
		Job job = createJob(jobDetails);
		JobPreset preset = jobDetails.getJobPreset();
		preset.setJobId(job.getJobId());
		createJobPreset(preset);

		Source source = jobDetails.getSource();
		source.setJobId(job.getJobId());
		createSource(source);

		//Destination dests = jobDetails.getDestination();
		List<Destination> dests = jobDetails.getDestinations();
		
		for (Destination destination : dests) {
			destination.setJobId(job.getJobId());
			createDestination(destination);
		}
		
		return job.getJobId();
	}
	
	@Override
	public JobDetails resubmitJob(JobDetails job) {
		job.setPercentCompleteOverall(0.0f);
		job.setTimeSubmitted(new Date());
		job.setTimeStarted(new Date());
		job.setTimeFinished(null);
		job.setStatusMessage("Restarted");
		job.setStatusName("Restarted");
		job.setErrorCode(null);
		job.setStatusStateId(1);
		job.setTimeSubmitted(new Date());
		updateJobByPrimaryKeySelective(job);
		
		Source s = job.getSource();
		sourceMapper.updateByPrimaryKeySelective(s);
		
		JobPreset p = job.getJobPreset();
		jobPresetMapper.updateByPrimaryKeySelective(p);
		
		//Destination d = job.getDestination();
		//destinationMapper.updateByPrimaryKeySelective(d);
		List<Destination> dests = job.getDestinations();
		
		for (Destination destination : dests) {
			destinationMapper.updateByPrimaryKeySelective(destination);
		}
		
		return job;
	}

	@Override
	public JobDetails createJobDetails(JobDetails jobDetails) {
		Job job = createJob(jobDetails);
		JobPreset preset = jobDetails.getJobPreset();
		preset.setJobId(job.getJobId());
		createJobPreset(preset);

		Source source = jobDetails.getSource();
		source.setJobId(job.getJobId());
		createSource(source);

		//Destination dests = jobDetails.getDestination();
		//dests.setJobId(job.getJobId());
		//createDestination(dests);
		List<Destination> dests = jobDetails.getDestinations();
		
		for (Destination destination : dests) {
			destination.setJobId(job.getJobId());
			createDestination(destination);
		}

		return jobDetails;
	}

	@Override
	public Preset fetchPreset(String id) {
		// PresetExample e = new PresetExample();
		// e.createCriteria().andPresetIdEqualTo(id);
		return presetMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Preset> fetchPresets() {
		PresetExample e = new PresetExample();
		e.createCriteria().andPresetIdIsNotNull();
		List<Preset> list = presetMapper.selectByExample(e);
		return list;
	}

	@Override
	public List<Preset> fetchPresetsWithXmlData() {
		PresetExample e = new PresetExample();
		e.createCriteria().andPresetIdIsNotNull();
		List<Preset> list = presetMapper.selectByExampleWithBLOBs(e);
		return list;
	}

	@Override
	public List<Job> fetchJobs() {
		JobExample e = new JobExample();
		e.createCriteria().andJobIdIsNotNull();
		return jobMapper.selectByExample(e);
	}

	@Override
	public Job fetchJob(String jobId) {
		return jobMapper.selectByPrimaryKey(jobId);
	}

	@Override
	public Job createJob(Job job) {
		UUID uuid = UUID.randomUUID();
		job.setJobId(uuid.toString());
		job.setPercentCompleteOverall(0.0f);
		job.setStatusStateId(1);
		job.setTimeSubmitted(new Date());
		jobMapper.insert(job);
		return jobMapper.selectByPrimaryKey(job.getJobId());
	}

	@Override
	public Destination createDestination(Destination dest) {
		UUID uuid = UUID.randomUUID();
		dest.setDestinationId(uuid.toString());
		destinationMapper.insert(dest);
		return destinationMapper.selectByPrimaryKey(dest.getDestinationId());
	}

	@Override
	public Source createSource(Source source) {
		UUID uuid = UUID.randomUUID();
		source.setSourceId(uuid.toString());
		sourceMapper.insert(source);
		return sourceMapper.selectByPrimaryKey(source.getSourceId());
	}

	@Override
	public JobPreset createJobPreset(JobPreset jobPreset) {
		UUID uuid = UUID.randomUUID();
		jobPreset.setJobPresetId(uuid.toString());
		
		Preset p = presetMapper.selectByPrimaryKey(jobPreset.getPresetId());
		
		jobPreset.setName(p.getName());
		
		jobPresetMapper.insert(jobPreset);
		return jobPresetMapper.selectByPrimaryKey(jobPreset.getJobPresetId());

	}

	public WatchFolderMapper getWatchFolderMapper() {
		return watchFolderMapper;
	}

	public void setWatchFolderMapper(WatchFolderMapper watchFolderMapper) {
		this.watchFolderMapper = watchFolderMapper;
	}

	@Override
	public List<WatchFolder> fetchWatchFolders() {
		WatchFolderExample wfe = new WatchFolderExample();
		wfe.createCriteria().andWatchFolderIdIsNotNull();
		return watchFolderMapper.selectByExample(wfe);
	}

	@Override
	public WatchFolder fetchWatchFolder(String folderId) {
		return watchFolderMapper.selectByPrimaryKey(folderId);
	}

	@Override
	public WatchFolder createWatchFolder(WatchFolder watchFolder) {
		UUID uuid = UUID.randomUUID();
		watchFolder.setWatchFolderId(uuid.toString());
		watchFolderMapper.insert(watchFolder);
		return watchFolderMapper.selectByPrimaryKey(watchFolder.getWatchFolderId());
	}

	@Override
	public void updateWatchFolderSelectiveById(WatchFolder watchFolder) {
		watchFolderMapper.updateByPrimaryKeySelective(watchFolder);

	}

	@Override
	public WatchFolder updateWatchFolder(WatchFolder watchFolder) {
		watchFolderMapper.updateByPrimaryKey(watchFolder);
		return watchFolderMapper.selectByPrimaryKey(watchFolder.getWatchFolderId());
	}

	@Override
	public void deleteWatchFolder(String folderId) {
		watchFolderMapper.deleteByPrimaryKey(folderId);
	}

	@Override
	public List<Destination> fetchDestinations() {
		DestinationExample e = new DestinationExample();
		e.createCriteria().andCreatedIsNotNull();
		return destinationMapper.selectByExample(e);
	}

	@Override
	public Destination fetchDestination(String destinationId) {
		return destinationMapper.selectByPrimaryKey(destinationId);
	}

	@Override
	public Destination updateDestination(Destination destination) {
		destinationMapper.updateByPrimaryKey(destination);
		return destinationMapper.selectByPrimaryKey(destination.getWatchFolderId());
	}

	public OutputMetadataMapper getOutputMetaDataMapper() {
		return outputMetaDataMapper;
	}

	public void setOutputMetaDataMapper(OutputMetadataMapper outputMetaDataMapper) {
		this.outputMetaDataMapper = outputMetaDataMapper;
	}

	@Override
	public void deleteDestination(String destinationId) {
		destinationMapper.deleteByPrimaryKey(destinationId);
	}

	@Override
	public Source fetchSource(String sourceId) {
		return sourceMapper.selectByPrimaryKey(sourceId);
	}

	@Override
	public void deleteSource(String sourceId) {
		sourceMapper.deleteByPrimaryKey(sourceId);
	}

	@Override
	public Source updateSource(Source source) {
		sourceMapper.updateByPrimaryKey(source);
		return sourceMapper.selectByPrimaryKey(source.getWatchFolderId());
	}

	@Override
	public List<Source> fetchSource() {
		SourceExample e = new SourceExample();
		e.createCriteria().andSourceIdIsNotNull();
		List<Source> list = sourceMapper.selectByExample(e);
		return list;
	}

	@Override
	public Preset createPreset(Preset preset) {
		UUID uuid = UUID.randomUUID();
		preset.setPresetId(uuid.toString());
		presetMapper.insert(preset);
		return presetMapper.selectByPrimaryKey(preset.getPresetId());

	}

	@Override
	public void deletePreset(String presetId) {
		presetMapper.deleteByPrimaryKey(presetId);

	}

	@Override
	public List<Destination> fetchDestinationsForWatchFolder(String folderId) {
		DestinationExample e = new DestinationExample();
		e.createCriteria().andWatchFolderIdEqualTo(folderId);
		return destinationMapper.selectByExample(e);
	}

	@Override
	public List<Status> fetchStatus(String statusId) {
		StatusExample e = new StatusExample();
		e.createCriteria().andStatusIdEqualTo(statusId);
		return statusMapper.selectByExample(e);
	}

	@Override
	public Destination fetchWatchFolderByDestinationId(String folderId, String destinationId) {
		return destinationMapper.selectByPrimaryKey(destinationId);
	}

	@Override
	public List<JobPreset> fetchWatchFolderPresets(String folderId) {
		JobPresetExample e = new JobPresetExample();
		e.createCriteria().andWatchFolderIdEqualTo(folderId);
		return jobPresetMapper.selectByExample(e);
	}

	@Override
	public JobPreset fetchWatchFolderPresetsById(String folderId, String presetId) {
		return jobPresetMapper.selectByPrimaryKey(presetId);
	}

	@Override
	public List<Source> fetchSourcesForJob(String jobId) {
		SourceExample e = new SourceExample();
		e.createCriteria().andJobIdEqualTo(jobId);
		return sourceMapper.selectByExample(e);
	}

	@Override
	public List<JobPreset> fetchJobPresetsForJob(String jobId) {
		JobPresetExample e = new JobPresetExample();
		e.createCriteria().andJobIdEqualTo(jobId);
		return jobPresetMapper.selectByExample(e);
	}

	@Override
	public void deleteJobPreset(String jobId) {
		jobPresetMapper.deleteByPrimaryKey(jobId);
	}

	@Override
	public List<Destination> fetchDetinationsByJobId(String jobId) {
		DestinationExample e = new DestinationExample();
		e.createCriteria().andJobIdEqualTo(jobId);
		return destinationMapper.selectByExample(e);
	}

	@Override
	public List<Destination> fetchDetinationsByJobIdAndDestionationId(String jobId, String destinationId) {
		DestinationExample e = new DestinationExample();
		e.createCriteria().andDestinationIdEqualTo(destinationId).andJobIdEqualTo(jobId);
		return destinationMapper.selectByExample(e);
	}

	@Override
	public List<Source> fetchSourcesForJobAndSourceId(String jobId, String sourceId) {
		SourceExample e = new SourceExample();
		e.createCriteria().andJobIdEqualTo(jobId).andSourceIdEqualTo(sourceId);
		return sourceMapper.selectByExample(e);
	}

	@Override
	public List<Status> fetchStatusByJobId(String jobId) {
		StatusExample e = new StatusExample();
		e.createCriteria().andJobIdEqualTo(jobId);
		return statusMapper.selectByExample(e);
	}

	@Override
	public List<Status> fetchStatus() {
		StatusExample e = new StatusExample();
		e.createCriteria().andJobIdIsNotNull();
		return statusMapper.selectByExample(e);
	}

	@Override
	public List<Preset> fetchPresetsByWorkFlow(String workflow) {
		PresetExample e = new PresetExample();
		e.createCriteria().andWorkflowEqualTo(workflow);
		return presetMapper.selectByExample(e);
	}

	@Override
	public Metadata fetchJobMetadata(String jobId) {
		return metadataMapper.selectByPrimaryKey(jobId);
	}

	@Override
	public OutputMetadata fetchJobOutputMetaData(String jobId) {
		return outputMetaDataMapper.selectByPrimaryKey(jobId);
	}

	public JobOutputMapper getJobOutputMapper() {
		return jobOutputMapper;
	}

	public void setJobOutputMapper(JobOutputMapper jobOutputMapper) {
		this.jobOutputMapper = jobOutputMapper;
	}

	@Override
	public List<ServerQueue> fetchSeverQueueList() {
		ServerQueueExample e = new ServerQueueExample();
		e.createCriteria().andQueueIdIsNotNull();
		return serverQueueMapper.selectByExample(e);
	}

	@Override
	public List<ServerQueue> fetchServerQueues(String ServerId) {
		ServerQueueExample e = new ServerQueueExample();
		e.createCriteria().andServerIdEqualTo(ServerId);
		return serverQueueMapper.selectByExample(e);
	}

	@Override
	public ServerQueue fetchServerQueue(String id) {

		return serverQueueMapper.selectByPrimaryKey(id);
	}

	@Override
	public ServerQueue createServerQueue(ServerQueue q) {
		serverQueueMapper.insert(q);
		return q;
	}

	@Override
	public ServerQueue updateServerQueue(ServerQueue q) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteServerQueue(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Job updateJob(Job job) {
		this.jobMapper.updateByPrimaryKey(job);
		return jobMapper.selectByPrimaryKey(job.getJobId());
	}
	
	@Override
	public Job updateJobStartTime(String jobId, Date startTime) {
		Job job = new Job();
		job.setJobId(jobId);
		job.setTimeStarted(startTime);
		return updateJobByPrimaryKeySelective(job);
	}
	
	@Override
	public Job updateJobFinishTime(String jobId, Date finishTime) {
		Job job = new Job();
		job.setJobId(jobId);
		job.setTimeFinished(finishTime);
		return updateJobByPrimaryKeySelective(job);
	}

	@Override
	public Job updateJobByPrimaryKeySelective(Job job) {
		this.jobMapper.updateByPrimaryKeySelective(job);
		return job;
	}

	@Override
	public void deleteJob(String jobId) {
		this.jobMapper.deleteByPrimaryKey(jobId);
	}

	@Override
	public JobPreset updateJobPreset(JobPreset job) {
		this.jobPresetMapper.updateByPrimaryKey(job);
		return jobPresetMapper.selectByPrimaryKey(job.getJobId());
	}

	@Override
	public List<Servers> fetchServerList() {
		ServersExample example = new ServersExample();
		List<Servers> list = serversMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<Servers> fetchServerListByQueueId(String queueId) {
		ServerQueueExample serverQueueExample = new ServerQueueExample();
		serverQueueExample.createCriteria().andQueueIdEqualTo(queueId);
		List<ServerQueue> listSereverQueue = this.serverQueueMapper.selectByExample(serverQueueExample);
		ServersExample example = new ServersExample();
		List<String> serverStrings = new ArrayList<String>();
		;
		for (ServerQueue serverQueue : listSereverQueue) {
			serverStrings.add(serverQueue.getServerId());
		}
		example.createCriteria().andServerIdIn(serverStrings);
		List<Servers> list = serversMapper.selectByExample(example);
		return list;
	}

	@Override
	public int fetchJobQueuesCount(List<String> queueIds) {
		JobQueuesExample example = new JobQueuesExample();
		Criteria criteria = example.createCriteria();
		criteria.andQueueIdIn(queueIds);
		return this.jobQueuesMapper.countByExample(example);
	}

	@Override
	public List<ServerQueue> fetchServerQueueList(String serverId) {
		ServerQueueExample queueExample = new ServerQueueExample();
		queueExample.createCriteria().andServerIdEqualTo(serverId);
		List<ServerQueue> queueList = this.serverQueueMapper.selectByExample(queueExample);
		return queueList;
	}

	@Override
	public ServerStates fetchServerState(Integer serverStateId) {
		return this.serverStatesMapper.selectByPrimaryKey(serverStateId);
	}

	@Override
	public List<Preset> fetchPresetsLikeWorkFlow(String workflow) {
		PresetExample e = new PresetExample();
		e.createCriteria().andWorkflowLike(workflow);
		return presetMapper.selectByExample(e);
	}

	@Override
	public List<Source> fetchWatchFolderSources(String folderId) {
		SourceExample e = new SourceExample();
		e.createCriteria().andWatchFolderIdEqualTo(folderId);
		return sourceMapper.selectByExample(e);
	}

	@Override
	public List<Source> fetchWatchFolderSources(String folderId, String sourceId) {
		SourceExample e = new SourceExample();
		e.createCriteria().andWatchFolderIdEqualTo(folderId);
		e.createCriteria().andSourceIdEqualTo(sourceId);
		return sourceMapper.selectByExample(e);
	}

	@Override
	public List<WatchFolderDetails> fetchWatchFolderDetails() {
		List<WatchFolderDetails> list = watchFolderDetailsMapper.selectWatchFolderDetails();
		
		for (WatchFolderDetails watchFolderDetails : list) {
			WatchFolderMapHandler h = new WatchFolderMapHandler();
			watchFolderDetailsMapper.selectPlugins(watchFolderDetails.getWatchFolderId(), h);
			watchFolderDetailsMapper.selectAttrs(watchFolderDetails.getWatchFolderId(), h);
			watchFolderDetails.setPhaseListeners(h.pluginMap);
			watchFolderDetails.setAttributes(h.attrMap);
		}

		return list;
	}
	
	
	@Override
	public List<WatchFolderDetails> fetchWatchFolderDetailsLikeName(String name) {
		List<WatchFolderDetails> list = watchFolderDetailsMapper.selectWatchFolderDetailsLikeName(name);
		
		for (WatchFolderDetails watchFolderDetails : list) {
			WatchFolderMapHandler h = new WatchFolderMapHandler();
			watchFolderDetailsMapper.selectPlugins(watchFolderDetails.getWatchFolderId(), h);
			watchFolderDetailsMapper.selectAttrs(watchFolderDetails.getWatchFolderId(), h);
			watchFolderDetails.setPhaseListeners(h.pluginMap);
			watchFolderDetails.setAttributes(h.attrMap);
			
		}

		return list;
	}
	

	@Override
	public WatchFolderDetails fetchWatchFolderDetails(String folderId) {
		WatchFolderDetails watchFolderDetails  = watchFolderDetailsMapper.selectWatchFolderDetailsWithId(folderId);
		WatchFolderMapHandler h = new WatchFolderMapHandler();
		watchFolderDetailsMapper.selectPlugins(watchFolderDetails.getWatchFolderId(), h);
		watchFolderDetailsMapper.selectAttrs(watchFolderDetails.getWatchFolderId(), h);
		watchFolderDetails.setPhaseListeners(h.pluginMap);
		watchFolderDetails.setAttributes(h.attrMap);
		
		watchFolderDetailsMapper.selectAttrs(watchFolderDetails.getWatchFolderId(), h);
		
		
		
		return watchFolderDetails;
	}
	
	@Override
	public void deleteWatchFolderDetails(String folderId) {
		WatchFolderDetails f = watchFolderDetailsMapper.selectWatchFolderDetailsWithId(folderId);
		
		List<WatchFolderDestination> ds = f.getDestinations();
		for (WatchFolderDestination wd : ds) {
			watchFolderDestinationMapper.deleteByPrimaryKey(wd.getDestinationId());
		}
		
		WatchFolderSource s = f.getSource();
		watchFolderSourceMapper.deleteByPrimaryKey(s.getSourceId());
		
		WatchFolderPreset presets = f.getJobPreset();
		watchFolderPresetMapper.deleteByPrimaryKey(presets.getWatchFolderPresetId());
		
		WatchFolderAttrExample e1 = new WatchFolderAttrExample();
		e1.createCriteria().andWatchFolderIdEqualTo(f.getWatchFolderId());
		watchFolderAttrMapper.deleteByExample(e1);
		
		WatchFolderPluginExample e2 = new WatchFolderPluginExample();
		e2.createCriteria().andWatchFolderIdEqualTo(f.getWatchFolderId());
		watchFolderPluginMapper.deleteByExample(e2);
		
		watchFolderMapper.deleteByPrimaryKey(f.getWatchFolderId());
		
	}

	@Override
	public WatchFolderDetails createWatchFolderDetail(WatchFolderDetails watchFolderDetails) {
		WatchFolder watchFolder = createWatchFolder(watchFolderDetails);

		WatchFolderPreset presets = watchFolderDetails.getJobPreset();
		presets.setWatchFolderId(watchFolder.getWatchFolderId());
		// createJobPreset(presets);
		UUID uuid = UUID.randomUUID();
		presets.setWatchFolderPresetId(uuid.toString());
		watchFolderPresetMapper.insert(presets);

		WatchFolderSource source = watchFolderDetails.getSource();
		source.setWatchFolderId(watchFolder.getWatchFolderId());
		createWatchFolderSource(source);

		List<WatchFolderDestination> dests = watchFolderDetails.getDestinations();
		
		for (WatchFolderDestination wd : dests) {
			wd.setWatchFolderId(watchFolder.getWatchFolderId());
			createWatchFolderDestination(wd);
		}
		
		

		Map<String, String> attrs = watchFolderDetails.getAttributes();

		if (attrs != null) {
			for (String key : attrs.keySet()) {
				String attr = attrs.get(key);
				WatchFolderAttr wa = new WatchFolderAttr();
				wa.setName(key);
				wa.setValue(attr);
				uuid = UUID.randomUUID();
				wa.setAttributeId(uuid.toString());
				wa.setWatchFolderId(watchFolder.getWatchFolderId());
				watchFolderAttrMapper.insert(wa);
			}
		}

		Map<String, String> phaseListeners = watchFolderDetails.getPhaseListeners();
		if (phaseListeners != null) {
			for (String key : phaseListeners.keySet()) {
				String p = phaseListeners.get(key);
				WatchFolderPlugin wp = new WatchFolderPlugin();
				wp.setPluginId(UUID.randomUUID().toString());
				wp.setPhaseType(key);
				wp.setPluginType(p);
				wp.setWatchFolderId(watchFolder.getWatchFolderId());
				watchFolderPluginMapper.insert(wp);
			}
		}
		return fetchWatchFolderDetails(watchFolder.getWatchFolderId());

	}

	@Override
	public WatchFolderDetails updateWatchFolderDetail(WatchFolderDetails watchFolderDetails) {
		updateWatchFolder(watchFolderDetails);
		watchFolderSourceMapper.updateByPrimaryKeySelective(watchFolderDetails.getSource());
		
		List<WatchFolderDestination> wl = watchFolderDetails.getDestinations();
		
		for (WatchFolderDestination wd : wl) {
			
			if(wd.getDestinationId() == null) {
				wd.setWatchFolderId(watchFolderDetails.getWatchFolderId());
				wd.setDestinationId(UUID.randomUUID().toString());
				watchFolderDestinationMapper.insert(wd);
			} else {
				watchFolderDestinationMapper.updateByPrimaryKeySelective(wd);
			}
		}
		
		
		watchFolderPresetMapper.updateByPrimaryKeySelective(watchFolderDetails.getJobPreset());
		return fetchWatchFolderDetails(watchFolderDetails.getWatchFolderId());
	}

	@Override
	public WatchFolderDestination createWatchFolderDestination(WatchFolderDestination destination) {
		UUID uuid = UUID.randomUUID();
		destination.setDestinationId(uuid.toString());
		watchFolderDestinationMapper.insertSelective(destination);

		return destination;
	}

	@Override
	public WatchFolderSource createWatchFolderSource(WatchFolderSource source) {
		UUID uuid = UUID.randomUUID();
		source.setSourceId(uuid.toString());
		watchFolderSourceMapper.insertSelective(source);
		return source;
	}

	@Override
	public JobOutput createJobOutput(JobOutput output) {
		UUID uuid = UUID.randomUUID();
		output.setOutputId(uuid.toString());
		this.jobOutputMapper.insert(output);
		return this.jobOutputMapper.selectByPrimaryKey(output.getOutputId());
	}

	@Override
	public List<JobOutput> fetchJobOutput() {
		JobOutputExample example = new JobOutputExample();
		example.createCriteria().andOutputIdIsNotNull();
		return this.jobOutputMapper.selectByExample(example);
	}

	@Override
	public JobOutput fetchJobOutput(String outputId) {
		return this.jobOutputMapper.selectByPrimaryKey(outputId);
	}

	@Override
	public JobOutput updateJobOutput(JobOutput output) {
		this.jobOutputMapper.updateByPrimaryKey(output);
		return fetchJobOutput(output.getOutputId());
	}

	@Override
	public void deleteJobOutput(String outputId) {
		this.jobOutputMapper.deleteByPrimaryKey(outputId);

	}

	@Override
	public Metadata createMetadata(Metadata metadata) {
		UUID uuid = UUID.randomUUID();
		metadata.setMetadataId(uuid.toString());
		metadataMapper.insert(metadata);
		return fetchMetadata(metadata.getMetadataId());
	}

	@Override
	public List<Metadata> fetchMetadata() {
		MetadataExample metadata = new MetadataExample();
		metadata.createCriteria().andMetadataIdIsNotNull();
		return this.metadataMapper.selectByExample(metadata);
	}

	@Override
	public Metadata fetchMetadata(String metadataId) {
		return this.metadataMapper.selectByPrimaryKey(metadataId);
	}

	@Override
	public Metadata updateMetadata(Metadata metadata) {
		this.metadataMapper.updateByPrimaryKey(metadata);
		return fetchMetadata(metadata.getMetadataId());
	}

	@Override
	public void deleteMetadata(String metadataId) {
		this.metadataMapper.deleteByPrimaryKey(metadataId);

	}

	public MetadataMapper getMetadataMapper() {
		return metadataMapper;
	}

	public void setMetadataMapper(MetadataMapper metadataMapper) {
		this.metadataMapper = metadataMapper;
	}

	@Override
	public List<Preset> fetchPresets(String category) {
		return this.presetMapper.selectByCategory(category);
	}

	@Override
	public List<WorkflowCategory> fetchPresetCategories() {
		//WorkflowCategoryExample example=new WorkflowCategoryExample();
		//return this.workflowCategoryMapper.selectByExample(example);
		
		//TODO: fix this temporary HACK!!!  Will require schema change
		
		PresetExample e = new PresetExample();
		e.createCriteria().andPresetIdIsNotNull();
		List<Preset> list = presetMapper.selectByExample(e);
		
		HashSet<String> nameSet = new HashSet<String>();
		
		ArrayList<WorkflowCategory> wfList = new ArrayList<WorkflowCategory>();
		
		for (Preset p : list) {
			nameSet.add(p.getWorkflow());
		}
		
		WorkflowCategory c = null;
		for (String name : nameSet) {
			c = new WorkflowCategory();
			c.setName(name);
			c.setDescription(name);
			wfList.add(c);
		}
		
		return wfList;
	}


	@Override
	public List<Preset> fetchPresetsLikeName(String name) {
		PresetExample e = new PresetExample();
		e.createCriteria().andNameLike(name);
		return presetMapper.selectByExample(e);
	}

	@Override
	public List<JobDetails> fetchJobDetailsLikeName(String name) {
		return jobDetailsMapper.selectJobDetailsLikeName(name);
	}

	public WorkflowCategoryMapper getWorkflowCategoryMapper() {
		return workflowCategoryMapper;
	}

	public void setWorkflowCategoryMapper(WorkflowCategoryMapper workflowCategoryMapper) {
		this.workflowCategoryMapper = workflowCategoryMapper;
	}

	@Override
	public int getPresetsCount() {
		return presetExtMapper.selectPresetCount();
	}

	@Override
	public List<Preset> fetchPresets(int pageSize, int index) {
		return presetExtMapper.selectPresetsPaging(pageSize, index);
	}

	@Override
	public int getWatchCount() {
		return watchFolderDetailsMapper.selectWatchFolderCount();
	}
	
	@Override
	public List<WatchFolderDetails> fetchWatchFolderDetails(int pageSize, int index) {
		return watchFolderDetailsMapper.selectWatchFolderDetailsPaging(pageSize, index);
	}
	
	@Override
	public ApplicationSettings fetchApplicationSetting(String name) {
		ApplicationSettingsExample e = new ApplicationSettingsExample();
		e.createCriteria().andNameEqualTo(name);
		List<ApplicationSettings> list = applicationSettingsMapper.selectByExample(e);
		if (list  != null) {
			return list.get(0);
		} else {
			return null;
		}
	}
	
	@Override
	public ApplicationSettings fetchApplicationSettingById(String id) {
		ApplicationSettingsExample e = new ApplicationSettingsExample();
		e.createCriteria().andApplicationSettingIdEqualTo(id);
		List<ApplicationSettings> list = applicationSettingsMapper.selectByExample(e);
		if (list  != null) {
			return list.get(0);
		} else {
			return null;
		}
	}
	
	@Override
	public List<ApplicationSettings> fetchApplicationSettingsList() {
		ApplicationSettingsExample e = new ApplicationSettingsExample();
		e.createCriteria().andApplicationSettingIdIsNotNull();
		List<ApplicationSettings> list = applicationSettingsMapper.selectByExample(e);
		return list;
	}
	
	@Override
	public ApplicationSettings createApplicationSetting(ApplicationSettings a) {
		UUID uuid = UUID.randomUUID();
		a.setApplicationSettingId(uuid.toString());
		applicationSettingsMapper.insert(a);
		return a;
	}
	
	@Override
	public ApplicationSettings updateApplicationSetting(ApplicationSettings a) {
		
		applicationSettingsMapper.updateByPrimaryKeySelective(a);
		return a;
	}

	@Override
	public LicenseKey createLicenseKey(String keyStr, String company) {
		LicenseKey k = fetchCurrentKey();
		
		deleteLicenseKey("1");
		
		LicenseKey key = new LicenseKey();
		key.setCreated(new Date());
		key.setLicenseKey(keyStr);
		key.setCompanyName(company);
		key.setLicenseKeyId("1");
		licenseKeyMapper.insert(key);
		return key;
	}

	@Override
	public void deleteLicenseKey(String keyId) {
		licenseKeyMapper.deleteByPrimaryKey(keyId);
	}

	@Override
	public LicenseKey fetchCurrentKey() {
		LicenseKeyExample e = new LicenseKeyExample();
		LicenseKey k =  licenseKeyMapper.selectByPrimaryKey("1");
		if (k != null) {
			return k;
		} else {
			return null;
		}
	}

}

