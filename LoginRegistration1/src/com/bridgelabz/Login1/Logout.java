package com.bridgelabz.Login1;

import java.io.IOException;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logout
 */
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// invalidate the session if exists
		HttpSession session = request.getSession(false);
		if (session != null) {
			session.invalidate();
		}
		response.sendRedirect(request.getContextPath() + "/Login.jsp");

		// //invalidate the session if exists
		// PrintWriter out = response.getWriter();
		//
		// HttpSession session = request.getSession(false);
		// if(session != null){
		// session.invalidate();
		// }
		// response.sendRedirect(request.getContextPath() + "/login.jsp");
		//
		// out.close();
		// doGet(request, response);
	}

}
