package ExceptionHandling;

public class Employee {

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		
		
		try{
		int i = 5/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception is coming here");
			e.printStackTrace();
		}
		
		
		
		
		System.out.println("Bye");
		
		
		
		
		
		
		
		
		
		
	}

}
