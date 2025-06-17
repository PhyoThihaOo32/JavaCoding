package numbers;

public class ReverseNumber {
	
	public static void main(String[]args) {
			
	int num=12345;
	int rev=0;
	
	while(num!=0) {
		
		rev=rev*10+num%10;//5 54
		num=num/10;//1234
		
	}
	
	System.out.println(rev);
	
	int num1=12345;
	
	System.out.println(new StringBuilder().append(num1).reverse());
	
	System.out.println(new StringBuffer().append(num1).reverse());
	
	}
	
	
	
	
	
	

}
