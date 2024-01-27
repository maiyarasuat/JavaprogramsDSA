package com.dsa;

public class Operators {

	public static void main(String[] args) {
		
		//a++ --> post increment
		int a = 1;
		int b = a++;

		System.out.println(a);
		System.out.println(b);

		int c = -99;
		int d = c++;

		System.out.println(c); // -99+1 = -98
		System.out.println(d); // d = c = -99
		
		char e = 'a';
		char e1 = e++;
		System.out.println(e);//a==> 97 aasci value
		System.out.println(e1);
		
		int p = 10;
		int q = p--;
		System.out.println(p);//9
		System.out.println(q);//10

		//pre decrement
		int v1 = -96;
		int v2 = --v1;
		System.out.println(v1);//-96-1 = -97
		System.out.println(v2);//-97
		
		int test = 5;
		System.out.println(test++);//here println is the consumer but 6 in the memory
		System.out.println(test);
		
		int i=19, j = 29 ;
		int k;
		k=i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
		//19-18+28-29+18-29+19-28
		System.out.println("i = :" +i);
		System.out.println("j = :" +j);
		System.out.println("k = :" +k);
		

	}

}
