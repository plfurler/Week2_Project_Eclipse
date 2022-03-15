package s2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

/**
 * Servlet implementation class SubsController
 */
@WebServlet("/SubsController")
public class SubsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SubsController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("txtName");
		String address = request.getParameter("txtAddress");
		String telNumber = request.getParameter("txtTel");
		String magazinesString = "";
		String[] magazines = request.getParameterValues("chkMags");

		for (int i = 0; i < magazines.length; i++) {
			if (i == magazines.length - 1) {
				magazinesString += magazines[i] + ".";
				break;
			}
			magazinesString += magazines[i] + ", ";
		}

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>Week2_Project_Eclipse - Multiple</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Your details are as follows:</h1>");
		out.println("<h3>Your Name: " + name + "</h3>");
		out.println("<h3>Your Address: " + address + "</h3>");
		out.println("<h3>Your Telephon Number: " + telNumber + "</h3>");
		out.println("<h3>Your Magazine Subscriptions: " + magazinesString + "</h3>");
		out.println("<p>Return to <a href=\"multiple.html\">Multiple</a>");
		out.println("<p>Return to <a href=\"studentservices.html\">Home</a></p>");
		out.println("</body>");
		out.println("</html>");

		out.close();

	}

}
