package com.bridgelabz.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginRegister
 */
//@WebServlet("/LoginRegister")
public class LoginRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginRegistration() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		 response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        
	        String USERNAME = request.getParameter("USERNAME");
	        String EMAIL = request.getParameter("EMAIL");
	        String PASSWORD = request.getParameter("PASSWORD");
	        
	        if(Validate.checkUser(USERNAME,EMAIL,PASSWORD))
	        {
	            RequestDispatcher rs = request.getRequestDispatcher("Welcome ");
	            rs.forward(request, response);
	        }
	        else
	        {
	           out.println("Username,Email or Password  incorrect");
	           RequestDispatcher rs = request.getRequestDispatcher("login.html");
	           rs.include(request, response);
	        }
	    }  
	

	}


