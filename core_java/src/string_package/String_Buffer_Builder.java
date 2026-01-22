package string_package;

public class String_Buffer_Builder {
    public static void main(String[] args) {

        StringBuffer s1 = new StringBuffer("xyz");
        StringBuffer s2 = new StringBuffer("xyz");

        System.out.println(s1);                 // xyz
        System.out.println(s1.toString());      // xyz
        System.out.println(s1.equals(s2));      // false
        System.out.println(s1 == s2);           // false

        String s = new String(s1);              // SB -> String
        System.out.println(s);                  // xyz

        StringBuffer s3 = new StringBuffer(s);  // String -> SB
        System.out.println(s3);                 // xyz

        StringBuilder s4 = new StringBuilder("abc");
        System.out.println(s4);                 // abc
        s1.reverse();
        System.out.println(s1);
        s1.append("java");
        System.out.println(s1);
        StringBuffer s5=new StringBuffer("xyz");
        System.out.println(s5.capacity());
        System.out.println(s5);
        s5.insert(1, "abc");//xabcyz
        System.out.println(s5);
        StringBuffer s6=new StringBuffer("xyz abc");
        s6.delete(0, 2);//z abc
        System.out.println(s6);
        StringBuffer s7=new StringBuffer("xyz abc");
        s7.replace(0, 2, "hii");
        System.out.println(s7);//hiiz abc
        
        
        }
}
