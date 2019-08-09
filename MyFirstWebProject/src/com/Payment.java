package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Payment
 */
public class Payment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Payment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	HttpSession session = request.getSession();
    	PrintWriter out = response.getWriter();
    	String gn=(String) session.getAttribute("username");
    	out.println(gn);
    	
    	int total =0;
    	int productCount =0;
    	response.setContentType("text/html");
    	out.println("<html> <body>");
    	String selectedProducts[] = request.getParameterValues("products");
    if(selectedProducts == null)
    {
    	out.println("No shopping done  <a href = 'Product.html'>Select prod</a>");
    }
    else 
    {
    for(String product :selectedProducts)
    {
    	productCount++;
    	total +=10;
    	out.println("Product" +productCount +""+product);
    }
    }
    session.setAttribute("totalAmount",total);
    out.println("<a href = Thanks> Done </a>");
    out.println("</body></html>");
	
    }
}
