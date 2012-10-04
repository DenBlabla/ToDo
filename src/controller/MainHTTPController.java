package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainHTTPController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// response.setContentType("text/html;charset=utf-8");
		// PrintWriter pw = response.getWriter();
		// pw.println("<H1>Hello, world! или Привет мир</H1>");
		// super.doGet(request, response);

		String userPath = request.getServletPath();
		String url = "/WEB-INF/view";

		if (userPath.equals("/123")) {
			PrintWriter pw = response.getWriter();
			pw.println("<H1>Hello, world! или Привет мир</H1>");
			return;
			// super.doGet(request, response);
			// userPath = "/index";
			// url = "";
		}

		url += userPath + ".jsp";

		try {
			request.getRequestDispatcher(url).forward(request, response);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
