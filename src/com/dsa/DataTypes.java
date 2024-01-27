package com.dsa;

public class DataTypes {

	public static void main(String[] args) {

		byte b = 10;
		byte b1 = 20;

		b1 = 22;
		System.out.println(b1);

		short s = 32000;

		int i = 2000000;

		long l = 123456789988l;
		System.out.println(l);

		float g = 12.23f;
		float g1 = (float) 12.33;

		double g2 = 12.444444;

		char c = 'a'; // alphabetic char //only allow single dig char
		char c1 = '2'; // numeric charcter
		char c2 = '@'; // special character
		System.out.println(c + c1);
		System.out.println((int) c);// typecasting-->to know aasci value
		System.out.println((byte) '@');
		
		int pop = 101;
		char popup = 'b';
		System.out.println(pop + popup);
		
		
		
		

	}

}
