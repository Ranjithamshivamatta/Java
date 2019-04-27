package com.bridgelabz.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;
import com.mysql.jdbc.PreparedStatement;

public class MySecondProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try { // Load the driver
			Driver driverRef = new Driver();
			DriverManager.registerDriver(driverRef);
			// Get the DB Connection
			String dburl = "jdbc:mysql://localhost:3306/RANJITHA?user=root&password=ROOT";
			connection = DriverManager.getConnection(dburl);
			String sql = "INSERT INTO STUDENT (Id,name,age) VALUES (?, ?, ?)";

			java.sql.PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, 20);
			statement.setString(2, "bolu");
			statement.setInt(3, 10);

			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("A new user inserted successfully!");
				
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// Close the objects
			try {
				if (connection != null) {
					connection.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
