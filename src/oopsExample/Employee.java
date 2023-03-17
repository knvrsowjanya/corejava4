package oopsExample;

public class Employee {
	
	public String Name;
	public int Empid;
	private  static int Salary = 5000;
	
	
	public Employee() {
		
		System.out.println("Inside the default construction");
	}
	
	public Employee(String var1,int var2) {
	
	Name = var1;
	Empid = var2;
	
	}
	
	public void DisplayName() {
		
		System.out.println("Name of the Employee is" + Name);
	}
	
	public static void DisplaySalary() {
		
		System.out.println("Salary  of the all employee is  " + Salary);
		
	}
}
	