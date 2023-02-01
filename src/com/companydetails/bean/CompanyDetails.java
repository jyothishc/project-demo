package com.companydetails.bean;

public class CompanyDetails {

	// attributes
	private String companyName;
	private String companyPhoneNumber;
	private String companyAddress;
	private String companyGST;
	private float companyTurnover;
	private int companyManpower;
	private char companyCategory;
	private String companyEmailId;

	// default constructor
	public CompanyDetails() {

	}

	// parameterized constructor
	public CompanyDetails(String companyName, String companyPhoneNumber, String companyAddress, String companyGST,
			float companyTurnover, int companyManpower, char companyCategiry, String companyEmailId) {
		super();
		this.companyName = companyName;
		this.companyPhoneNumber = companyPhoneNumber;
		this.companyAddress = companyAddress;
		this.companyGST = companyGST;
		this.companyTurnover = companyTurnover;
		this.companyManpower = companyManpower;
		this.companyCategory = companyCategiry;
		this.companyEmailId = companyEmailId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyPhoneNumber() {
		return companyPhoneNumber;
	}

	public void setCompanyPhoneNumber(String companyPhoneNumber) {
		this.companyPhoneNumber = companyPhoneNumber;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyGST() {
		return companyGST;
	}

	public void setCompanyGST(String companyGST) {
		this.companyGST = companyGST;
	}

	public float getCompanyTurnover() {
		return companyTurnover;
	}

	public void setCompanyTurnover(float companyTurnover) {
		this.companyTurnover = companyTurnover;
	}

	public int getCompanyManpower() {
		return companyManpower;
	}

	public void setCompanyManpower(int companyManpower) {
		this.companyManpower = companyManpower;
	}

	public char getCompanyCategiry() {
		return companyCategory;
	}

	public void setCompanyCategiry(char companyCategiry) {
		this.companyCategory = companyCategiry;
	}

	public String getCompanyEmailId() {
		return companyEmailId;
	}

	public void setCompanyEmailId(String companyEmailId) {
		this.companyEmailId = companyEmailId;
	}

}
