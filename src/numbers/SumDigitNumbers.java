package numbers;

import java.util.Scanner;

public class SumDigitNumbers {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num =scan.nextInt();
		
		
		int sum=0;
		
		while(num!=0) {
			
			sum=sum+num%10;//5 9
			num=num/10;//1234
			
	
			
		}
		
	System.out.println(sum);
		
	}

}
