package com.dsa;

public class FinalKeyword {

	public static void main(String[] args) {

		int a = 10;
		a = 20;
		a = 22;
		a = 34;

		System.out.println(a);

		final int days = 7;
		// days = 8;
		int totalAmount = days * 100;
		System.out.println("one week salary is: " + totalAmount);

		final String title = "LoginPage";

		final double basePrice = 12.22;

		final char gender = 'f';
	}

}
