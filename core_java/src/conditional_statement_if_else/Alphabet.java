package conditional_statement_if_else;

public class Alphabet {
	public static void main(String[] args) {

        char ch = 'a';

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Capital Alphabet");
        }
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Small Alphabet");
        }
    }
}
