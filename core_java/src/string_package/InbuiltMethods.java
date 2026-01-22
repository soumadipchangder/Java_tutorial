package string_package;

public class InbuiltMethods {

    public static void main(String[] args) {

        lengthMethod();
        charAtMethod();
        trimMethod();
        substringMethod();
        indexOfMethod();
        lastIndexOfMethod();
        toCharArrayMethod();
        equalsMethod();
        equalsIgnoreCaseMethod();
        compareToMethod();
        containsMethod();
        replaceMethod();
        toggleCaseMethod();
        splitMethod();
        startsWithMethod();
        endsWithMethod();
        isEmptyMethod();
        isBlankMethod();
        joinMethod();
        valueOfMethod();
        matchesMethod();
        repeatMethod();
        stripVsTrimMethod();
    }

    // length() → number of characters
    public static void lengthMethod() {
        String s = "abc";
        System.out.println("length(): " + s.length()); // 3
    }

    // charAt(index) → character at index
    public static void charAtMethod() {
        String s = "abc";
        System.out.println("charAt(0): " + s.charAt(0)); // a
        System.out.println("charAt(1): " + s.charAt(1)); // b
        System.out.println("charAt(2): " + s.charAt(2)); // c
    }

    // trim() → removes spaces from start and end
    public static void trimMethod() {
        String s = "   hello world   ";
        System.out.println("Before trim: '" + s + "'");
        System.out.println("After trim: '" + s.trim() + "'");
    }

    // substring() → part of string
    public static void substringMethod() {
        String s = "abcdef";
        System.out.println("substring(2): " + s.substring(2));      // cdef
        System.out.println("substring(1,4): " + s.substring(1, 4)); // bcd
    }

    // indexOf() → first occurrence index
    public static void indexOfMethod() {
        String s = "banana";
        System.out.println("indexOf(a): " + s.indexOf('a'));   // 1
        System.out.println("indexOf(na): " + s.indexOf("na")); // 2
    }

    // lastIndexOf() → last occurrence index
    public static void lastIndexOfMethod() {
        String s = "banana";
        System.out.println("lastIndexOf(a): " + s.lastIndexOf('a'));   // 5
        System.out.println("lastIndexOf(na): " + s.lastIndexOf("na")); // 4
    }

    // toCharArray() → string to char array
    public static void toCharArrayMethod() {
        String s = "java";
        char[] arr = s.toCharArray();

        System.out.print("toCharArray(): ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // equals() → content compare (case-sensitive)
    public static void equalsMethod() {
        String a = "java";
        String b = "java";
        String c = new String("java");

        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("a.equals(c): " + a.equals(c));
    }

    // equalsIgnoreCase() → ignore case
    public static void equalsIgnoreCaseMethod() {
        String a = "Java";
        String b = "jAvA";

        System.out.println("a.equalsIgnoreCase(b): " + a.equalsIgnoreCase(b));
    }

    // compareTo() → dictionary comparison
    public static void compareToMethod() {
        String a = "apple";
        String b = "banana";
        String c = "apple";

        System.out.println("a.compareTo(b): " + a.compareTo(b)); // -ve
        System.out.println("b.compareTo(a): " + b.compareTo(a)); // +ve
        System.out.println("a.compareTo(c): " + a.compareTo(c)); // 0
    }

    // contains() → substring present or not
    public static void containsMethod() {
        String s = "I love java";

        System.out.println("contains(\"love\"): " + s.contains("love"));
        System.out.println("contains(\"python\"): " + s.contains("python"));
    }

    // replace() → replace part of string
    public static void replaceMethod() {
        String s = "hi hi hi students";
        System.out.println("replace: " + s.replace("hi", "bye"));
        System.out.println("replace: " + s.replaceFirst("hi", "bye"));
        System.out.println("replace: " + s.replaceAll("hi", "bye"));
    }

    // toggle case → manual ASCII
    public static void toggleCaseMethod() {
        String s = "AbCdeF";

        System.out.print("Toggle Case: ");
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z')
            	ch = (char) (ch + 32);
            else if (ch >= 'a' && ch <= 'z') 
            	ch = (char) (ch - 32);

            System.out.print(ch);
        }
        System.out.println();
    }

    // split() → break string using delimiter
    public static void splitMethod() {
        String s = "I love java programming";
        String[] arr = s.split(" ");

        System.out.println("Split words:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // startsWith()
    public static void startsWithMethod() {
        String s = "java programming";
        System.out.println("startsWith(\"java\"): " + s.startsWith("java"));
    }

    // endsWith()
    public static void endsWithMethod() {
        String s = "hello.txt";
        System.out.println("endsWith(\".txt\"): " + s.endsWith(".txt"));
    }

    // isEmpty() → length == 0
    public static void isEmptyMethod() {
        String s1 = "";
        String s2 = "abc";

        System.out.println("s1 isEmpty: " + s1.isEmpty());
        System.out.println("s2 isEmpty: " + s2.isEmpty());
    }

    // isBlank() → empty OR only spaces (Java 11+)
    public static void isBlankMethod() {
        String s1 = "";
        String s2 = "   ";
        String s3 = "java";

        System.out.println("s1 isBlank: " + s1.isBlank());
        System.out.println("s2 isBlank: " + s2.isBlank());
        System.out.println("s3 isBlank: " + s3.isBlank());
    }

    // join() → join strings with delimiter
    public static void joinMethod() {
        String result = String.join("-", "2026", "01", "21");
        System.out.println("join(): " + result);
    }

    // valueOf() → convert primitive to string
    public static void valueOfMethod() {
        int x = 100;
        String s = String.valueOf(x);

        System.out.println("valueOf(): " + s);
    }

    // matches() → regex matching
    public static void matchesMethod() {
        String s = "abc123";

        System.out.println("matches letters+digits: " + s.matches("[a-zA-Z0-9]+"));
        System.out.println("matches only digits: " + s.matches("\\d+"));
    }

    // repeat() → repeats string n times (Java 11+)
    public static void repeatMethod() {
        String s = "Hi ";
        System.out.println("repeat(): " + s.repeat(3)); // Hi Hi Hi
    }

    // strip() vs trim()
    public static void stripVsTrimMethod() {
        String s = "   hello   ";

        System.out.println("trim(): '" + s.trim() + "'");
        System.out.println("strip(): '" + s.strip() + "'");
    }
}
