/*
SQLyog Enterprise v9.02 
MySQL - 5.5.8-log : Database - Squeeze
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`Squeeze` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `Squeeze`;

/*Table structure for table `ApplicationSettings` */

DROP TABLE IF EXISTS `ApplicationSettings`;

CREATE TABLE `ApplicationSettings` (
  `ApplicationSettingId` char(36) NOT NULL DEFAULT '',
  `Name` varchar(60) NOT NULL DEFAULT '' COMMENT 'Setting Name',
  `Label` varchar(60) NOT NULL DEFAULT '',
  `Description` varchar(500) DEFAULT NULL,
  `ValueType` char(10) NOT NULL COMMENT 'value data type',
  `Value` varchar(500) NOT NULL COMMENT 'Setting value',
  `UnitLabel` varchar(10) NOT NULL DEFAULT '' COMMENT 'units label for type',
  `Created` datetime DEFAULT NULL,
  `Modified` datetime DEFAULT NULL,
  `GroupName` varchar(50) DEFAULT NULL COMMENT 'Settings Group Name',
  `Constraints` varchar(1024) DEFAULT NULL COMMENT 'Field constraints if any ie: 1|255, Opt1|Opt2|Opt3',
  PRIMARY KEY (`ApplicationSettingId`,`Name`),
  UNIQUE KEY `NAME_INDEX` (`Name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `Credentials` */

DROP TABLE IF EXISTS `Credentials`;

CREATE TABLE `Credentials` (
  `CredentialId` char(36) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Username` varchar(128) NOT NULL,
  `Password` varchar(1024) NOT NULL,
  `Salt` varchar(128) NOT NULL,
  `ServiceName` varchar(30) DEFAULT '',
  `Created` datetime DEFAULT NULL,
  `Modified` datetime DEFAULT NULL,
  PRIMARY KEY (`CredentialId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `Destinations` */

DROP TABLE IF EXISTS `Destinations`;

CREATE TABLE `Destinations` (
  `DestinationId` char(36) NOT NULL DEFAULT '',
  `JobId` char(36) DEFAULT '',
  `LocationTypeId` int(11) NOT NULL,
  `URI` varchar(2048) DEFAULT NULL,
  `FileName` varchar(2048) DEFAULT NULL,
  `SSSBucket` varchar(256) DEFAULT NULL,
  `CredentialId` char(36) DEFAULT NULL,
  `UserName` varchar(128) DEFAULT NULL,
  `Password` varchar(1024) DEFAULT NULL,
  `Salt` varchar(128) DEFAULT NULL,
  `SSSThumbBucket` varchar(256) DEFAULT NULL,
  `ThumbFileNamePattern` varchar(1024) DEFAULT NULL COMMENT 'If not null, generate three thumbnails replacing %VERSION% with the thumbnail ID',
  `ThumbURI` varchar(2048) DEFAULT NULL,
  `Created` datetime DEFAULT NULL,
  `Modified` datetime DEFAULT NULL,
  `FileNamingMethodId` int(11) DEFAULT NULL COMMENT 'Deprecated column',
  `DestinationName` varchar(50) DEFAULT NULL,
  `FileNamingMethod` varchar(30) DEFAULT 'Default',
  `ExtensionNamingMethod` varchar(30) DEFAULT 'Default',
  `WatchFolderId` char(36) DEFAULT NULL COMMENT 'Watch folder ID if the destination is for watch folders.',
  PRIMARY KEY (`DestinationId`),
  KEY `FK_Destinations_Locations` (`LocationTypeId`),
  KEY `FK_Destinations_Credentials` (`CredentialId`),
  KEY `FK_Destinations_Jobs` (`JobId`),
  KEY `FK_WatchFolders_Destinations` (`WatchFolderId`),
  CONSTRAINT `FK_WatchFolders_Destinations` FOREIGN KEY (`WatchFolderId`) REFERENCES `WatchFolders` (`WatchFolderId`) ON DELETE CASCADE,
  CONSTRAINT `FK_Destinations_Credentials` FOREIGN KEY (`CredentialId`) REFERENCES `Credentials` (`CredentialId`),
  CONSTRAINT `FK_Destinations_Jobs` FOREIGN KEY (`JobId`) REFERENCES `Jobs` (`JobId`) ON DELETE CASCADE,
  CONSTRAINT `FK_Destinations_Locations` FOREIGN KEY (`LocationTypeId`) REFERENCES `LocationTypes` (`LocationTypeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `JobOutput` */

DROP TABLE IF EXISTS `JobOutput`;

CREATE TABLE `JobOutput` (
  `OutputId` char(36) NOT NULL,
  `JobId` char(36) DEFAULT '',
  `FileName` varchar(1024) NOT NULL DEFAULT '',
  `FileSize` bigint(11) DEFAULT NULL,
  `FileType` varchar(50) DEFAULT NULL,
  `VideoCodec` varchar(50) DEFAULT NULL,
  `Width` int(11) DEFAULT NULL,
  `Height` int(11) DEFAULT NULL,
  `DurationSeconds` double DEFAULT NULL,
  `FrameRate` varchar(50) DEFAULT NULL,
  `VideoDataRate` varchar(50) DEFAULT NULL,
  `AudioDataRate` varchar(50) DEFAULT NULL,
  `AudioCodec` varchar(50) DEFAULT NULL,
  `Created` datetime DEFAULT NULL,
  `Modified` datetime DEFAULT NULL,
  `DestinationId` char(36) DEFAULT NULL,
  PRIMARY KEY (`OutputId`),
  KEY `FK_Jobs_Output` (`JobId`),
  KEY `FK_Output_Destinations` (`DestinationId`),
  CONSTRAINT `FK_Output_Jobs` FOREIGN KEY (`JobId`) REFERENCES `Jobs` (`JobId`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `JobPresets` */

DROP TABLE IF EXISTS `JobPresets`;

CREATE TABLE `JobPresets` (
  `JobPresetId` char(36) NOT NULL,
  `JobId` char(36) DEFAULT NULL,
  `PresetId` char(36) DEFAULT NULL,
  `URI` varchar(2048) DEFAULT '',
  `InPoint` double DEFAULT NULL,
  `OutPoint` double DEFAULT NULL,
  `Created` datetime DEFAULT NULL,
  `Modified` datetime DEFAULT NULL,
  `XmlData` varchar(45720) DEFAULT NULL COMMENT 'One Time Preset',
  `Name` varchar(50) DEFAULT NULL,
  `WatchFolderId` char(36) DEFAULT NULL COMMENT 'Watch Folder ID if the preset is from a watch folder',
  PRIMARY KEY (`JobPresetId`),
  KEY `FK_Presets` (`PresetId`),
  KEY `FK_Jobs_Presets` (`JobId`),
  KEY `FK_WatchFolders_JobPresets` (`WatchFolderId`),
  CONSTRAINT `FK_WatchFolders_JobPresets` FOREIGN KEY (`WatchFolderId`) REFERENCES `WatchFolders` (`WatchFolderId`) ON DELETE CASCADE,
  CONSTRAINT `FK_JobPresets_Jobs` FOREIGN KEY (`JobId`) REFERENCES `Jobs` (`JobId`) ON DELETE CASCADE,
  CONSTRAINT `FK_JobPresets_Presets` FOREIGN KEY (`PresetId`) REFERENCES `Presets` (`PresetId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `JobQueues` */

DROP TABLE IF EXISTS `JobQueues`;

CREATE TABLE `JobQueues` (
  `QueueId` char(36) NOT NULL,
  `Name` varchar(30) NOT NULL DEFAULT '',
  `Description` varchar(500) DEFAULT NULL,
  `Created` datetime DEFAULT NULL,
  `Modified` datetime DEFAULT NULL,
  PRIMARY KEY (`QueueId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `Jobs` */

DROP TABLE IF EXISTS `Jobs`;

CREATE TABLE `Jobs` (
  `JobId` char(36) NOT NULL DEFAULT '',
  `Name` varchar(50) DEFAULT NULL,
 /* `QueueId` char(36) DEFAULT '',*/
 /* `ServerId` char(36) DEFAULT NULL,*/
  `PercentCompleteOverall` float NOT NULL DEFAULT 0.0,
  `StatusStateId` int(11) NOT NULL DEFAULT 1,
  `TimeSubmitted` datetime NOT NULL,
  `TimeStarted` datetime DEFAULT NULL,
  `TimeFinished` datetime DEFAULT NULL,
  `LastPingTime` datetime DEFAULT NULL,
  `ErrorCode` varchar(20) DEFAULT NULL,
  `StatusName` varchar(30) DEFAULT NULL,
  `StatusMessage` varchar(256) DEFAULT NULL,
  `InPoint` double DEFAULT NULL COMMENT 'Optional in-point for video compression',
  `OutPoint` double DEFAULT NULL COMMENT 'Optional out-point for video compression',
  `ThumbTime` double DEFAULT NULL COMMENT 'Optional time in seconds and fractions of a second into the video(ss.fff) for an optional thumbnail',
  `WatchFolderName` varchar(64) DEFAULT NULL COMMENT 'Name of the watch folder that generated this job (if any)',
  PRIMARY KEY (`JobId`),
  /*KEY `FK_Servers_Jobs` (`ServerId`),
  KEY `FK_Jobs_Queues` (`QueueId`),*/
  KEY `FK_Jobs_StatusStates` (`StatusStateId`),
  KEY `FK_WatchFolders_Jobs` (`WatchFolderName`),
  /*CONSTRAINT `FK_Jobs` FOREIGN KEY (`QueueId`) REFERENCES `JobQueues` (`QueueId`),
  CONSTRAINT `FK_Jobs_Servers` FOREIGN KEY (`ServerId`) REFERENCES `Servers` (`ServerId`),*/
  CONSTRAINT `FK_Jobs_StatusStates` FOREIGN KEY (`StatusStateId`) REFERENCES `StatusStates` (`StatusStateId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `LocationTypes` */

DROP TABLE IF EXISTS `LocationTypes`;

CREATE TABLE `LocationTypes` (
  `LocationTypeId` int(11) NOT NULL AUTO_INCREMENT,
  `LocationName` char(20) NOT NULL,
  `Order` smallint(6) NOT NULL DEFAULT '0',
  `Enabled` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`LocationTypeId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Table structure for table `Metadata` */

DROP TABLE IF EXISTS `Metadata`;

CREATE TABLE `Metadata` (
  `MetadataId` char(36) NOT NULL,
  `Name` varchar(256) DEFAULT NULL,
  `Value` varchar(256) DEFAULT NULL,
  `JobId` char(36) DEFAULT NULL,
  `Created` datetime DEFAULT NULL,
  `Modified` datetime DEFAULT NULL,
  PRIMARY KEY (`MetadataId`),
  KEY `FK_Metadata` (`JobId`),
  CONSTRAINT `FK_Metadata` FOREIGN KEY (`JobId`) REFERENCES `Jobs` (`JobId`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `OutputMetadata` */

DROP TABLE IF EXISTS `OutputMetadata`;

CREATE TABLE `OutputMetadata` (
  `OutputMetadataId` char(36) NOT NULL COMMENT 'Primary key for output metadata',
  `OutputId` char(36) DEFAULT NULL COMMENT 'Foreign key to the output for which this is the metadata',
  `TrackName` varchar(64) DEFAULT NULL COMMENT 'Optional track Name information',
  `TrackType` varchar(64) DEFAULT NULL COMMENT 'Optional track type such as audio, video, etc.',
  `Name` varchar(128) NOT NULL COMMENT 'Name for the metadata element',
  `Value` varchar(1024) DEFAULT NULL COMMENT 'Value associated with the metadata name',
  PRIMARY KEY (`OutputMetadataId`),
  KEY `FK_OutputMetadata_Output` (`OutputId`),
  CONSTRAINT `FK_OutputMetadata_Output` FOREIGN KEY (`OutputId`) REFERENCES `JobOutput` (`OutputId`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `Presets` */

DROP TABLE IF EXISTS `Presets`;

CREATE TABLE `Presets` (
  `PresetId` char(36) NOT NULL,
  `Name` varchar(50) NOT NULL DEFAULT '',
  `Description` varchar(256) DEFAULT NULL,
  `XmlData` varchar(45720) DEFAULT NULL,
  `URI` varchar(2048) DEFAULT NULL,
  `Workflow` varchar(256) DEFAULT NULL,
  `ExpectedFileNameExtension` varchar(12) DEFAULT NULL,
  `EncoderType` varchar(25),
  `Created` datetime DEFAULT NULL,
  `Modified` datetime DEFAULT NULL,
  `Deleted` tinyint(1) NOT NULL DEFAULT '0',
  `Published` tinyint(1) NOT NULL DEFAULT '1',
  `CategoryId` int(11) NOT NULL DEFAULT 1,
  PRIMARY KEY (`PresetId`),
  KEY `FK_PresetCategories` (`CategoryId`),
  CONSTRAINT `FK_PresetCategories` FOREIGN KEY (`CategoryId`) REFERENCES `PresetCategories` (`CategoryId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `ServerCommands` */

DROP TABLE IF EXISTS `ServerCommands`;

CREATE TABLE `ServerCommands` (
  `CommandId` int(11) NOT NULL AUTO_INCREMENT,
  `CommandName` varchar(20) NOT NULL,
  `Order` smallint(6) NOT NULL DEFAULT '0',
  `Enabled` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`CommandId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Table structure for table `ServerQueues` */

DROP TABLE IF EXISTS `ServerQueues`;

CREATE TABLE `ServerQueues` (
  `ServerQueueId` char(36) NOT NULL DEFAULT '',
  `ServerId` char(36) NOT NULL DEFAULT '',
  `QueueId` char(36) NOT NULL DEFAULT '',
  `Order` int(11) NOT NULL DEFAULT '10',
  `Created` datetime DEFAULT NULL,
  `Modified` datetime DEFAULT NULL,
  PRIMARY KEY (`ServerQueueId`),
  KEY `FK_ServerQueues_Queues` (`QueueId`),
  KEY `FK_ServerQueues` (`ServerId`),
  CONSTRAINT `FK_ServerQueues` FOREIGN KEY (`ServerId`) REFERENCES `Servers` (`ServerId`) ON DELETE CASCADE,
  CONSTRAINT `FK_ServerQueues_Queues` FOREIGN KEY (`QueueId`) REFERENCES `JobQueues` (`QueueId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `ServerStates` */

DROP TABLE IF EXISTS `ServerStates`;

CREATE TABLE `ServerStates` (
  `ServerStateId` int(11) NOT NULL AUTO_INCREMENT,
  `StateName` varchar(30) NOT NULL,
  `Order` smallint(6) NOT NULL DEFAULT '0',
  `Enabled` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`ServerStateId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Table structure for table `Servers` */

DROP TABLE IF EXISTS `Servers`;

CREATE TABLE `Servers` (
  `ServerId` char(36) NOT NULL,
  `ImageId` varchar(30) DEFAULT NULL,
  `InstanceId` varchar(30) DEFAULT NULL,
  `PublicName` varchar(128) DEFAULT NULL COMMENT 'Public name associated with this server''s public IP',
  `PublicIp` varchar(40) DEFAULT NULL COMMENT 'Public IP address',
  `PrivateName` varchar(128) DEFAULT NULL COMMENT 'Name associated with the private address',
  `PrivateIp` varchar(40) DEFAULT NULL COMMENT 'Private (usually non-routable IP address)',
  `LastPingTime` datetime DEFAULT NULL COMMENT 'Last time the server updated this record',
  `CommandId` int(11) NOT NULL DEFAULT '1',
  `ServerStateId` int(11) NOT NULL DEFAULT '1',
  `CommandTime` datetime DEFAULT NULL COMMENT 'Last time the server got a command change',
  `StateChangeTime` datetime DEFAULT NULL COMMENT 'Last time the server changed state',
  `WebHostName` varchar(128) DEFAULT NULL COMMENT 'Web hostname that refers to this server',
  `DateCreated` datetime NOT NULL,
  `MachineType` varchar(20) DEFAULT NULL,
  `Processors` int(11) DEFAULT NULL,
  `OSVersion` varchar(60) DEFAULT NULL,
  `WebServiceHost` varchar(1024) DEFAULT NULL COMMENT 'Web service host for compression servers to use',
  `ProductVersion` varchar(36) DEFAULT NULL COMMENT 'Squeeze Server Product Version',
  `ManagementCredentialId` char(36) DEFAULT NULL COMMENT 'Credential Set ID for management',
  `Modified` datetime DEFAULT NULL,
  `Comments` varchar(1024) DEFAULT NULL COMMENT 'User comments/server description',
  `CompressorVersion` varchar(36) DEFAULT NULL COMMENT 'Version of the compression engne',
  PRIMARY KEY (`ServerId`),
  KEY `FK_Servers_Command` (`CommandId`),
  KEY `FK_Server_States` (`ServerStateId`),
  KEY `IX_Instance` (`InstanceId`),
  KEY `IX_HostName` (`WebHostName`),
  KEY `FK_Servers_Credentials` (`ManagementCredentialId`),
  CONSTRAINT `FK_Servers_Commands` FOREIGN KEY (`CommandId`) REFERENCES `ServerCommands` (`CommandId`),
  CONSTRAINT `FK_Servers_Credentials` FOREIGN KEY (`ManagementCredentialId`) REFERENCES `Credentials` (`CredentialId`),
  CONSTRAINT `FK_Servers_States` FOREIGN KEY (`ServerStateId`) REFERENCES `ServerStates` (`ServerStateId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `Sources` */

DROP TABLE IF EXISTS `Sources`;

CREATE TABLE `Sources` (
  `SourceId` char(36) NOT NULL,
  `JobId` char(36) DEFAULT '',
  `LocationTypeId` int(11) NOT NULL,
  `URI` varchar(2048) DEFAULT NULL,
  `FileName` varchar(2048) DEFAULT NULL,
  `SSSBucket` varchar(256) DEFAULT NULL,
  `CredentialId` char(36) DEFAULT NULL,
  `UserName` varchar(128) DEFAULT NULL,
  `Password` varchar(1024) DEFAULT NULL,
  `Salt` varchar(128) DEFAULT NULL,
  `FileSize` bigint(20) NOT NULL DEFAULT '0',
  `Created` datetime DEFAULT NULL,
  `Modified` datetime DEFAULT NULL,
  `WatchFolderId` char(36) DEFAULT NULL COMMENT 'Watch Folder ID if the source is for a watch folder.',
  `WatermarkImageUri` varchar(2048) DEFAULT NULL,
  PRIMARY KEY (`SourceId`),
  KEY `FK_Jobs_Sources` (`JobId`),
  KEY `FK_Credentials_Sources` (`CredentialId`),
  KEY `FK_Sources_LocationTypes` (`LocationTypeId`),
  KEY `FK_WatchFolders_Sources` (`WatchFolderId`),
  CONSTRAINT `FK_Sources_Credentials` FOREIGN KEY (`CredentialId`) REFERENCES `Credentials` (`CredentialId`),
  CONSTRAINT `FK_Sources_Jobs` FOREIGN KEY (`JobId`) REFERENCES `Jobs` (`JobId`) ON DELETE CASCADE,
  CONSTRAINT `FK_Sources_Locations` FOREIGN KEY (`LocationTypeId`) REFERENCES `LocationTypes` (`LocationTypeId`),
  CONSTRAINT `FK_WatchFolders_Sources` FOREIGN KEY (`WatchFolderId`) REFERENCES `WatchFolders` (`WatchFolderId`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `Status` */

DROP TABLE IF EXISTS `Status`;

CREATE TABLE `Status` (
  `StatusId` char(36) NOT NULL,
  `JobId` char(36) DEFAULT '',
  `StatusStateId` int(11) NOT NULL,
  `TimeStarted` datetime NOT NULL,
  `TimeFinished` datetime DEFAULT NULL,
  `PercentComplete` float NOT NULL DEFAULT '0',
  `ErrorCode` varchar(20) DEFAULT NULL,
  `Message` varchar(256) DEFAULT NULL,
  `RetryCount` smallint(6) NOT NULL DEFAULT '0',
  `JobPresetId` char(36) DEFAULT NULL,
  `Modified` datetime DEFAULT NULL,
  `Created` datetime DEFAULT NULL,
  `DestinationId` char(36) DEFAULT NULL,
  PRIMARY KEY (`StatusId`),
  KEY `FK_Job_Status` (`JobId`),
  KEY `FK_Status_StatusStates` (`StatusStateId`),
  KEY `FK_Status_Presets` (`JobPresetId`),
  CONSTRAINT `FK_Status_Presets` FOREIGN KEY (`JobPresetId`) REFERENCES `JobPresets` (`JobPresetId`) ON DELETE CASCADE,
  CONSTRAINT `FK_Status` FOREIGN KEY (`JobId`) REFERENCES `Jobs` (`JobId`) ON DELETE CASCADE,
  CONSTRAINT `FK_Status_States` FOREIGN KEY (`StatusStateId`) REFERENCES `StatusStates` (`StatusStateId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `StatusStates` */

DROP TABLE IF EXISTS `StatusStates`;

CREATE TABLE `StatusStates` (
  `StatusStateId` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(30) NOT NULL DEFAULT '',
  `Order` smallint(6) NOT NULL DEFAULT '0',
  `Enabled` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`StatusStateId`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Table structure for table `ThumbnailTypes` */

DROP TABLE IF EXISTS `ThumbnailTypes`;

CREATE TABLE `ThumbnailTypes` (
  `ThumbnailVersionId` int(11) NOT NULL AUTO_INCREMENT,
  `BoundingBoxWidth` int(11) NOT NULL,
  `BoundingBoxHeight` int(11) NOT NULL,
  `Description` varchar(500) NOT NULL,
  `Created` datetime DEFAULT NULL,
  `Modified` datetime DEFAULT NULL,
  `Sort` smallint(6) NOT NULL DEFAULT '0',
  `Enabled` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`ThumbnailVersionId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Table structure for table `WatchFolders` */

DROP TABLE IF EXISTS `WatchFolders`;

CREATE TABLE `WatchFolders` (
  `WatchFolderId` char(36) NOT NULL COMMENT 'Primary Key column for watch folder configuration',
  `Name` varchar(64) NOT NULL COMMENT 'Name for the watch foldder',
  `LastScanStart` datetime DEFAULT NULL COMMENT 'Last time a poll was started',
  `LastScanEnd` datetime DEFAULT NULL COMMENT 'Last poll time finished',
  `LastScanNumberJobsCreated` int(11) DEFAULT '0' COMMENT 'Number of jobs that were created on the last poll',
  `LastScanServerName` varchar(128) DEFAULT NULL COMMENT 'Public Name or Private Name of the server that last polled.',
  `CurrentScanServerId` char(36) DEFAULT NULL COMMENT 'Server currently polling (if any)',
  `CurrentScanStart` datetime DEFAULT NULL COMMENT 'Time the current poll started',
  `LastScanOldestFileTimeTicks` bigint(20) DEFAULT NULL COMMENT 'Date/time of the oldest file found in the watch folder Ticks',
  `LastScanNewestFileTimeTicks` bigint(20) DEFAULT NULL COMMENT 'Date/time of the newest file found in the watch folder Ticks',
  `Enabled` tinyint(1) NOT NULL DEFAULT '1' COMMENT 'Watch folder enabled/disabled',
  `Deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT 'Watch folder is deleted',
  `Created` datetime DEFAULT NULL COMMENT 'Date/Time the watch folder was created',
  `Modified` datetime DEFAULT NULL COMMENT 'Date/Time the watch folder was last modified',
  `QueueId` char(36) DEFAULT '' COMMENT 'Queue jobs will be assigned to from this watch folder',
  `Message` varchar(256) DEFAULT NULL COMMENT 'Any informational message about the last scan. ',
  `DeepScan` tinyint(1) NOT NULL DEFAULT '1' COMMENT 'Deep folder scan',
  PRIMARY KEY (`WatchFolderId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `WatchFolderSources` */

DROP TABLE IF EXISTS `WatchFolderSources`;

CREATE TABLE `WatchFolderSources` (
  `SourceId` char(36) NOT NULL DEFAULT '',
  `WatchFolderId` char(36) NOT NULL,
  `URI` varchar(2048) DEFAULT NULL,
  `ThumbFileNamePattern` varchar(1024) DEFAULT NULL,
  `ThumbURI` varchar(2048) DEFAULT NULL,
  `Created` datetime DEFAULT NULL,
  `Modified` datetime DEFAULT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `FileNamingMethod` varchar(30) DEFAULT 'Default',
  `ExtensionNamingMethod` varchar(30) DEFAULT 'Default',
  PRIMARY KEY (`SourceId`),
  KEY `FK_WatchFolderId` (`WatchFolderId`),
  CONSTRAINT `FK_WatchFolder_Sources` FOREIGN KEY (`WatchFolderId`) REFERENCES `WatchFolders` (`WatchFolderId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `WatchFolderDestinations` */

DROP TABLE IF EXISTS `WatchFolderDestinations`;

CREATE TABLE `WatchFolderDestinations` (
  `DestinationId` char(36) NOT NULL DEFAULT '',
  `WatchFolderId` char(36) NOT NULL,
  `URI` varchar(2048) DEFAULT NULL,
  `ThumbFileNamePattern` varchar(1024) DEFAULT NULL,
  `ThumbURI` varchar(2048) DEFAULT NULL,
  `Created` datetime DEFAULT NULL,
  `Modified` datetime DEFAULT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `FileNamingMethod` varchar(30) DEFAULT 'Default',
  `ExtensionNamingMethod` varchar(30) DEFAULT 'Default',
  PRIMARY KEY (`DestinationId`),
  KEY `FK_WatchFolderId` (`WatchFolderId`),
  CONSTRAINT `FK_WatchFolder_Destinations` FOREIGN KEY (`WatchFolderId`) REFERENCES `WatchFolders` (`WatchFolderId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `WatchFolderPresets` */

DROP TABLE IF EXISTS `WatchFolderPresets`;

CREATE TABLE `WatchFolderPresets` (
  `WatchFolderPresetId` char(36) NOT NULL,
  `WatchFolderId` char(36) DEFAULT NULL,
  `PresetId` char(36) DEFAULT NULL,
  `URI` varchar(2048) DEFAULT '',
  `InPoint` double DEFAULT NULL,
  `OutPoint` double DEFAULT NULL,
  `Created` datetime DEFAULT NULL,
  `Modified` datetime DEFAULT NULL,
  `XmlData` varchar(45720) DEFAULT NULL COMMENT 'One Time Preset',
  `Name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`WatchFolderPresetId`),
  KEY `FK_WatchFolderId` (`WatchFolderId`),
  CONSTRAINT `FK_WatchFolder_Presets` FOREIGN KEY (`WatchFolderId`) REFERENCES `WatchFolders` (`WatchFolderId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `WatchFolderPlugins` */

DROP TABLE IF EXISTS `WatchFolderPlugins`;

CREATE TABLE `WatchFolderPlugins` (
  `PluginId` char(36) NOT NULL,
  `WatchFolderId` char(36) NOT NULL,
  `PhaseType` varchar(2048) NOT NULL,
  `PluginType` varchar(2048) NOT NULL,
  PRIMARY KEY (`PluginId`),
  KEY `FK_WatchFolderId` (`WatchFolderId`),
  CONSTRAINT `FK_WatchFolder_Plugins` FOREIGN KEY (`WatchFolderId`) REFERENCES `WatchFolders` (`WatchFolderId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `WatchFolderAttrs` */

DROP TABLE IF EXISTS `WatchFolderAttrs`;

CREATE TABLE `WatchFolderAttrs` (
  `AttributeId` char(36) NOT NULL,
  `WatchFolderId` char(36) NOT NULL,
  `Name` varchar(2048) NOT NULL,
  `Value` varchar(2048) NOT NULL,
  PRIMARY KEY (`AttributeId`),
  KEY `FK_WatchFolderId` (`WatchFolderId`),
  CONSTRAINT `FK_WatchFolder_Attrs` FOREIGN KEY (`WatchFolderId`) REFERENCES `WatchFolders` (`WatchFolderId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `PresetCategories`;
CREATE TABLE `PresetCategories` (
  `CategoryId` int(11) NOT NULL,
  `Name` varchar(250) NOT NULL DEFAULT '',
  PRIMARY KEY (`CategoryId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
