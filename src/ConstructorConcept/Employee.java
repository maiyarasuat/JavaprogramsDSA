package ConstructorConcept;

public class Employee {

	String name;
	int age;
	String city;

//	public Employee(String name, int age, String city) { //generate constructor by source - generate
//		this.name = name;
//		this.age = age;
//		this.city = city;
//	}

	public Employee() { // 0 param constructor or default const
		System.out.println("default constructor");
	}

	public Employee(int a) {
		System.out.println("Integer const");
	}

	public Employee(int a, int b) {

	}

	public Employee(int c, String d) {

	}

	public Employee(String d, int c) {

	}

	public static void main(String[] args) {

		Employee e1 = new Employee(10);
		// e1.name = "Tom";

		
		
		
		
		
		
		
	}

}
