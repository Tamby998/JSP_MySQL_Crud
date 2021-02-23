package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;

import common.DB_Connexion;

public class Insert_value {
	public void insert_values(String id, String user_name,String email, String mobile) {
		DB_Connexion obj_DB_Connexion = new DB_Connexion();
		Connection connection = obj_DB_Connexion.get_connection();
		PreparedStatement ps = null;
		try {
		String query = "INSERT INTO users(id, user_name, email, mobile) values (?,?,?,?)";
		ps = connection.prepareStatement(query);
		ps.setString(1, id);
		ps.setString(2, user_name);
		ps.setString(3, email);
		ps.setString(4, mobile);
		
		ps.executeUpdate();
	} catch (Exception e) {
		System.out.println(e);
	}
		
		
	}
}
