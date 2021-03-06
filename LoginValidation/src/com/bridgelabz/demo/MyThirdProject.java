package com.bridgelabz.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class MyThirdProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try { // Load the driver
			Driver driverRef = new Driver();
			DriverManager.registerDriver(driverRef);
			// Get the DB Connection
			String dburl = "jdbc:mysql://localhost:3306/RANJITHA?user=root&password=ROOT";
			con = DriverManager.getConnection(dburl);
			String sql = "UPDATE STUDENT SET NAME=?  WHERE ID=?";
			 
			PreparedStatement statement = con.prepareStatement(sql);
			
			statement.setString(1, "ASA");
			statement.setInt(2,3);
			
			 
			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated > 0) {
			    System.out.println("An existing user updated successfully!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// Close the objects
			try {
				if (con != null) {
					con.close();
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
