package s2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StudentBean;

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
		String telNum = request.getParameter("txtTel");
		String email = request.getParameter("txtEmail");
		PrintWriter out = response.getWriter();

		// Lab 05: Using a Java Bean to process form parameters
		// Instantiate and Initialize student
		StudentBean student = new StudentBean();

		// Lab06: Validate Form Data
		Boolean hasErrors = false;
		String errorMsg = "";

		// Checking for errors

		// Id
		if (id.isEmpty()) {
			errorMsg += "<li><b>Id</b> must not be empty</li>";
			hasErrors = true;

		} else if (!id.matches("[0-9]+")) {
			errorMsg += "<li><b>Id</b> must only contain numbers</li>";
			hasErrors = true;
		} else if (id.length() != 6) {
			errorMsg += "<li><b>Id</b> must contain exactly six numbers</li>";
			hasErrors = true;
		}

		// Name
		if (name.isEmpty()) {
			errorMsg += "<li><b>Name</b> must not be empty</li>";
			hasErrors = true;
		} else {
			char[] letters = name.toCharArray();
			for (char letter : letters) {
				if (Character.isDigit(letter)) {
					errorMsg += "<li><b>Name</b> must not contain any numbers</li>";
					hasErrors = true;
					break;
				}
			}
		}

		// Address
		if (address.isEmpty()) {
			errorMsg += "<li><b>Address</b> must not be empty</li>";
			hasErrors = true;
		}

		// Telephone number
		if (telNum.isEmpty()) {
			errorMsg += "<li><b>Telephone number</b> must not be empty</li>";
			hasErrors = true;
		}

		else if (!telNum.matches("[0-9]+")) {
			errorMsg += "<li><b>Telephone number</b> must only contain numbers</li>";
			hasErrors = true;
		}

		// Email
		if (email.isEmpty()) {
			errorMsg += "<li><b>Email</b> must not be empty</li>";
			hasErrors = true;
		}

		else {
			Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
			Matcher m = p.matcher(email);
			boolean validEmail = m.matches();

			if (!validEmail) {
				hasErrors = true;
				errorMsg += "<li><b>Email</b> is not valid</li>";
			}
		}

		if (hasErrors) {
			// ToDo: redirect back to registration page
			// Display the form with the list of errors

			response.setContentType("text/html;charset=UTF-8");

			out.println("<h1>Errors</h1>");
			out.println("<h2>Your registration contains the following errors:</h2>");
			out.println("<ul>");
			out.println(errorMsg);
			out.println("</ul>");
			out.println("<p>Return to the <a href='registration.html'>Registration page</a></p>");
		}

		else {

			// Store form values in the student object
			student.setId(id);
			student.setFullName(name);
			student.setAddress(address);
			student.setTelNumber(telNum);
			student.setEmail(email);

			response.setContentType("text/html;charset=UTF-8");

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
