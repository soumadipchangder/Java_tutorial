package assignment_string;

public class Isogram {

    public static void main(String[] args) {

        String s = "Machine";
        boolean isIsogram = true;

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    isIsogram = false;
                    break;
                }
            }
            if (!isIsogram)
                break;
        }

        if (isIsogram)
            System.out.println("Isogram");
        else
            System.out.println("Not Isogram");
    }
}
