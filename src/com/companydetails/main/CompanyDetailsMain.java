package com.companydetails.main;

import com.companydetails.bean.CompanyDetails;

public class CompanyDetailsMain {
	// main method
	public static void main(String args[]) {
		// creating the CompanyDetails object
		CompanyDetails companyDetails = new CompanyDetails();
		companyDetails.setCompanyName("TCS");
		companyDetails.setCompanyPhoneNumber("+91 1234567890");
		companyDetails.setCompanyAddress("Hydrebad,madhapur,road no:10");
		companyDetails.setCompanyGST("19AABCU9603R1ZL");
		companyDetails.setCompanyTurnover(300000);
		companyDetails.setCompanyManpower(500);
		companyDetails.setCompanyCategiry('B');
		companyDetails.setCompanyEmailId("Caree@tcs.com");

		System.out.println("Display the CompanyDetails");
		System.out.println(companyDetails);
		System.out.println();

		System.out.println("CompanyName :" + companyDetails.getCompanyName());
		System.out.println("Address : " + companyDetails.getCompanyAddress());
		System.out.println("Categiry :" + companyDetails.getCompanyCategiry());
		System.out.println("PhoneNumber :" + companyDetails.getCompanyPhoneNumber());
		

	}

}
