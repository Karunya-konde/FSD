package comm.example.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.model.Customer;

public class ListCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
private List<Customer> list=null;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		list=new ArrayList<Customer>();
		list.add(new Customer("Regular",1001,"Siya"));
		list.add(new Customer("New", 1002, "Maya"));
		list.add(new Customer("Old", 1003, "Ehith"));
		out.println("<html><title>List All Available Customers</title><body><table border='1'><tr><td>Name</td><td>Type</td><td>Id</td></tr>");
		
		for(Customer l:list)
		{
			out.println("<tr><td>"+l.getType()+"</td><td>"+l.getName()+"</td><td>"+l.getId()+"</td></tr>");
		}
		out.println("</table><a href='index.html'>Go To Home Page</a></body></html>");
	}

	
}