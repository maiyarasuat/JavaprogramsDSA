package OOP_Abstraction;

public class FortisHospital implements USMedical, UKMedical, IndianMedical {

	// US
	@Override
	public void psysioServices() {
		System.out.println("FH --- psysioServices");
	}

	@Override
	public void cardioServices() {
		System.out.println("FH --- cardioServices");

	}

	@Override
	public void ENTServices() {
		System.out.println("FH --- ENTServices");

	}

	// UK
	@Override
	public void neuroServices() {
		System.out.println("FH --- neuroServices");

	}

	@Override
	public void orthoServices() {
		System.out.println("FH --- ENTServices");

	}

	// IND
	@Override
	public void oncologyServices() {
		System.out.println("FH --- oncologyServices");

	}

	@Override
	public void dentalServices() {
		System.out.println("FH --- dentalServices");

	}

	@Override
	public void gynoServices() {
		System.out.println("FH --- gynoServices");

	}

	// Individual method
	public void medicalTraining() {
		System.out.println("FH --- medicalTraining");

	}

	public void medicalInsurance() {
		System.out.println("FH --- medicalInsurance");

	}

	//common method
	@Override
	public void emergencyServices() {
		// TODO Auto-generated method stub
		
	}

}
