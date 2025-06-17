package numbers;

import java.util.Scanner;

public class StrictDivisors {

	public static void main(String[] args) {
		/*
		 * A strict divisor of a number n is any divisor of n other than n itself. For
		 * example, the strict divisors of 12 are 1, 2, 3, 4, and 6 (but not 12).
		 */
		
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		
		
		System.out.println("Strict Divisor of "+num+" are ");
		for(int i=1;i<num;i++) {
			
			if(num%i==0) {
				
				System.out.print(i+" ");
				
			}
			
			
			
		}
		
	
	}
	
}
