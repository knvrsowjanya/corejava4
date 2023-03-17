package test;

import java.util.Scanner;

public class Conditioneaxample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter the age");
		
		age = scanner.nextInt();
		
		if(age<17) {
		
		System.out.println("you are not eligble for writing the 10 class exams");
		
		}else if(age == 17) {
			
			System.out.println("you are not eligble writing the 10 class exams");
			
		}else {
			
			System.out.println("you are eligble writing the 10 class exams if you are more than 17");
		}
		
		scanner.close();

	}

}
