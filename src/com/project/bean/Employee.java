package com.project.bean;

public class Employee {

	private String empName;
	private String empId;
	private String empJoingDate;
	private String empDep;
	private double empSalary;
	private String empDeign;

	public Employee() {

	}

	public Employee(String empName, String empId, String empJoingDate, String empDep, double empSalary,
			String empDeign) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empJoingDate = empJoingDate;
		this.empDep = empDep;
		this.empSalary = empSalary;
		this.empDeign = empDeign;

	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpJoingDate() {
		return empJoingDate;
	}

	public void setEmpJoingDate(String empJoingDate) {
		this.empJoingDate = empJoingDate;
	}

	public String getEmpDep() {
		return empDep;
	}

	public void setEmpDep(String empDep) {
		this.empDep = empDep;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpDeign() {
		return empDeign;
	}

	public void setEmpDeign(String empDeign) {
		this.empDeign = empDeign;

	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empJoingDate=" + empJoingDate + ", empDep="
				+ empDep + ", empSalary=" + empSalary + ", empDeign=" + empDeign + "]";
	}

}
