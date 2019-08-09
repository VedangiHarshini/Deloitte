package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
    	System.out.println("1.Init");
    }
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    int counter =0;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*System.out.println("2.Service");
		String gn = request.getParameter("guestName");
		String color[] = request.getParameterValues("colors");
		counter++;
		response.setContentType("text/html");
		if(color == null) {
			response.getWriter().println("No color selected");
		}
		else {
		for(String c : color) {
		response.getWriter().println("<br/><font color = "+c+">Hello " +gn+ "-Welcome to Harshini's web site </font>");
		}}
		response.getWriter().println("<h1>You are visitor number :" + counter); */
		System.out.println("2.Service of Welcome Servlet");
		String gn = request.getParameter("guestName");
		response.getWriter().println("Welcome in welcome Servlet " +gn);
		
		String color[] = request.getParameterValues("colors");
		//counter++;
		if(gn.equals("Harshini")) {
		//response.getWriter().print("<a href = ValidServlet>Signin</a>");
		RequestDispatcher dispatcher = request.getRequestDispatcher("ValidServlet");
		dispatcher.forward(request, response);
		}
		else
		{
			//response.getWriter().print("<a href = InvalidServlet>Signin</a>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("InvalidServlet");
			dispatcher.forward(request, response);
		}
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("3.Destroy");
	}

}
