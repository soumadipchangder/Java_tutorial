package conditional_statement_if_else;

public class Biggest_three {
	
	public static void main(String[] args) {
		
		int a=20,b=30,c=40;
		
		if(a>b && a>c) {
			
			System.out.println(a);
			
		}
		
		else {
			
			if(b>c) {
				
			
			System.out.println(b);
			
			}

			else {
				
			
			System.out.println(c);
			
			}
		}
		
	}

}
