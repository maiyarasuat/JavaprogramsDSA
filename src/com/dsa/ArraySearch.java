package com.dsa;

public class ArraySearch {

	public static void main(String[] args) {

		int num[] = new int[100000];
		// int num[] = { 1,2,3,5, 7, 9, 11, 13 };
		int target = 900;

		int result1 = linearSearch(num, target);
		int result2 = binarySearch(num, target);

		if (result1 != -1) {
			System.out.println("Element found at Index: " + result1);
		} else {
			System.out.println("Element not found");
		}

	}

	public static int linearSearch(int[] num, int target) {

		int steps = 0;
		for (int i = 0; i < num.length; i++) {
			steps++;
			if (num[i] == target) {
				System.out.println("Steps taken by linear : " + steps);
				return i;
			}

		}
		System.out.println("Steps taken by linear : " + steps);

		return -1;
	}

	public static int binarySearch(int[] num, int target) {
		// 5,7,9,11,13

		int steps = 0;
		int left = 0;
		int right = num.length - 1;

		while (left <= right) {
			steps++;
			int mid = (left + right) / 2;

			if (num[mid] == target) {
				System.out.println("Steps taken by binary : " + steps);

				return mid;
			}

			else if (num[mid] < target) {
				left = mid + 1;
			}

			else {
				left = mid - 1;
			}
		}

		System.out.println("Steps taken by binary : " + steps);

		return -1;
	}
}
