package com.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<String> ar = new ArrayList<String>(20);// default-vc-10
		// pc & vc concept

		//

		ArrayList<Integer> emp = new ArrayList<Integer>();
		emp.add(1); // 0
		emp.add(2); // 1
		emp.add(3); // 2
		emp.add(4); // 3

//		emp.remove(2);//removing index based even selected object
//		System.out.println(emp);//1 2 4

		emp.remove((Object) 2);// typecasting
		System.out.println(emp);// 1 3 4

		//
		ArrayList<String> browserList = new ArrayList<String>(Arrays.asList("chrome", "edge", "firefox"));
		System.out.println(browserList);
		System.out.println(browserList.size());
		System.out.println(browserList.get(0));

		for (String e : browserList) {
			System.out.println(e);

		}

		//

		ArrayList<String> empList = new ArrayList<String>(Arrays.asList("Tom", "sagar", "naveen", "shubham"));
		System.out.println(empList);
//		Collections.reverse(empList);//collection is the class which already predefined in java library
//		System.out.println(empList);
//
//		for(String e : empList) {
//			System.out.println(e);
//		}

		// print reverse order using for loop
		for (int i = empList.size() - 1; i >= 0; i--) {
			System.out.println(empList.get(i));
		}

		// array to arrayList
		Integer num[] = { 12, 34, 44, 55, 56, 87, 43 };
		List<Integer> numberList = Arrays.asList(num);
		System.out.println(numberList.size());

		// list to arraylist
		String browser[] = { "Chrome", "firefox", "safari" };
		List<String> st = Arrays.asList(browser);
		System.out.println(st.size());

		//

		// new trick to write array

		ArrayList<String> langList = new ArrayList<String>() {
			{
				add("java");
				add("phython");
				add("c#");
			}
		};
		System.out.println(langList.size());
		System.out.println(langList);
		langList.add("ruby");
		System.out.println(langList);

	}

}
