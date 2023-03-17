package test;

public class loopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print 1 to 10 using while loop
		
		int num = 1;
		
		while(num<11) {
			
			System.out.println(num);
			
			num = num + 1;
					
		}
		
		System.out.println("end of the while loop1");
		
		int num1 = 10;
		
		while(num1>0) {
			
			if (num1 == 5) {
				
				System.out.println("skip");
				
				num1--;
				
				continue;
				
				
			}
			
			
			
			System.out.println(num1);
			
			num1 =num1 - 1;
			
		}
		
		System.out.println("end of the while loop2");
			
		}

	}


