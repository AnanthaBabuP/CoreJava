package com.demo.ServletSample;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

/**
 * Servlet implementation class ClearServlet
 */
public class ClearServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClearServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		
		HttpSession session = req.getSession();
		String user = (String)session.getAttribute("sessionUser");
		
		long createtinTime = session.getCreationTime();
		long lastAccessedTime = session.getLastAccessedTime();
		Calendar cal = Calendar.getInstance();
		long currentTime = cal.getTimeInMillis();
		long totalTime = (currentTime-createtinTime);
		
		out.println("<h1 style=color:blue;>"+user+" You are successfuly Clear Session And LogOut..</h1>");
		out.println("<h1> Session Creation Time ="+(createtinTime/1000)+"</h1>");
		out.println("<h1> Session Last Access Time ="+(lastAccessedTime/1000)+"</h1>");
		out.println("<h1> Session Creation Time ="+(createtinTime/1000)+"</h1>");
		out.println("<h1> Total Time Spend ="+(totalTime)+" Seconds</h1>");

		session.invalidate();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
