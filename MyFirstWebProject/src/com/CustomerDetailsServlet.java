package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.dao.impl.CustomerDAOImpl;
import com.deloitte.cms.model.Customer;

/**
 * Servlet implementation class CustomerDetailsServlet
 */
public class CustomerDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int customerId = Integer.parseInt(request.getParameter("customerId"));
		String customerName= request.getParameter("customerName");
		String customerAddress= request.getParameter("customerAddress");
		int billAmount = Integer.parseInt(request.getParameter("billAmount"));
	    
		
		Customer customer = new Customer(customerId,customerName,customerAddress,billAmount);
		CustomerDAO customerDAO = new CustomerDAOImpl();
		/*response.getWriter().println("Customer Id is " + customerId +"\n");
		response.getWriter().println("\n Customer Name is " + customerName );
		response.getWriter().println("\n Customer Address is " + customerAddress );
		response.getWriter().println("\n Customer Billamount is " + billAmount );*/
	 boolean result = customerDAO.insertCustomer(customer);
	 if(result)
		 response.getWriter().println("<h2>"+ customerName + " your record is saved");
	 else
		 response.getWriter().println("<h2>"+ customerName + " your record is not  saved");
		 
	}

}
   