package com.dsa;

public class LoopsConcept_2 {

	public static void main(String[] args) {
		//10-1
		
		int i = 10;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
		
		for(int j=10;j>=1;j--) {
			System.out.println(j);
		}
		
		int k=1;
		do {
			System.out.println(k);
			k++;
		} while (k<=10);
		
		//print a-z using for loop
		
		for(char c='a'; c<='z'; c++) {//calculating the basis of internal assci system
			System.out.println(c + "-" +(int)c);
//			System.out.println(c);
		}
		
		
		
		
		
		
		
	}

}
