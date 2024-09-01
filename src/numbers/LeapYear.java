package numbers;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		
		if(year%4==0) {
			
			System.out.println(year+" is a leap year");
		}
		
		else {
			
			System.out.println("is not leap year");
		}
		
	}

}
