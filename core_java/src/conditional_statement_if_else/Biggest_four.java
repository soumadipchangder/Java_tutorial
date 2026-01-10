package conditional_statement_if_else;

public class Biggest_four {
	
    public static void main(String[] args) {
    	
        int a = 10, b = 20, c = 30, d = 40;
        
        int big = a;
        
        if (b > big) {
            big = b;
        }
        if (c > big) {
            big = c;
        }
        if (d > big) {
            big = d;
        }

        System.out.println("Biggest of four is:- " + big);
    }
}

