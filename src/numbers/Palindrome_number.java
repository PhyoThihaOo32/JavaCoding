package numbers;

import java.util.Scanner;

public class Palindrome_number {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int input=scan.nextInt();
		
		int num=input;
		
		int rev=0;
		
		while(num!=0) {
			
			rev=rev*10+num%10;//1 10 101
			num=num/10;//10 1
			
		}
		
		if(rev==input) {
			
			System.out.println(input+" is Palindrome Number");
		}
		
		else {
			
			System.out.println("is not Palindrome");
		}
		
		
	}

}
