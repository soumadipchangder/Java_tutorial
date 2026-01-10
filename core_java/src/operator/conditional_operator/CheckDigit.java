package operator.conditional_operator;

class CheckDigit {

    public static void main(String[] args) {

        int n = 8;

        int num = (n < 0) ? -n : n;

        String result =
                (num >= 0 && num <= 9) ? "Single Digit Number" :
                (num >= 10 && num <= 99) ? "Double Digit Number" :
                "More than Two Digits";

        System.out.println(result);
    }
}
