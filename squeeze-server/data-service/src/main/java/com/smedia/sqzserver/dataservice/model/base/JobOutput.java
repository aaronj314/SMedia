package com.smedia.sqzserver.dataservice.model.base;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class JobOutput {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JobOutput.OutputId
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    private String outputId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JobOutput.JobId
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    private String jobId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JobOutput.FileName
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    private String fileName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JobOutput.FileSize
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    private Long fileSize;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JobOutput.FileType
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    private String fileType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JobOutput.VideoCodec
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    private String videoCodec;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JobOutput.Width
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    private Integer width;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JobOutput.Height
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    private Integer height;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JobOutput.DurationSeconds
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    private Double durationSeconds;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JobOutput.FrameRate
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    private String frameRate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JobOutput.VideoDataRate
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    private String videoDataRate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JobOutput.AudioDataRate
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    private String audioDataRate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JobOutput.AudioCodec
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    private String audioCodec;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JobOutput.Created
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JobOutput.Modified
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    private Date modified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JobOutput.DestinationId
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    private String destinationId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JobOutput.OutputId
     *
     * @return the value of JobOutput.OutputId
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public String getOutputId() {
        return outputId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JobOutput.OutputId
     *
     * @param outputId the value for JobOutput.OutputId
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public void setOutputId(String outputId) {
        this.outputId = outputId == null ? null : outputId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JobOutput.JobId
     *
     * @return the value of JobOutput.JobId
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JobOutput.JobId
     *
     * @param jobId the value for JobOutput.JobId
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public void setJobId(String jobId) {
        this.jobId = jobId == null ? null : jobId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JobOutput.FileName
     *
     * @return the value of JobOutput.FileName
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JobOutput.FileName
     *
     * @param fileName the value for JobOutput.FileName
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JobOutput.FileSize
     *
     * @return the value of JobOutput.FileSize
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JobOutput.FileSize
     *
     * @param fileSize the value for JobOutput.FileSize
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JobOutput.FileType
     *
     * @return the value of JobOutput.FileType
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JobOutput.FileType
     *
     * @param fileType the value for JobOutput.FileType
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JobOutput.VideoCodec
     *
     * @return the value of JobOutput.VideoCodec
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public String getVideoCodec() {
        return videoCodec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JobOutput.VideoCodec
     *
     * @param videoCodec the value for JobOutput.VideoCodec
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public void setVideoCodec(String videoCodec) {
        this.videoCodec = videoCodec == null ? null : videoCodec.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JobOutput.Width
     *
     * @return the value of JobOutput.Width
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JobOutput.Width
     *
     * @param width the value for JobOutput.Width
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JobOutput.Height
     *
     * @return the value of JobOutput.Height
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JobOutput.Height
     *
     * @param height the value for JobOutput.Height
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JobOutput.DurationSeconds
     *
     * @return the value of JobOutput.DurationSeconds
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public Double getDurationSeconds() {
        return durationSeconds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JobOutput.DurationSeconds
     *
     * @param durationSeconds the value for JobOutput.DurationSeconds
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public void setDurationSeconds(Double durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JobOutput.FrameRate
     *
     * @return the value of JobOutput.FrameRate
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public String getFrameRate() {
        return frameRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JobOutput.FrameRate
     *
     * @param frameRate the value for JobOutput.FrameRate
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public void setFrameRate(String frameRate) {
        this.frameRate = frameRate == null ? null : frameRate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JobOutput.VideoDataRate
     *
     * @return the value of JobOutput.VideoDataRate
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public String getVideoDataRate() {
        return videoDataRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JobOutput.VideoDataRate
     *
     * @param videoDataRate the value for JobOutput.VideoDataRate
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public void setVideoDataRate(String videoDataRate) {
        this.videoDataRate = videoDataRate == null ? null : videoDataRate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JobOutput.AudioDataRate
     *
     * @return the value of JobOutput.AudioDataRate
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public String getAudioDataRate() {
        return audioDataRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JobOutput.AudioDataRate
     *
     * @param audioDataRate the value for JobOutput.AudioDataRate
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public void setAudioDataRate(String audioDataRate) {
        this.audioDataRate = audioDataRate == null ? null : audioDataRate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JobOutput.AudioCodec
     *
     * @return the value of JobOutput.AudioCodec
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public String getAudioCodec() {
        return audioCodec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JobOutput.AudioCodec
     *
     * @param audioCodec the value for JobOutput.AudioCodec
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public void setAudioCodec(String audioCodec) {
        this.audioCodec = audioCodec == null ? null : audioCodec.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JobOutput.Created
     *
     * @return the value of JobOutput.Created
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JobOutput.Created
     *
     * @param created the value for JobOutput.Created
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JobOutput.Modified
     *
     * @return the value of JobOutput.Modified
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public Date getModified() {
        return modified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JobOutput.Modified
     *
     * @param modified the value for JobOutput.Modified
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public void setModified(Date modified) {
        this.modified = modified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JobOutput.DestinationId
     *
     * @return the value of JobOutput.DestinationId
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public String getDestinationId() {
        return destinationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JobOutput.DestinationId
     *
     * @param destinationId the value for JobOutput.DestinationId
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId == null ? null : destinationId.trim();
    }
}