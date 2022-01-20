package com.in28minutes.JspidersQuestion;

import java.util.Scanner;

public class BankInvestmentRunner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of years :");
		int year = scan.nextInt();
		int total = calculateTotalInvestment(year);
		System.out.println("The total investment is " + total);
	}
	public static int calculateTotalInvestment(int year) {
		int sum = 0;
		int diff = year % 7;
		if (year <= 7) {
			for (int i = 1; i <= year; i++) {
				sum = sum + i;
			}
		} else if (year > 7 && year <= 100) {
			int count = 1;
			for (count = 1; count <= year / 7; count++) {
				for (int j = 1; j <= 7; j++) {
					sum = sum + j;
				}
			}
			for (int i = count; i <= diff + 1; i++) {
				sum = sum + i;
			}
		} else {
			System.out.println("You have entered the wrong input");
		}
		return sum;
	}
}
