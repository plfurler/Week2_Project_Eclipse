package s2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Student;

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

		// Lab 05: Using a Java Bean to process form parameters
		// Instantiate and Initialize student
		Student student = new Student();

		// Lab06: Validate Form Data
		String errorMsg = "";

		// Store form values in the student object
		student.setId(id);
		student.setFullName(name);
		student.setAddress(address);
		student.setTelNumber(tel);
		student.setEmail(email);

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		// Lab01 - 04: Output
		/*
		 * out.println("<html>"); out.println("<head>"); out.
		 * println("<title>Week2_Project_Eclipse - Student Registration Information</title>"
		 * ); out.println("</head>"); out.println("<body>");
		 * out.println("<h1>Your details are as follows:</h1>");
		 * out.println("<h3>Your Id: " + id + "</h3>"); out.println("<h3>Your Name: " +
		 * name + "</h3>"); out.println("<h3>Your Address: " + address + "</h3>");
		 * out.println("<h3>Your Telephone Number: " + tel + "</h3>");
		 * out.println("<h3>Your Email: " + email + "</h3>");
		 * out.println("<p>Return to <a href=\"registration.html\">Registration</a>");
		 * out.println("<p>Return to <a href=\"studentservices.html\">Home</a></p>");
		 * out.println("</body>"); out.println("</html>");
		 */

		// Lab05: Output
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Week2_Project_Eclipse - Student Registration Information</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Your details are as follows:</h1>");
		out.println("<h3>Your Id: " + student.getId() + "</h3>");
		out.println("<h3>Your Name: " + student.getFullName() + "</h3>");
		out.println("<h3>Your Address: " + student.getAddress() + "</h3>");
		out.println("<h3>Your Telephone Number: " + student.getTelNumber() + "</h3>");
		out.println("<h3>Your Email: " + student.getEmail() + "</h3>");
		out.println("<p>Return to <a href=\"registration.html\">Registration</a>");
		out.println("<p>Return to <a href=\"studentservices.html\">Home</a></p>");
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
