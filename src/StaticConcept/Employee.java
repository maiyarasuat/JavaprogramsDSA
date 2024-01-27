package StaticConcept;

public class Employee {

	String name; //non static variable
	static int age; //static variable
	
	
	public static void main(String[] args) {
		
		
	//calling non static variable
		
		Employee e = new Employee();
		e.name = "Naveen";
		
	//calling a static variable
	//1 call using classname
		
		Employee.age = 28;
	//2 call using name itself
		//age = 29;
	//3 call using object name
		//e.age = 30;
		
	//printing static variable	
		
		System.out.println(Employee.age);
		
		
		
		
		
		

	}

}
