package s2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ModifyCourseServlet
 */
@WebServlet("/ModifyCourse")
public class ModifyCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ModifyCourseServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String studentId = request.getParameter("txtId");
		String studentName = request.getParameter("txtName");
		String stream = request.getParameter("txtStream");
		String semester = request.getParameter("txtSemester");
		String oldCourse = request.getParameter("txtOldCourse");
		String newCourse = request.getParameter("txtNewCourse");

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Week2_Project_Eclipse - Modify Course Information</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Your details are as follows:</h1>");
		out.println("<h3>Your Student Id: " + studentId + "</h3>");
		out.println("<h3>Your Student Name: " + studentName + "</h3>");
		out.println("<h3>Your Stream: " + stream + "</h3>");
		out.println("<h3>Your Semester: " + semester + "</h3>");
		out.println("<h3>Your Old Course: " + oldCourse + "</h3>");
		out.println("<h3>Your New Course: " + newCourse + "</h3>");
		out.println("<p>Return to <a href=\"modify.html\">Modify Course Offerings</a>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();

	}

}
