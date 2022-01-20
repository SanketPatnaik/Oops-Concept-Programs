package com.in28minutes.JspidersQuestion;

import java.util.ArrayList;
import java.util.Collections;

public class Company implements Comparable<Company> {

	private int companyId;
	private String category;
	private int employeeCount;
	private double annualTurnOver;

	public Company() {

	}

	public Company(int companyId, String category, int employeeCount, double annualTurnOver) {
		super();
		this.companyId = companyId;
		this.category = category;
		this.employeeCount = employeeCount;
		this.annualTurnOver = annualTurnOver;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	public double getAnnualTurnOver() {
		return annualTurnOver;
	}

	public void setAnnualTurnOver(double annualTurnOver) {
		this.annualTurnOver = annualTurnOver;
	}

	public static int countTheNumberOfCompanyByCategory(String category, Company... companies) {
		int count = 0;
		for (Company company : companies) {
			if (company.getCategory().equals(category)) {
				count = count + company.getEmployeeCount();
			}
		}
		return count;
	}

	public static Company findCompanyWithSecondHighestTurnOver(double turnOver, Company... companies) {
		ArrayList<Company> companyAl = new ArrayList<>();
		for (Company company : companies) {
			if (company.getAnnualTurnOver() >= turnOver) {
				companyAl.add(company);
			}
		}
		Collections.sort(companyAl);
		try {
			return companyAl.get(1);
		} catch (Exception e) {
			System.out.println("There is no such Company");
			return null;
		}

	}

	@Override
	public int compareTo(Company that) {
		return Double.compare(this.getAnnualTurnOver(), that.getAnnualTurnOver());
	}

	@Override
	public String toString() {
		return String.format("CompanyId : %d , Category : %s , Employee Count : %d, " + "Annual Turn Over : %f",
				companyId, category, employeeCount, annualTurnOver);
	}

}
