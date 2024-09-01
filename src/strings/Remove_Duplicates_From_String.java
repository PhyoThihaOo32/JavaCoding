package strings;

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicates_From_String {
	
	public static void main(String[] args) {
		
		
		System.out.println(removeDuplicates("communication"));
		
		
	}
	
	public static String removeDuplicates(String str) {
		
		Set<Character> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		
		
		
		for(char c :str.toCharArray()) {
			
			if(set.add(c)) {
				
				sb.append(c);
			}
			
		}
		
		return sb.toString();
	}

}
