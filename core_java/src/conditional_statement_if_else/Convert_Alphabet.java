package conditional_statement_if_else;

public class Convert_Alphabet {

    public static void main(String[] args) {

        char ch = 'z';

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
            System.out.println("Converted to Small: " + ch);
        }
        else if (ch >= 'a' && ch <= 'z') {
            ch = (char)(ch - 32);
            System.out.println("Converted to Capital: " + ch);
        }
        else {
            System.out.println("Not an Alphabet");
        }
    }
}
