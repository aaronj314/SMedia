package com.smedia.sqzserver.dataservice.model.base;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ServerStates {
	
	public ServerStates(){
		
	}
	
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ServerStates.ServerStateId
     *
     * @mbggenerated Sat Feb 11 22:55:25 MST 2012
     */
    private Integer serverStateId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ServerStates.StateName
     *
     * @mbggenerated Sat Feb 11 22:55:25 MST 2012
     */
    private String stateName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ServerStates.Order
     *
     * @mbggenerated Sat Feb 11 22:55:25 MST 2012
     */
    private Short order;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ServerStates.Enabled
     *
     * @mbggenerated Sat Feb 11 22:55:25 MST 2012
     */
    private Boolean enabled;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ServerStates.ServerStateId
     *
     * @return the value of ServerStates.ServerStateId
     *
     * @mbggenerated Sat Feb 11 22:55:25 MST 2012
     */
    public Integer getServerStateId() {
        return serverStateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ServerStates.ServerStateId
     *
     * @param serverStateId the value for ServerStates.ServerStateId
     *
     * @mbggenerated Sat Feb 11 22:55:25 MST 2012
     */
    public void setServerStateId(Integer serverStateId) {
        this.serverStateId = serverStateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ServerStates.StateName
     *
     * @return the value of ServerStates.StateName
     *
     * @mbggenerated Sat Feb 11 22:55:25 MST 2012
     */
    public String getStateName() {
        return stateName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ServerStates.StateName
     *
     * @param stateName the value for ServerStates.StateName
     *
     * @mbggenerated Sat Feb 11 22:55:25 MST 2012
     */
    public void setStateName(String stateName) {
        this.stateName = stateName == null ? null : stateName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ServerStates.Order
     *
     * @return the value of ServerStates.Order
     *
     * @mbggenerated Sat Feb 11 22:55:25 MST 2012
     */
    public Short getOrder() {
        return order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ServerStates.Order
     *
     * @param order the value for ServerStates.Order
     *
     * @mbggenerated Sat Feb 11 22:55:25 MST 2012
     */
    public void setOrder(Short order) {
        this.order = order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ServerStates.Enabled
     *
     * @return the value of ServerStates.Enabled
     *
     * @mbggenerated Sat Feb 11 22:55:25 MST 2012
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ServerStates.Enabled
     *
     * @param enabled the value for ServerStates.Enabled
     *
     * @mbggenerated Sat Feb 11 22:55:25 MST 2012
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}