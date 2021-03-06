package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Handle HTTP requests and generates responses
 *
 */
public class HelloServlet extends HttpServlet{
	
	/**
	 * Custom initialization
	 */
	public void init() throws ServletException {
		System.out.println("INIT for HelloServlet");
	}

	public void destroy() {
		System.out.println("DESTROY for HelloServlet");
	}
	

	@Override
	protected void doPost(HttpServletRequest req,
			HttpServletResponse resp) 
					throws ServletException, IOException {
		
		String user = req.getParameter("username");

		// log username on server-side
		System.out.println("User submitted: " + user);
		
		if(user.equals("Dan Pickles")){
			resp.sendRedirect("https://www.google.com/#q=dan+pickles&*");
		}else if(user.equals("Forward")){
			// create example variables
			//request-scoped variable
			req.setAttribute("reqvar", "REQUEST-SCOPED");
			// session-scoped variable
			HttpSession session = req.getSession(); 
			session.setAttribute("sessvar", "SESSION-SCOPED");
			
			//req.getRequestDispatcher("banana").forward(req, resp);
			resp.sendRedirect("banana");
		}
		// write HTML back to the user
		PrintWriter out = resp.getWriter();
		out.print("<html><body>"
				+ "<h1 style='color: green'>Hello, " + user 
				+ "</h1></body></html>");
		// weblogic grabs HttpServletResponse and sends it back
	}
	
}




