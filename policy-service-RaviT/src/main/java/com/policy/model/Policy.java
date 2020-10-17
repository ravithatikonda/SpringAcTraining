package com.policy.model;

import java.util.Date;

public class Policy {
	private String policyID;
	private String policyName;
	private Date policyEffDate;
	private Date policyEndDate;
	private Customer customerDetails;
	public String getPolicyID() {
		return policyID;
	}
	public void setPolicyID(String policyID) {
		this.policyID = policyID;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public Date getPolicyEffDate() {
		return policyEffDate;
	}
	public void setPolicyEffDate(Date policyEffDate) {
		this.policyEffDate = policyEffDate;
	}
	public Date getPolicyEndDate() {
		return policyEndDate;
	}
	public void setPolicyEndDate(Date policyEndDate) {
		this.policyEndDate = policyEndDate;
	}
	public Customer getCustomerDetails() {
		return customerDetails;
	}
	public void setCustomerDetails(Customer customerDetails) {
		this.customerDetails = customerDetails;
	}
	public Policy(String policyID, String policyName, Date policyEffDate, Date policyEndDate,
			Customer customerDetails) {
		
		this.policyID = policyID;
		this.policyName = policyName;
		this.policyEffDate = policyEffDate;
		this.policyEndDate = policyEndDate;
		this.customerDetails = customerDetails;
	}
	

}
