package com.bridgelabz.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Demo
 */

public class LoginRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public LoginRegister() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		String name = request.getParameter("name");
//		response.getWriter().append("Welcome: " + name).append(request.getContextPath());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		Connection connection = null;
		java.sql.PreparedStatement pstmt = null;

		try { // Load the driver
			// Driver driverRef = new Driver();
			// DriverManager.registerDriver(driverRef);
			// Get the DB Connection
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("lodede");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/RANJITHA", "root", "ROOT");
System.out.println("connected");
			pstmt = connection.prepareStatement("INSERT INTO LOGIN VALUES(?,?,?)");

			pstmt.setString(1, request.getParameter("userName"));
			pstmt.setString(2, request.getParameter("Email"));
			pstmt.setString(3, request.getParameter("Password"));

			int rowsInserted = pstmt.executeUpdate();
			if (rowsInserted > 0)
				System.out.println("A new user inserted successfully!");
			else
				System.out.println("Please enter details");
			pstmt.close();
			connection.close();
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Close the objects
			try {
				if (connection != null) {
					connection.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
