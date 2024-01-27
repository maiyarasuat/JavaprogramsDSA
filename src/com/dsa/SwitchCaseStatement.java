package com.dsa;

public class SwitchCaseStatement {

	public static void main(String[] args) {

		String browser = "naveen";

		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "edge":
			System.out.println("launch edge");
			break;

		default:
			System.out.println("please pass the right browser: " + browser);
			break;
		}

	}

}
