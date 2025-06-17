package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Finding_Duplicates_Character_String {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		findDuplicate(input);
		
		scan.close();

	}
	
	public static void findDuplicate(String str) {
		
		Map<Character,Integer> countChar = new HashMap<>();
		char[] chars = str.toCharArray();
		
		for(char c:chars) {
			
			if(countChar.containsKey(c)) {
				
				countChar.put(c, countChar.get(c)+1);
			}
			
			else {
				countChar.put(c,1);
			}
		}
		
		System.out.println("Duplicate characters in the string are:");
        for (Map.Entry<Character, Integer> entry : countChar.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
		
	}

}
