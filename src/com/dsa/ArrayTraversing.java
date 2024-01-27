package com.dsa;

import java.util.Arrays;

public class ArrayTraversing {

	public static void main(String[] args) {

		int k[] = new int[4];
		k[0] = 10;
		k[1] = 12;
		k[2] = 13;
		k[3] = 15;
		// System.out.println(k);
		System.out.println(Arrays.toString(k));

		//

		for (int e : k) {
			System.out.println(e);
		}

		//

		for (int i = 0; i < k.length; i++) {
			System.out.println(k[i]);
		}

		//

		Object emp[] = new Object[5];
		emp[0] = "Naveen";
		emp[1] = 25;
		emp[2] = 'm';
		emp[3] = 12.33;
		emp[4] = true;

		int count = 0;
		for (Object e : emp) {
			System.out.println(count + "-" + e);
			++count;
		}
		//print reverse order using for loop
		System.out.println("--new line--");
		for(int i=emp.length-1; i>=0; i--) {
			System.out.println(emp[i]);
		}
		
		//print reverse order using for each loop
		System.out.println("--new line--");
		
//		for(Object e : emp.length) {
//			
//		}
		
		
		
		

	}

}
