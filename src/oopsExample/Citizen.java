package oopsExample;

public class Citizen extends Person {
	
	public int SSN;
	
	public Citizen() {
		
		System.out.println("inside default cons of Citizen");
	}
	
	public Citizen(String Name, String CountryName, int age, int SSN) {
		System.out.println("Inside param cons of Citizen");
		
		this.Name = Name;
		this.CountryName = CountryName;
		this.age = age;
		this.SSN = SSN;	
	}
	
	public void Print() {
		
		System.out.println("SSN is " + SSN);
		
	}

}
