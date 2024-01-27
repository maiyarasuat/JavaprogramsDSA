package com.dsa;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList(); // here pc=0;vc=10
		ar.add(100);// Index-0
		ar.add(250);// 1
		System.out.println(ar.get(1));
		System.out.println(ar.size());

		ar.add(350);// 2
		System.out.println(ar.get(2));
		System.out.println(ar.size());

		ar.add(490);// 3
		ar.add(500);// 4
		ar.add(650);// 5
		ar.add(700);// 6

		System.out.println(ar.get(6));
		System.out.println(ar.size());

//		System.out.println(ar.get(-1)); IOBE
//		System.out.println(ar.get(7));  IOBE

		System.out.println(" -- raw list printing --");

		// raw arraylist

		ArrayList raw = new ArrayList();
		raw.add("String value");
		raw.add('m');
		raw.add(false);
		raw.add(56.57);

		System.out.println(raw.size());

		// Integer arraylist
		ArrayList<Integer> list = new ArrayList<Integer>(); // < >-->diamond bracket

		list.add(100);
		list.add(200);
		list.add(244);
//	    list.add(1.11);

		// Double static array
		ArrayList<Double> listEmp = new ArrayList<Double>();
		listEmp.add(11.11);
		listEmp.add(22.23);
		listEmp.add(44.4);

		// String arraylist
		ArrayList<String> listComp = new ArrayList<String>();
		listComp.add("shubham");
		listComp.add("pooja");

		//

		// Object array

		System.out.println("===");
		ArrayList<Object> obj = new ArrayList<Object>();

		obj.add("Naveen");

		System.out.println(obj.get(0));

		obj.add('m');
		obj.add(false);
		obj.add(44.44);
		obj.add(2000);

		// string

		System.out.println("====");

		ArrayList<String> str = new ArrayList<String>();

		str.add("selenium");
		str.add("cypress");
		str.add("100");
		str.add("playwright");

		System.out.println(str.get(2));

	}

}
