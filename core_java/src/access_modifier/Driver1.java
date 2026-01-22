package access_modifier;

public class Driver1 {

    public static void main(String[] args) {

        for (int i = 1; i <= 8; i++) {
            DBCon con = DBCon.getDBCon();
            System.out.println("Object " + i + " : " + con);
        }
    }
}
