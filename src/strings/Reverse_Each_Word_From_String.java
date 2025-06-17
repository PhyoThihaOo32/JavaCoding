package strings;

public class Reverse_Each_Word_From_String {
	
	public static void main(String[] args) {
		
		String originalStr = "Reverse Each World From String";
		String revStr="";
		String[] words= originalStr.split(" ");
		
		for(int i=0;i<words.length;i++) {
			
			String eachWord = words[i];
			String revEachWord="";
			
			for(int j=eachWord.length()-1;j>=0;j--) {
				
				revEachWord=revEachWord+eachWord.charAt(j);
				
			}
			
			revStr+=revEachWord+" ";
			
		}
		
		System.out.println(revStr);
	}

}
