package conditional_statement_switch_case;

class Case1 {

    public static void main(String[] args) {

        String day = "sunday";

        switch (day) {

            case "monday", "tuesday","wednesday":
                System.out.println("Bring English Book");
                break;

            case "thursday","saturday":
                System.out.println("Bring Java Book");
                break;

            case "friday":
                System.out.println("Bring SQL Book");
                break;

            default:
                System.out.println("Take Rest");
        }
    }
}
