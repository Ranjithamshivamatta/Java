package com.bridgelabz.session1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login1
 */

public class Login1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String name = "admin";
	private final String password = "password";
  

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");

		String name = request.getParameter("name");
		String password = request.getParameter("password");

		// if (Validate.checkUser(NAME, PASSWORD)) {
		// // RequestDispatcher rs = request.getRequestDispatcher("Welcome");
		// // rs.forward(request, response);
		// printWrite.print("Welcome");
		if (this.name.equals(name) && this.password.equals(password)) {
			// get the old session and invalidate
			HttpSession oldSession = request.getSession(false);
			if (oldSession != null) {
				oldSession.invalidate();
			}
			// generate a new session
			HttpSession newSession = request.getSession(true);

			// setting session to expiry in 5 mins
			newSession.setMaxInactiveInterval(10);

			Cookie message = new Cookie("message", "Welcome");
			response.addCookie(message);
			response.sendRedirect("Login.jsp");
		}
		// } else {
		// // out.println("Username or Password incorrect");
		// // String name = request.getParameter("NAME");
		// // String password = request.getParameter("PASSWORD");
		//
		// // Creating two cookies
		// Cookie c1 = new Cookie("NAME", NAME);
		// // Cookie c2 = new Cookie("PASSWORD", PASSWORD);
		//
		// // Adding the cookies to response header
		// response.addCookie(c1);
		// // response.addCookie(c2);
		//
		// // Reading cookies
		// Cookie c[] = request.getCookies();
		//
		// // Displaying User name value from cookie
		// // printWrite.print("NAME: " + c[0].getValue());
		// // Displaying user password value from cookie
		//
		// printWrite.print(" HELLO YOUR NAME IS: " + c[0].getValue());
		//
		// printWrite.close();
		//
		// RequestDispatcher rs = request.getRequestDispatcher("/Register.html");
		// rs.include(request, response);

		else {
			RequestDispatcher rS = getServletContext().getRequestDispatcher("/Index.jsp");
			PrintWriter out = response.getWriter();
			out.println("<font color=red>Either username or password is wrong.</font>");
			rS.include(request, response);
		}
	}

	}


