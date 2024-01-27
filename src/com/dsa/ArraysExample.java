package com.dsa;

import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {

		Object player[] = new Object[5];
		player[0] = "Shubham";
		player[1] = 20;
		player[2] = 'm';
		System.out.println(Arrays.toString(player));
		
		int i[] = new int[2];
		i[0] = 1;
		System.out.println(Arrays.toString(i));
		
		double d[] = new double[3];
		d[0] = 11.11;
		d[1] = 22.22;
		System.out.println(Arrays.toString(d));

		char c[] = new char[6];
		c[0] = 'a';
		c[1] = 'b';
		c[2] = 'c';
		System.out.println(Arrays.toString(c));
		
		String s[] = new String[6];
		s[0] = "shubam";
		s[1] = "poojA";
		System.out.println(Arrays.toString(s));
		
		boolean n[] = new boolean[8];
		n[0] = true;
		n[1] = true;
		n[2] = true;
		System.out.println(Arrays.toString(n));
		
		
		//          0 1 2 3 4  5  6
		int in[] = {2,4,6,8,10,12,14};
		System.out.println(Arrays.toString(in));
		in[0]=1;
		System.out.println(Arrays.toString(in));
//		in[7]=8;
//		System.out.println(Arrays.toString(in));

		
			
	}

}
