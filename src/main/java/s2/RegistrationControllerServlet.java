package s2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationControllerServlet
 */
@WebServlet("/RegController")
public class RegistrationControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistrationControllerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("txtId");
		String name = request.getParameter("txtName");
		String address = request.getParameter("txtAddress");
		String tel = request.getParameter("txtTel");
		String email = request.getParameter("txtEmail");

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>Student Registration Information</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Your details are as follows:</h1>");
		out.println("<h3>Your Id: " + id + "</h3>");
		out.println("<h3>Your Name: " + name + "</h3>");
		out.println("<h3>Your Address: " + address + "</h3>");
		out.println("<h3>Your Telephone Number: " + tel + "</h3>");
		out.println("<h3>Your Email: " + email + "</h3>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
