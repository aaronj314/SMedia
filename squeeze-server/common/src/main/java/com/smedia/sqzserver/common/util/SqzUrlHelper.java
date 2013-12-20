package com.smedia.sqzserver.common.util;

public class SqzUrlHelper {
	
	public static String getNewDestinationUrl(String fileUri, String userName, String password, String s3BucketName) throws Exception {
		String newUrl = "";
		
		// proto://
		String protocol = fileUri.substring(0, fileUri.indexOf(":"));
		
		if (protocol == null) {
			throw new Exception("protocol not supported: " + fileUri);
		}
		
		// file:///C:\\videos
		// http://hostname
		// ftp://user001:secretpassword@private.ftp-servers.example.com/mydirectory
		// ftps://user:password@host.name.com/dir_to_upload_to
		// sftp://user:password@host.name.com/dir_to_upload_to
		// s3://upload-test-jp22?accessKey=0TTMQTF7KH4KA5B03Q02&accessSecret=mnEcU/DXm4u+TjSbN0FB1JsiKIRSaG7t6tHaL634
		// smedia360://360services.sorensonmedia.com?user=tgullberg@sorensonmedia.com&password=test1234&display_name=YO_NEW_HLS&author_name=me&description=test
		
		if (protocol.equals("file")) {
			// TODO: we may have to add logic here to clean up file urls for the given platform the job will run on!!!
			newUrl = fileUri;
		} else if (protocol.equals("ftp")) {
			newUrl = getFtpString(protocol, fileUri, userName, password);
		} else if (protocol.equals("ftps")) {
			newUrl = getFtpString(protocol, fileUri, userName, password);
		} else if (protocol.equals("sftp")) {
			newUrl = getFtpString(protocol, fileUri, userName, password);
		} else if (protocol.equals("s3")) {
			newUrl = "s3://" + s3BucketName + "?accessKey=" + userName + "&accessSecret=" + password;
		} else if (protocol.equals("smedia360")) {
			newUrl = "smedia360://360services.sorensonmedia.com?user=" + userName + "&password=" + password;
		}
		return newUrl;
	}
	
	private static String getFtpString(String protocol, String fileUri, String user, String passwd) {
		if (fileUri.indexOf("@") > 0) {
			return fileUri;
		} else {
			String host = fileUri.replace(protocol + "://", "");
			return protocol + "://" + user + ":" + passwd + "@" + host;
		}
	}
	
	public static String getNewSourceUrl(String fileUri, String userName, String password, String s3BucketName, String fielName) throws Exception {
		String newUrl = "";
		
		// proto://
		String protocol = fileUri.substring(0, fileUri.indexOf(":"));
		
		if (protocol == null) {
			throw new Exception("protocol not supported: " + fileUri);
		}
		
		// file:///C:\\videos\\file.mov
		// ftp://user:password@host.name.com/dir/file.mov
		// ftps://user:password@host.name.com/dir/file.mov
		// sftp://user:password@host.name.com/dir/file.mov
		// s3://upload-test/test.mp4?accessKey=0TTMQTF7KH4KA5B03Q02&accessSecret=mnEcU/DXm4u+TjSbN0FB1JsiKIRSaG7t6tHaL634
		
		if (protocol.equals("file")) {
			// TODO: we may have to add logic here to clean up file urls for the given platform the job will run on!!!
			newUrl = fileUri;
		} else if (protocol.equals("ftp")) {
			newUrl = getFtpString(protocol, fileUri, userName, password);
		} else if (protocol.equals("ftps")) {
			newUrl = getFtpString(protocol, fileUri, userName, password);
		} else if (protocol.equals("sftp")) {
			newUrl = getFtpString(protocol, fileUri, userName, password);
		} else if (protocol.equals("s3")) {
			newUrl = "s3://" + s3BucketName + "/" + fielName + "?accessKey=" + userName + "&accessSecret=" + password;
		}
		
		return newUrl;
	}

}
