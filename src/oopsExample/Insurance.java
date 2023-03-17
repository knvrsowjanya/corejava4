package oopsExample;

public class Insurance extends Citizen {

	public int InsuranceId;
	
	public Insurance() {
		
		System.out.println("inside default cons of Insura");
	}
	
	public void Print() {
		
		super.Print();
		
		System.out.println("Insurance Id is " + InsuranceId);
		
}
}