package numbers;

import java.util.Scanner;

public class PrimeNumbers {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number and hit enter");
		int input = scan.nextInt();
		
		System.out.println(isPrime(input)? "isPrime":"isNotPrime");
		printPrimeNumber(20);
		
	}
	
	public static boolean isPrime(int num) {
		
		if(num<=1) {
			
			return false;
		}
		
		for(int i=2;i<num;i++) {
			
			if(num%i==0) {
				
				return false;
				
			}
		}
		
		return true;
		
	}
	
	public static void printPrimeNumber(int x) {
		
		for(int i=2;i<x;i++) {
			
			if(isPrime(i)) {
				
				System.out.print(i+ " ");
				
			}
			
		}
	}

	

}