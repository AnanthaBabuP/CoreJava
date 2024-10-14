package com.demo.ServletPrg;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ProfileServlet
 */
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		Cookie[] cookies = request.getCookies();
		String user="";
		if(cookies == null) {
			out.println("<h1 style=color:red;>Sorry!! You are new User, Kinddly Loged in Our Profile..</h1>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("loginForm.html");
			dispatcher.include(request, response);
		} else {
			for(Cookie ck : cookies) {
				String tempUser = ck.getName();
				if(tempUser.equals("cookieuser")) {
					user = ck.getValue(); // It return a UniqueKey not a original value. 
					out.println("<h1 style=color:green;>Welcome to Your profile, "+user+"</h1>");
					out.println("<h2><a href=LogoutServlet?logoutUser="+user+">Log Out</a></h2>");
				}
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
