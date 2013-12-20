package com.smedia.sqzserver.dataservice.model.oldApi;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="JobCreateInfo")
public class JobCreateInfo {

	private String name = null;
	private Double inPoint = 0.0;
	private Double outPoint = 0.0;
	private JobMediaInfo jobMediaInfo = null;

	public JobCreateInfo() {

	}
	
	@XmlElement(name="Name")
	public String getName() {
		return name;
	}

	@XmlElement(name="InPoint")
	public Double getInPoint() {
		return inPoint;
	}
	
	@XmlElement(name="JobMediaInfo")
	public JobMediaInfo getJobMediaInfo() {
		return jobMediaInfo;
	}
	
	@XmlElement(name="OutPoint")
	public Double getOutPoint() {
		return outPoint;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setInPoint(Double inPoint) {
		this.inPoint = inPoint;
	}

	public void setJobMediaInfo(JobMediaInfo jobMediaInfo) {
		this.jobMediaInfo = jobMediaInfo;
	}

	public void setOutPoint(Double outPoint) {
		this.outPoint = outPoint;
	}
	
	public static JobCreateInfo xmlToObject(String oldJobXml) throws Exception {
		InputStream is = new ByteArrayInputStream(oldJobXml.getBytes());
		JAXBContext jc = JAXBContext.newInstance("com.smedia.sqzserver.dataservice.model.oldApi");
		Unmarshaller u = jc.createUnmarshaller();
		JobCreateInfo jobCreate = (JobCreateInfo) u.unmarshal(is);
		return jobCreate;
	}
	
	public static void main(String[] args) {
		
		JobCreateInfo jc = new JobCreateInfo();
		try {
			
			//String oldXml = FileUtils.readFileToString(new File("C:\\Users\\Trig\\Desktop\\old_sqz_server_create_job.txt"));
			FileReader fr = new FileReader(new File("C:\\Users\\Trig\\Desktop\\old_sqz_server_create_job.txt"));
			BufferedReader br = new BufferedReader(fr);
			
			StringBuffer sb = new StringBuffer();
			String line = null;
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
			br.close();
			String oldXml = sb.toString();
			
			JobCreateInfo.xmlToObject(oldXml);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
