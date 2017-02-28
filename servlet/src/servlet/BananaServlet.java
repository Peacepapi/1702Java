package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BananaServlet extends HttpServlet{
	
	@Override
	public void init() throws ServletException {
		System.out.println("INIT for BananaServlet");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req,
			HttpServletResponse resp) 
					throws ServletException, IOException {
		
		// PrintWriter to write to HTTP response body
		resp.getWriter().print("<html>BananaServlet was forwarded "
				+ req.getParameter("username") + "<br/>");
		resp.getWriter().print(req.getAttribute("reqvar") + " <br/>");
		resp.getWriter().print(req.getSession().getAttribute("sessvar"));
		resp.getWriter().print("</html>");
	}
	
}




