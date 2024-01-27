package com.dsa;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {

		int p[] = new int[5];
		p[0] = 100;
		p[1] = 200;
		//li=0;hi=4;length=5
		//p[5] = 300;
		//System.out.println(p[5]); //cant go beyond the range
		
		
		int q[] = {1,2,3,4,5,6,7,8,9,10};//hi=9;
//		q[10] = 11;
//		System.out.println(q[10]);
		
		double d[] = {12.33, 23,33, 11.11, 56.66};
		char e[] = {'a', 'c' , 'm', 'f'};
		String s[] = {"shubham" , "pooja" , "naveen"};
		Object studentInfo[] = {"naveen", 20 , 12.31 , 'm' , "TN" ,false};
		System.out.println(Arrays.toString(d));
		System.out.println(Arrays.toString(e));
		
		//for each loop
		
		for(String f : s) {
			System.out.println(f);
		}
		
		for(Object z : studentInfo) {
			System.out.println(z);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
