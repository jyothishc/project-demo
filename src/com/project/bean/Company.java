package com.project.bean;

public class Company {

	// create attributes
	private String companyName;
	private String companyLocation;
	private String companyAddress;
	private String companyPhoneNumber;
	private String companyEmailId;
	private int companyEmployees;

	// constructor using fields
	public Company(String companyName, String companyLocation, String companyAddress, String companyPhoneNumber,
			String companyEmailId, int companyEmployees) {
		super();
		this.companyName = companyName;
		this.companyLocation = companyLocation;
		this.companyAddress = companyAddress;
		this.companyPhoneNumber = companyPhoneNumber;
		this.companyEmailId = companyEmailId;
		this.companyEmployees = companyEmployees;
	}

	// setter and getter method
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyLocation() {
		return companyLocation;
	}

	public void setCompanyLocation(String companyLocation) {
		this.companyLocation = companyLocation;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyPhoneNumber() {
		return companyPhoneNumber;
	}

	public void setCompanyPhoneNumber(String companyPhoneNumber) {
		this.companyPhoneNumber = companyPhoneNumber;
	}

	public String getCompanyEmailId() {
		return companyEmailId;
	}

	public void setCompanyEmailId(String companyEmailId) {
		this.companyEmailId = companyEmailId;
	}

	public int getCompanyEmployees() {
		return companyEmployees;
	}

	public void setCompanyEmployees(int companyEmployees) {
		this.companyEmployees = companyEmployees;
	}

	// to String
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", companyLocation=" + companyLocation + ", companyAddress="
				+ companyAddress + ", companyPhoneNumber=" + companyPhoneNumber + ", companyEmailId=" + companyEmailId
				+ ", companyEmployees=" + companyEmployees + "]";
	}

}
