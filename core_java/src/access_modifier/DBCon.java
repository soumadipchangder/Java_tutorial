package access_modifier;

public class DBCon {

    private static int count = 0;
    private static final int MAX = 5;

    public static DBCon getDBCon() {

        if (count < MAX) {
            count++;
            return new DBCon();
        } else {
            return null;
        }
    }

    private DBCon() {
    	
    }
}
