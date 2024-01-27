package com.dsa;

public class ConditionalOperators {

	public static void main(String[] args) {

		System.out.println(10==20);
		
		int x = 10;
		int y = 20;
		if(x==y) {
			System.out.println("x is eq to y");
		}
		else {
			System.out.println("x is not eq to y");
		}
		
		//
		int marks = 129;
		if(marks<=100) {
			if(marks>=90) {
				System.out.println("A Grade");
			}
			else {
				System.out.println("B Grade");
			}
		}
		else {
			System.out.println("Incorrect marks");
		}
		
		//
		String browser = "chrome";
		if(browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		else if(browser.equals("safari")) {
			System.out.println("launch safari");

		}
		else if(browser.equals("firefox")) {
			System.out.println("launch firefox");

		}
		else if(browser.equals("edge")) {
			System.out.println("launch edge");

		}
		else {
			System.out.println("please pass the right browsr :" + browser);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
