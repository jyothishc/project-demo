package com.project.main;

import com.project.bean.BankDetails;

public class BankDetailsMain {
	// static method

	private static void setBankDetails() {
		// object creation

		BankDetails bank = new BankDetails();
		bank.setBankName("State Bank Of India");
		bank.setBankAddress("Galiveedu, Andhrapradesh 516267");
		bank.setBankPhoneNumber("+91 9876543210");
		bank.setBankEmailId("@sbi.co.in");
		bank.setBankBranches(4);
		bank.setBankEmployees(12);
		bank.setBankAccountHolders(200000);
		bank.setBankPredayTransactions(3000000);
		bank.setBankTimings("mon-sat 10AM-4PM");
		bank.setBankStartingDate("01-feb-2002");
		
		
		System.out.println("BankDetails");
		System.out.println(bank);
	    System.out.println();
	}

	// main method
	public static void main(String args[]) {
		// static method calling
		setBankDetails();

	
	
	//create the non static method or instance method
	BankDetailsMain bankDetails =new BankDetailsMain();
	BankDetails response = bankDetails.getBankdetails();  //non static method

	System.out.println("my Bank Details ::"+response);
	
	//get the values such as Bank Name,Address,PhoneNumber,Timings about BankDetails
	}
	private BankDetails getBankdetails() {        //method declaration
		
		//creating the BankDetails object
		BankDetails getBankDetails = new BankDetails();
		getBankDetails.setBankName("State Bank Of India");
		getBankDetails.setBankPhoneNumber("+91123654798");
		getBankDetails.setBankAddress("Galiveedu");
		
		
		
		return getBankDetails;
		
		
	}
	
	

}
