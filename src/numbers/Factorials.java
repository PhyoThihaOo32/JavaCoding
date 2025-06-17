package numbers;

import java.util.Scanner;

public class Factorials {
	
	public static void main(String[]args) {
		
		/*
		 * A factorial is a mathematical operation that multiplies a given positive
		 * integer n by all the positive integers less than it. The factorial of n is
		 * denoted as n! and is defined as:
		 * 
		 *  5! = 5 * 4 * 3 * 2 * 1 = 120 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a numbe and hit enter");
		int input=scan.nextInt();
		
		int fact=1;
		
		for(int i=1;i<=input;i++) {
			
			System.out.print(i+ " ");
			fact=fact*i;
		}
		
		System.out.println();
		System.out.println("Factorial number of "+input+" is "+fact);
		
		
	}	

}
