package classandobjects;

public class Student {
	String name;
	int marks;
	char grade;

	public static void main(String[] args) {

		Student s = new Student();
		s.name = "Naveen";
		s.marks = 70;
		s.grade = 'c';

		Student s1 = new Student();
		s1.name = "Azmoon";
		s1.marks = 80;
		s1.grade = 'b';

		Student s2 = new Student();
		s2.name = "Ravi";
		s2.marks = 90;
		s2.grade = 'a';

		System.out.println(s.name + " " + s.marks + " " + s.grade);
		System.out.println(s1.name + " " + s1.marks + " " + s1.grade);
		System.out.println(s2.name + " " + s2.marks + " " + s2.grade);

		// no ref obj

		new Student();
		new Student().name = "natasa";
		new Student().marks = 50;
		new Student().grade = 'e';

		// just the reference name

		Student f1;
		f1 = new Student();
		f1.name = "kolar";

		// null
//		
//		Student s3 = new Student();
//		s3 = null;
//		
//		s3.marks = 200;
//		System.out.println(s3.marks);//NPE

	}

}
