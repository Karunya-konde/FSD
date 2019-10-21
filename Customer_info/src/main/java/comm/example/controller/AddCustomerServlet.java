package comm.example.controller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String name;
	private String type;
	private int id;
	private List<String> errors;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doProcess(request, response);

	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		errors = new ArrayList<String>();
		String sId = request.getParameter("id");
		try {
			id=Integer.parseInt(sId);
		} catch (Exception e) {
			// TODO: handle exception
			errors.add("Id field must be numeric");
		}
		name =request.getParameter("name");
		if(name.length()<=8)
		{
			errors.add("invalid title");
		}
		type=request.getParameter("type");
		if(type.equals("Unknown"))
		{
			errors.add("select a season");
		}
		if(!errors.isEmpty())
		{
			RequestDispatcher view=request.getRequestDispatcher("error.html");
			view.forward(request, response);
		}
		else
		{

			RequestDispatcher view=request.getRequestDispatcher("success.html");
			view.forward(request, response);
		}

	}

}
