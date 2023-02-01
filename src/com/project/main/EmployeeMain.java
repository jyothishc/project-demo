package com.project.main;

import com.project.bean.Employee;

public class EmployeeMain {

	// main method
	public static void main(String args[]) {

		// creating the Employee object
		Employee employee = new Employee();
		employee.setEmpName("jyotheesh");
		employee.setEmpDeign("TCS 007");
		employee.setEmpJoingDate("30-April-2020");
		employee.setEmpDep("IT");
		employee.setEmpSalary(40000.36);
		employee.setEmpDep("sr.softwear engineer");

		// System.out.println("Display the Employee Details :: "+employee);
		System.out.println("Display the Employee Details");
		System.out.println(employee);

		System.out.println();

		System.out.println("Employee Name : " + employee.getEmpName());
		System.out.println("Employee Salary : " + employee.getEmpJoingDate());

	}

}
