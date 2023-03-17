package test;

public class Reversalexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "MOM";
		
		String result ="";
		
		for(int i=str1.length()-1;i>=0;i--) {
			
		result = result + str1.charAt(i);
			
		}
		
		System.out.println("Reversed string is " + result);
		
		if (str1.equalsIgnoreCase(result) ) {
			
			System.out.println("given string is palindrome");
			
		}else {
			
		System.out.println("given string is not palindrome");	
				
			
			
		}
		
		
		

//------------------------

 String str2 = "Sowjanya meets Devi";

String[] arr = str2.split(" ");

String result1= "";

for(int i=arr.length-1;i>=0;i--) {
	
	result1=result1+arr[i]+" ";

}
System.out.println(" the result is" + result1.trim());

			
}			

}
		
		

	



		