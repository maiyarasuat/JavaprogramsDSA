package com.dsa;

public class TimeComplexity {

	public static void main(String[] args) {

		//TC ! = time taken
		//Big O notation O(n)
		//
		
		//output --> 00 01 02 03 04 05
		//			 10 11 12 13 14 15
		//	         20 21 22 23 24 25
		//			 30 31 32 33 34 35
		//			 40 41 42 43 44 45
		//			 50 51 52 53 54 55
		
		for(int m=0; m<=5 ; m++) {
			for(int n=0; n<=5; n++) {
				System.out.print(m+""+n+" ");
			}
			System.out.println();

		}
	
	}

}
