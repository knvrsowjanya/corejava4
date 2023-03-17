package test;

public class Forloopexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int num = 2;
		 
		 for(int i=1;i<=10;i++) {
		 
			 //System.out.println(num*i);
			 
			System.out.printf("%d * %d = %d \n" , num , i, num*i);
			 
			 
		 }
		 
		 System.out.println("end of for loop");
		 
		 int[] arr1= {1,4,3,6,5,8};
		 
		 for(int i=0;i<arr1.length;i++) {
			 
			 System.out.println("Element value is " + arr1[i]);
			 
		 }
		 
		 //for each loop
		 
		 for(int val:arr1) {
			 
		 
		 
		 System.out.println(" value is " + val);
		 
			 
		 } 
	 
		 String str1 = "Sowjanya is from AP";
		 
		 for (int i=0;i<str1.length();i++) {
		 
	 System.out.println("char value is " + str1.charAt(i));
		 }
		 

	}

}