package numbers;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Number and Hit Enter");
		
		int input=scan.nextInt();
		
		int x1=0;
		int x2=1;
		int x3=x1+x2;
		
		for(int i=0;i<=input;i++) {
			
			System.out.print(x1+" ");
			// 0  	1 	 1
			// x1	x2	x3
			//		x1  x2  	x3
			
			x1=x2;
			x2=x3;
			x3=x1+x2;
			
		}
		
		}
		
	

}
