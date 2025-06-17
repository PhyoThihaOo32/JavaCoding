package numbers;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a Number");
		int num = scan.nextInt();

//		if(num%2==0) {
//			System.out.println(num+" is even number");
//		}
//
//		else {
//
//			System.out.println(num+" is not even number");
//		}
		
		System.out.println(num%2==0? "is even":"is not even");
	}

}
