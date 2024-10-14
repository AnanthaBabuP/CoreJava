package com.demo.ServletPrg;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("user");
		String password = request.getParameter("psw");
		PrintWriter out = response.getWriter();
		out.println("UserName : "+username);
		out.println("Password : "+password);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("user");
		String password = request.getParameter("psw");
		
		PrintWriter out = response.getWriter();
//		response.setContentType("text/html");
//		// Cookie Concept:
//		if(password.equals("inmakes")) {
//			Cookie ck = new Cookie("cookieuser", username);
//			ck.setMaxAge(30*60);
//			response.addCookie(ck);
//			out.println("<h1 style=color:green>You Are SuccessFully Login...</h1>");
////			RequestDispatcher rd = request.getRequestDispatcher("LoginSucess.jsp");
////			 rd.forward(request, response);
//			out.println("<h1 style=color:red;><a href= ProfileServlet>My Profile</a></h1>");
//		} else {
//			out.println("<h1 style=color:red>You Are Enter in invalid Password...</h1>");
//			RequestDispatcher rdp = request.getRequestDispatcher("loginForm.html");
//			rdp.include(request, response);
//		}
//		
		
		
//		// ServletConfig Interface
		ServletConfig config = getServletConfig();
		String configName = config.getInitParameter("userName");
		String configPassword = config.getInitParameter("password");
		
		System.out.println("Config UserName: "+configName);
		System.out.println("Config Password: "+configPassword);
		request.setAttribute("userName", "Ananth");
		
//		// ServletContext Interface
//		
		ServletContext context = getServletContext();
		String contectValue_1 = context.getInitParameter("ContexParam-1");
		String contectValue_2 = context.getInitParameter("ContexParam-2");
		System.out.println("Contect Value-1: "+contectValue_1);
		System.out.println("Contect Value-2: "+contectValue_2);
		
		context.setAttribute("Name", "Content Attribute");
		System.out.println("Content Before Remove Attribute :"+context.getAttribute("Name"));
		
		context.removeAttribute("Name");
		System.out.println("Content After Remove Attribute :"+context.getAttribute("Name"));
		
		if(username.equals("inmakes") && password.equals("1234")) {
			
			request.setAttribute("usr", username);
			 RequestDispatcher rd = request.getRequestDispatcher("LoginSucess.jsp");
			 rd.forward(request, response);
			 
			// response.sendRedirect("LoginSuccess.html"); // Go to URL change this
		} else {
			out.println("<h1 style=color:red;>Sory!! Invalid Username or Password...</h1>");
			RequestDispatcher rd = request.getRequestDispatcher("loginForm.html");
			rd.include(request, response);
		}
	}

}
