package strings;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.next().toLowerCase();

		boolean isPalindrome = true;

		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {

			if (str.charAt(i) == str.charAt(j)) {

				continue;
			}

			else {

				isPalindrome = false;
				break;

			}

		}

		System.out.println(isPalindrome ? "isPalindrome" : "isNotPalindrome");
	}

}
