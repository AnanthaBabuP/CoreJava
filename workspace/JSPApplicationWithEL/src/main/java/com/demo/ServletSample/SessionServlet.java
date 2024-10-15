package com.demo.ServletSample;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SessionServlet
 */
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Check All : ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String userName = req.getParameter("userName");
		String password = req.getParameter("pwd");
		
		// Session Creation
		HttpSession session = req.getSession();
		session.setAttribute("sessionUser", userName);
		session.setAttribute("sessionPwd", password);
		
		Integer visitCount = 1;
		if(session.isNew()) {
			session.setAttribute("VisitCount", visitCount);
		} else {
			visitCount = (Integer)session.getAttribute("VisitCount")+1;
			session.setAttribute("VisitCount", visitCount);
		}
		
		out.println("<h1 style=color:green;> Welcome,"+session.getAttribute("sessionUser")+" You are successfuly login..</h1>");
		out.println("<h2> Session Id = "+session.getId()+"</h2>");
		out.println("<h2> Visit Count = "+session.getAttribute("VisitCount")+"</h2>");
		out.println("<h2>Click Here to <a href='ClearServlet' >Invalidate</a></h2>");
		
		
	}

}
