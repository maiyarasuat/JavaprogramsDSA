package OOP_Abstraction;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.psysioServices();
		fh.cardioServices();
		fh.emergencyServices();
		fh.medicalInsurance();
		fh.dentalServices();
		fh.ENTServices();
		fh.neuroServices();
		fh.medicalTraining();

		// can not create object of the interface

		// top casting

		USMedical us = new FortisHospital();
		// us.medicalInsurance(); can not use fh methods
		us.emergencyServices(); // can access common methods using parent reference variable name
		// us.neuroServices(); can not access other class methods using parent reference
		// variable name
		
		//down casting
		//can not do bcoz interface never have create obj 

	}

}
