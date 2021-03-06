package com.bridgelab.register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Register extends HttpServlet {
	
		private static final long serialVersionUID = 1L;

		/**
		 * Default constructor.
		 */
		public Register(){
			
		}
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			// TODO Auto-generated method stub
			response.getWriter().append("Served at: ").append(request.getContextPath());
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
		 *      response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			//response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();

			// loading drivers for mysql
			try {
				Class.forName("com.mysql.jdbc.Driver");
				// creating connection with the database
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RANJITHA", "root", "ROOT");

				PreparedStatement ps = con.prepareStatement("INSERT INTO LOGIN values(?,?,?)");

				
				String USERNAME = request.getParameter("USERNAME");
				String EMAIL = request.getParameter("EMAIL");
				String PASSWORD = request.getParameter("PASSWORD");

				
				ps.setString(1, USERNAME);
				ps.setString(2, EMAIL);
				ps.setString(3, PASSWORD);

				int i = ps.executeUpdate();

				if (i > 0) {
					out.println("successfully registered");
				} else {
					out.println("enter valid details");
				}

				ps.close();
				con.close();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}