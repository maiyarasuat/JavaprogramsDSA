package com.dsa;

public class StringWithQuotes {

	public static void main(String[] args) {

		String str = "I love \"Java\" and its Concepts";

		System.out.println(str);

		String username = "admin";
		String password = "admin@123";

		String url = "https://" + username + ":" + password + "@abc.com/login.html";

		// a[text()='Priya'];

		String userName = "Priya";
		String xpath = "a[text()='" + userName + "']";
		System.out.println(xpath);

	}

}
