package crudOperations;

import java.sql.*;

public class DBConnection {

	public static Connection getConnection() throws SQLException {
		
		String dbUrl = "jdbc:mysql://localhost:3306/Library_Management_System";
		
		String userName = "root";
		
		String password = "Subu@2004";
		
		return DriverManager.getConnection(dbUrl,userName,password);
	}

}
