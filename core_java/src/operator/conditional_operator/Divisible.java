package operator.conditional_operator;

class Divisible {

    public static void main(String[] args) {

        int n = 1085;

        String result =
                (n % 3 == 0 && n % 5 == 0)
                ? "Divisible by both 3 and 5"
                : "Not divisible by both 3 and 5";

        System.out.println(result);
    }
}
