package com.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.Statement;

public class MainClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:mysql://localhost:3306/college?user=root&password=Manoj@20040429";
//		String User = "root";
//		String password = "Manoj@20040429";
		String Query = "insert into student values(105,'Kishore',22,100)";
		//String Query = "INSERT INTO student VALUES(102, 'Rahul', 22, 78),(103, 'Anita', 20, 92),(104, 'Suresh', 23, 67)";
		//String Query =  "UPDATE student SET std_marks = 88 WHERE stdid = 102";
		
		//step 01
		//load the driver

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("loading.....is done");
		
		//step 02
		//establish a connection b/w java and db
		
		Connection connection = DriverManager.getConnection(url);
		
		System.out.println("connection...is Done");
		
//		Statement statement = connection.createStatement();
		
		PreparedStatement preparedstatement = connection.prepareStatement("insert into student values(?,?,?,?)");
		
		preparedstatement.setInt(1, 105);
		preparedstatement.setString(2, "Kishore");
		preparedstatement.setInt(3, 21);
		preparedstatement.setInt(1, 100);
		
		
		preparedstatement.executeUpdate(Query);
		
		System.out.println("Done....✅✅✅");
		
		
	}

}
