package com.project.bean;

public class BankDetails {

	// attributes

	private String bankName;
	private String bankAddress;
	private String bankPhoneNumber;
	private String bankEmailId;
	private int bankBranches;
	private int bankEmployees;
	private int bankAccountHolders;
	private float bankPredayTransactions;
	private String bankTimings;
	private String bankStartingDate;

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public String getBankPhoneNumber() {
		return bankPhoneNumber;
	}

	public void setBankPhoneNumber(String bankPhoneNumber) {
		this.bankPhoneNumber = bankPhoneNumber;
	}

	public String getBankEmailId() {
		return bankEmailId;
	}

	public void setBankEmailId(String bankEmailId) {
		this.bankEmailId = bankEmailId;
	}

	public int getBankBranches() {
		return bankBranches;
	}

	public void setBankBranches(int bankBranches) {
		this.bankBranches = bankBranches;
	}

	public int getBankEmployees() {
		return bankEmployees;
	}

	public void setBankEmployees(int bankEmployees) {
		this.bankEmployees = bankEmployees;
	}

	public int getBankAccountHolders() {
		return bankAccountHolders;
	}

	public void setBankAccountHolders(int bankAccountHolders) {
		this.bankAccountHolders = bankAccountHolders;
	}

	public float getBankPredayTransactions() {
		return bankPredayTransactions;
	}

	public void setBankPredayTransactions(float bankPredayTransactions) {
		this.bankPredayTransactions = bankPredayTransactions;
	}

	public String getBankTimings() {
		return bankTimings;
	}

	public void setBankTimings(String bankTimings) {
		this.bankTimings = bankTimings;
	}

	public String getBankStartingDate() {
		return bankStartingDate;
	}

	public void setBankStartingDate(String bankStartingDate) {
		this.bankStartingDate = bankStartingDate;
	}

	@Override
	public String toString() {
		return "BankDetails [bankName=" + bankName + ", bankAddress=" + bankAddress + ", bankPhoneNumber="
				+ bankPhoneNumber + ", bankEmailId=" + bankEmailId + ", bankBranches=" + bankBranches
				+ ", bankEmployees=" + bankEmployees + ", bankAccountHolders=" + bankAccountHolders
				+ ", bankPredayTransactions=" + bankPredayTransactions + ", bankTimings=" + bankTimings
				+ ", bankStartingDate=" + bankStartingDate + "]";
	}

}
