package string_package;

public class RemoveSpace {

    public static void main(String[] args) {

        String s = "    I      love    Java  Programming      ";

        removeSpace(s);
    }

    public static void removeSpace(String s) {
        String result = s.replace(" ", "");

        System.out.println(result);
    }
}
