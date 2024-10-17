package week1.homeassignments;

public class IsPrimeNumber {
	
	
	public static void main(String[] args) {
		
		int num=13;
		int count=0;
		
		//first if condition: we check for number is less than 1 or equal to 1
		if(num<=1) {
			System.out.println("Number is not prime");
		}
	//now second condition we check from 2 to n-1
		int i=2;
		for( i=2;i<=num/2;i++)
			if(num%i==0) {
				count=1;
				
			}
				if(count==0) {
					System.out.println("Number is prime");
			}else {
				System.out.println("Number is not prime");
				
			}
			
		
	}
	

}
