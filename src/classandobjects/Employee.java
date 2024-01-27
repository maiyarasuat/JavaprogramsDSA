package classandobjects;

public class Employee {

	// global (or)class (or)instance variables

	String name;
	int marks;
	String grade;

	public static void main(String[] args) {

		// local variable
		int i = 19;

		Employee obj = new Employee();
		obj.name = "Ravi";
		obj.marks = 75;
		obj.grade = "C+";

		Employee obj2 = new Employee();
		obj2.name = "Azmoon";
		obj2.marks = 80;
		obj.grade = "B";

		Employee obj3 = new Employee();
		obj3.name = "Naveen";
		obj3.marks = 90;
		obj3.grade = "A";

		System.out.println(obj.name);
		System.out.println(obj2.marks);
		System.out.println(obj3.grade);
	}

}
