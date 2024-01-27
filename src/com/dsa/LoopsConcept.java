package com.dsa;

public class LoopsConcept {

	public static void main(String[] args) {

		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
			// ++i;
			// i=i+1;
		}

		//
		int l = 1;
		while (l <= 100) {
			if (l == 5) {
				System.out.println("Hi");
				// break;
			}
			System.out.println(l);
			l++;

		}

		//
		while (true) {
			System.out.println("welcome to Taj hotel 24*7*365");
			break;
		}

		//

		int count = 1;
		while(count<=100) {
			
		System.out.println(count);
			if(count==25) {
				System.out.println("25 runs");
			}
			if(count==50) {
				System.out.println("half century");
			}
			if(count==100) {
				System.out.println("century");
			}
			count++;
		}
		
		//for loop
		System.out.println("------");
		
		int g =1;
		for(; g<=10;) {
			System.out.println(g);
			g++;
		}
		//
		System.out.println("------");
		int h;
		for(h=1; h<=10;) {
			System.out.println(h);
			h++;
		}
		//
		System.out.println("------");
		for(int m=1; m<=10; m++) {//1 2
			System.out.println(m);//3
			m++;//4
		}
		//
//		for(;;) {//if nothing is written it consider into true
//			System.out.println("Bye");
//		}
		
		//
		System.out.println("---+---");
		
		int arr[] = new int[4];
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		arr[3]=350;
		for(int n=0;n<arr.length;n++) {
			System.out.print(arr[n]);
		}

		
		
		
		

	}

}
