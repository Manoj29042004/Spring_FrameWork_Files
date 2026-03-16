package com.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		final String URL = "jdbc:mysql://localhost:3306/college?user=root&password=Manoj@20040429";
		final String Query = "Select * from student";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(URL);
		
		PreparedStatement preparedStatement = connection.prepareStatement(Query);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		System.out.println("StdId\tStd_Name\tStd_age\tStd_marks");
		System.out.println("_____________________________________");
		
		while(resultSet.next()) {
			System.out.print(resultSet.getInt(1)+"\t");
			System.out.print(resultSet.getString(2)+"\t");
			System.out.print(resultSet.getInt(3)+"\t");
			System.out.print(resultSet.getInt(4)+"\t");
			System.out.println();
		}

	}

}
