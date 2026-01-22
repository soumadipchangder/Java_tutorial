package assignment_string;

public class BalancedParenthesisArray {

    public static void main(String[] args) {

        String s = "{[()]}";
        char[] stack = new char[s.length()];
        int top = -1;

        boolean isBalanced = true;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++top] = ch;
            }

            else if (ch == ')' || ch == '}' || ch == ']') {

                if (top == -1) {
                    isBalanced = false;
                    break;
                }

                char last = stack[top--];

                if ((ch == ')' && last != '(') ||
                    (ch == '}' && last != '{') ||
                    (ch == ']' && last != '[')) {

                    isBalanced = false;
                    break;
                }
            }
        }

        // if still elements left → not balanced
        if (top != -1)
            isBalanced = false;

        if (isBalanced)
            System.out.println("Balanced Parenthesis");
        else
            System.out.println("Not Balanced Parenthesis");
    }
}
