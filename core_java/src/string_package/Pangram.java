package string_package;

public class Pangram {

    public static void main(String[] args) {

        String s = "The quick brown fox jumps over the lazy dog";
        s = s.toLowerCase();

        boolean isPangram = true;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!s.contains(String.valueOf(ch))) {
                isPangram = false;
                break;
            }
        }

        if (isPangram)
            System.out.println("Pangram");
        else
            System.out.println("Not Pangram");
  
    	
    }
}
