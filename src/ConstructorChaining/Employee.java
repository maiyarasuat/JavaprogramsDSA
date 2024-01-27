package ConstructorChaining;

public class Employee {

	String name;
	int age;
	double salary;

	public Employee() {
		this("Tom", 25);
	}

	public Employee(String name, int age) {
		this("Mitaj", 27, 12.33); //re-asignment happening
		this.name = "Naveen";
		this.salary = 22.33;

	}

	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;

	}

	public static void main(String[] args) {

		Employee emp = new Employee();
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.salary);
	}

}
