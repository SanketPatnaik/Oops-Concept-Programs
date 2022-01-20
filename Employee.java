package com.in28minutes.oops2;

public class Employee extends Person {
	private String title;
	private String employer;
	private String employeeGrade;
	private double salary;

	public Employee(String name, String phoneNumber, String emailId, String title, String employer,
			String employeeGrade) {
		super(name, phoneNumber, emailId);
		this.title = title;
		this.employer = employer;
		this.employeeGrade = employeeGrade;
	}

	public String getTitle() {
		return title;
	}

	public String getEmployer() {
		return employer;
	}

	public String getEmployeeGrade() {
		return employeeGrade;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return String.format(super.toString() + " Title - %s, Employer - %s, EmployeeGrade - %s ", title, employer,
				employeeGrade);
	}

}
