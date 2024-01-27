package com.dsa;

import java.util.ArrayList;

public class ArrayListRemoveConcept {

	public static void main(String[] args) {

		ArrayList<String> empList = new ArrayList<String>();//ArrayList maintain order
		empList.add("karishma");//0							//continue memory allocation
		empList.add("Tom");//1
		empList.add("Rina");//2
		empList.add("Ravi");//3
		empList.add("Azmoon");//4
		empList.add(null);
		empList.add(null);//alow N number of null values
		empList.add("Azmoon");//alow duplicates

		System.out.println(empList);

		empList.add("Naveen");//5
		System.out.println(empList);

		empList.add(1, "shubham");//not deleting  
		System.out.println(empList);
		
		empList.remove(2);//deleting
		System.out.println(empList);

		empList.add("nandy");//7
		System.out.println(empList);

		
		
	}

}
