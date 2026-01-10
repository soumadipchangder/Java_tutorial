package conditional_statement_switch_case;

public class Calculator1 {

    public static void main(String[] args) {

        double a = 10, b = 3;
        char op = '+';

        switch (op) {
            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                System.out.println(a / b);
                break;

            default:
                System.out.println("No Match");
        }
    }
}



