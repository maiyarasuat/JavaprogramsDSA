package com.dsa;

import java.util.ArrayList;

public class ArrayListTraversing {

	public static void main(String[] args) {

		ArrayList<Integer> marksList = new ArrayList<Integer>();

		marksList.add(100);
		marksList.add(200);
		marksList.add(300);
		marksList.add(400);
		marksList.add(500);
		marksList.add(600);

		System.out.println(marksList);

		System.out.println(marksList.get(2));

		// for loop
		for (int i = 0; i < marksList.size(); i++) {
			System.out.println(marksList.get(i));
			if (marksList.get(i).equals(600)) {
				System.out.println("Hiiiii");
			}
		}

		// for each
		for (Integer e : marksList) {
			System.out.println(e);
		}

		//
		System.out.println();

		ArrayList<Object> str = new ArrayList<Object>();

		str.add("selenium");
		str.add("cypress");
		str.add(100);
		str.add("playwright");

		for (Object e : str) {
			System.out.println(e);
			if (e.equals(100)) {
				System.out.println("expected");
			}
		}
	}

}
