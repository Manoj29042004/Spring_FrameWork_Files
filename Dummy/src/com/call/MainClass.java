package com.call;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		final String URL = "jdbc:mysql://localhost@root/college?user=root&password=Manoj@20040429";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(URL);
		
		CallableStatement callableStatement = connection.prepareCall("{call display()}");
		
		ResultSet resultSet = callableStatement.executeQuery();
		
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(0));
			System.out.println();
		}
		
		

	}

}
