package common;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Connexion {
	
	public static void main(String[] args) {
		DB_Connexion obj_DB_Connexion = new DB_Connexion();
		System.out.println(obj_DB_Connexion.get_connection());
	}
	
	public Connection get_connection() {
		
		Connection connection = null;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_crud", "root","");
		} catch (Exception e) {
			System.out.println(e);
		}
		return connection;
		
	}
}
