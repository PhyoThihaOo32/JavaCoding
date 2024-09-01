package strings;

public class ExtractOnlyNumberFromString {

	public static void main(String[] args) {
		
		String original ="Phyo1234";
		String onlyNumber =original.replaceAll("[aA-zZ]", "");
		
		System.out.println(onlyNumber);
		
		String original1="Hello World 1234";
		String onlyLetter =original1.replaceAll("[0-9]","");
		
		System.out.println(onlyLetter);
		
		String str = "heiou12345";
		String newStr = str.replaceAll("[^0-9]","");
		
		System.out.println(newStr);
		
		String junk = "!@#$$jkeil()_+43Ke";
		System.out.println(junk.replaceAll("[^a-zA-Z0-9]", ""));
		
		
		
		/*
		 * Regular Expressions (Regex): The pattern [0-9] matches any digit from 0 to 9
		 * The caret ^ inside square brackets [^...] negates the pattern, matching
		 * any character that is not a digit. //Method Usage: replaceAll() is useful
		 * when you want to remove //or replace specific patterns of characters from a
		 * string based on regular expressions. //String Manipulation: This method is
		 * efficient for scenarios where you need to filter out //or extract specific
		 * types of characters from a string.
		 */
		
	}
	
}
