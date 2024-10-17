package week1.homeassignments;

public class FibonacciSeries {

    //To find fibonacci series for given range:8
	//we use for loop for iteration
	//To execute the program we need main method
	
	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		int num3;
		System.out.println("-----Print fibonacci series-----");
		System.out.print(num1+","+num2);
		for (int i=1;i<=6;i++) {
			num3 = num1+num2;
			System.out.print(","+num3);
			
			//write a logic or condition
			
				num1=num2;
				num2=num3;
								}
					
											}
								}
	
	
	
	
	
	

