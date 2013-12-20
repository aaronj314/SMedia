package com.smedia.sqzserver.dataservice.model.oldApi;

import javax.xml.bind.annotation.XmlElement;

public class SourceMedia {

	private String fileName = null;
	private String fileSize = null;
	private String fileUri = null;
	private String password = null;
	private String s3BucketName = null;
	private String type = null;
	private String userName = null;

	public SourceMedia() {

	}

	@XmlElement(name = "FileName")
	public String getFileName() {
		return fileName;
	}

	@XmlElement(name = "FileSize")
	public String getFileSize() {
		return fileSize;
	}

	@XmlElement(name = "FileUri")
	public String getFileUri() {
		return fileUri;
	}

	@XmlElement(name = "Password")
	public String getPassword() {
		return password;
	}

	@XmlElement(name = "S3BucketName")
	public String getS3BucketName() {
		return s3BucketName;
	}

	@XmlElement(name = "Type")
	public String getType() {
		return type;
	}

	@XmlElement(name = "UserName")
	public String getUserName() {
		return userName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}

	public void setFileUri(String fileUri) {
		this.fileUri = fileUri;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setS3BucketName(String s3BucketName) {
		this.s3BucketName = s3BucketName;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	/*
	 * <Created>1999-05-31T11:20:00</Created>
	 * <CredentialId>1627aea5-8e0a-4371-9022-9b504344e724</CredentialId>
	 * <FileName>String content</FileName>
	 * <FileSize>9223372036854775807</FileSize>
	 * <FileUri>file://C:\\dev\\test</FileUri>
	 * <JobId>1627aea5-8e0a-4371-9022-9b504344e724</JobId>
	 * <Modified>1999-05-31T11:20:00</Modified>
	 * 
	 * <Password>String content</Password> <S3BucketName>String
	 * content</S3BucketName>
	 * <SourceId>1627aea5-8e0a-4371-9022-9b504344e724</SourceId>
	 * <Type>Undefined</Type>
	 * 
	 * <UserName>String content</UserName>
	 * <WatchFolderId>1627aea5-8e0a-4371-9022-9b504344e724</WatchFolderId>
	 */

}
