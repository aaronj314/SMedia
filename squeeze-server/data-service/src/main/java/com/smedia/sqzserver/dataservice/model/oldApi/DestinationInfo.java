package com.smedia.sqzserver.dataservice.model.oldApi;

import javax.xml.bind.annotation.XmlElement;

public class DestinationInfo {
	
	private String extensionNamingMethod = null;
	private String fileName = null;
	private String fileNamingMethod = null;
	private String fileUri = null;
	private String password = null;
	private String s3BucketName = null;
	private String s3ThumbBucket = null;
	private String thumbFilePattern = null;
	private String thumbUri = null;
	private String type = null;
	private String userName = null;
	
	public DestinationInfo() {
		
	}
	
	@XmlElement(name="ExtensionNamingMethod")
	public String getExtensionNamingMethod() {
		return extensionNamingMethod;
	}
	
	@XmlElement(name="FileName")
	public String getFileName() {
		return fileName;
	}
	
	@XmlElement(name="FileNamingMethod")
	public String getFileNamingMethod() {
		return fileNamingMethod;
	}
	
	@XmlElement(name="FileUri")
	public String getFileUri() {
		return fileUri;
	}
	
	@XmlElement(name="Password")
	public String getPassword() {
		return password;
	}
	
	@XmlElement(name="S3BucketName")
	public String getS3BucketName() {
		return s3BucketName;
	}
	
	@XmlElement(name="S3ThumbBucket")
	public String getS3ThumbBucket() {
		return s3ThumbBucket;
	}
	
	@XmlElement(name="ThumbFilePattern")
	public String getThumbFilePattern() {
		return thumbFilePattern;
	}
	
	@XmlElement(name="ThumbUri")
	public String getThumbUri() {
		return thumbUri;
	}
	
	@XmlElement(name="Type")
	public String getType() {
		return type;
	}
	
	@XmlElement(name="UserName")
	public String getUserName() {
		return userName;
	}

	public void setExtensionNamingMethod(String extensionNamingMethod) {
		this.extensionNamingMethod = extensionNamingMethod;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setFileNamingMethod(String fileNamingMethod) {
		this.fileNamingMethod = fileNamingMethod;
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

	public void setS3ThumbBucket(String s3ThumbBucket) {
		this.s3ThumbBucket = s3ThumbBucket;
	}

	public void setThumbFilePattern(String thumbFilePattern) {
		this.thumbFilePattern = thumbFilePattern;
	}

	public void setThumbUri(String thumbUri) {
		this.thumbUri = thumbUri;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/*
	<DestinationInfo>
    
    <ExtensionNamingMethod>String content</ExtensionNamingMethod>
    <FileName>String content</FileName>
    <FileNamingMethod>String content</FileNamingMethod>
	
    <FileUri>http://somehost/thefile.mov</FileUri>
    
    <Password>String content</Password>
    <S3BucketName>String content</S3BucketName>
    <S3ThumbBucket>String content</S3ThumbBucket>
    <ThumbFilePattern>String content</ThumbFilePattern>
    <ThumbUri>String content</ThumbUri>
    <Type>Undefined</Type>
    <UserName>String content</UserName>

  </DestinationInfo>
  */
	
	

}
