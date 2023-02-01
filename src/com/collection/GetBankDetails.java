package com.collection;

import java.util.ArrayList;
import java.util.List;

import com.project.bean.BankDetails;

public class GetBankDetails {
	// create the main method
	public static void main(String args[]) {

		// GetBankDetails get = new GetBankDetails();
		// List<BankDetails> bankDetails = get.setBankDetails();
		List<BankDetails> bankDetails = new GetBankDetails().setBankDetails();
		System.out.println(bankDetails);
	}

	// instance method to get the address details into that list object
	public List<BankDetails> setBankDetails() {
		// create the list object to set the bank details into the list object
		List<BankDetails> ListOfBankDetails = new ArrayList<BankDetails>();
		// create the Bank object
		BankDetails primaryBankDetails = new BankDetails();
		primaryBankDetails.setBankName("STATE BANK OF INDIA");
		primaryBankDetails.setBankAddress("Galiveedu");
		primaryBankDetails.setBankPhoneNumber("+91 123456789");
		primaryBankDetails.setBankEmailId("Sbi@gamil.com");
		primaryBankDetails.setBankBranches(1);
		primaryBankDetails.setBankEmployees(12);
		primaryBankDetails.setBankAccountHolders(5000);
		primaryBankDetails.setBankPredayTransactions(200000);
		primaryBankDetails.setBankTimings("9.00 AM TO 4.00 PM");
		primaryBankDetails.setBankStartingDate("01-03-1992");

		// create the Secondary Bank details
		BankDetails secondaryBankDetails = new BankDetails();
		secondaryBankDetails.setBankName("STATE BANK OF INDIA 2");
		secondaryBankDetails.setBankAddress("Galiveedu Bustand");
		secondaryBankDetails.setBankPhoneNumber("+91 987654321");
		secondaryBankDetails.setBankEmailId("sbi2@gamil.com");
		secondaryBankDetails.setBankBranches(2);
		secondaryBankDetails.setBankEmployees(10);
		secondaryBankDetails.setBankAccountHolders(2000);
		secondaryBankDetails.setBankPredayTransactions(12200);
		secondaryBankDetails.setBankTimings("9.00 AM TO 4.00 PM");
		secondaryBankDetails.setBankStartingDate("05-06-1999");

		// use Add() method to insert the values into List object
		ListOfBankDetails.add(primaryBankDetails);
		ListOfBankDetails.add(secondaryBankDetails);

		return ListOfBankDetails;

	}

}
