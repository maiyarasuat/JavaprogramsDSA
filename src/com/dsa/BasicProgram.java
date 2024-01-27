package com.dsa;

import java.util.Arrays;

public class BasicProgram {

	public static void main(String[] args) {

		int p[] = { 1, 4, 5, 2, 3, 22, 31, 2 };

		int a[] = new int[p.length - 1];
		int j = 0;

		for (int i = 0; i<=7; i++) {
			if (p[i] != 4) {
				a[j] = p[i];
				j++;
			}
		}

		System.out.println(Arrays.toString(a));

	}

}
