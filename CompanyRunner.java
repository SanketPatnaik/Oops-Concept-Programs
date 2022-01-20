package com.in28minutes.JspidersQuestion;

import java.util.Scanner;

public class CompanyRunner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Company[] companies = { new Company(), new Company(), new Company(), new Company() };

		for (Company company : companies) {
			System.out.println("Enter the Company ID : ");
			int id = scan.nextInt();
			company.setCompanyId(id);
			System.out.println();

			System.out.println("Enter the Category : ");
			String category = scan.next();
			company.setCategory(category);
			System.out.println();

			System.out.println("Enter the Employee Count : ");
			int count = scan.nextInt();
			company.setEmployeeCount(count);
			System.out.println();

			System.out.println("Enter the Annual Turn Over : ");
			double turnOver = scan.nextDouble();
			company.setAnnualTurnOver(turnOver);
			System.out.println();
		}

		for (Company company : companies) {
			System.out.println(company);
		}

		System.out.println("Enter the sorting Category");
		String sortCategory = scan.next();
		int count = Company.countTheNumberOfCompanyByCategory(sortCategory, companies);

		System.out.println("Enter the Searching Turn Over");
		double searchTurnOver = scan.nextDouble();
		Company c1 = Company.findCompanyWithSecondHighestTurnOver(searchTurnOver, companies);

		if (count == 0) {
			System.out.println("There is no such Company");
		} else {
			System.out.println("The total number of employees is :" + count);
		}
		if (c1.equals(null)) {
			System.out.println("There is no such company");
		} else {
			System.out.println(c1);
		}

	}

}
