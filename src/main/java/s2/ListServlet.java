package s2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListServlet
 */
@WebServlet("/list")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListServlet() {
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
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String[] list = { "Adelaide", "Noarlunga", "Regency", "Panorama" };

		out.println("<html>");
		out.println("<head>");
		out.println("<title>Week2_Project_Eclipse - List of Tafe Campuses</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Tafe Campuses:</h1>");
		out.println("<ul>");
		for (int i = 0; i < list.length; i++) {
			out.println("<li><strong>" + list[i] + "</strong></li>");
		}
		out.println("</ul>");
		out.println("<p>Return to <a href=\"studentservices.html\">Home</a></p>");
		out.println("</body>");
		out.println("</html>");
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
