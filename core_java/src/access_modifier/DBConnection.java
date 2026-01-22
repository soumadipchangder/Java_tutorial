package access_modifier;

public class DBConnection {
	
	private static DBConnection con;
	
	public static DBConnection getDBConnection() {
		if (con==null) {
			con=new DBConnection();
		}
		return con;
	}
	
	private DBConnection() { //to restrict object creation in different class
		
	}

}
