package state;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	
	@Override
	public void init() throws ServletException {
		String file = this.getServletConfig()
				.getInitParameter("configLocation");
		System.out.println("Servlet Reading config file @ " 
				+ file + " to initialize servlet");
		
		String global = this.getServletContext()
				.getInitParameter("globalConfig");
		System.out.println("Servlet reading globalConfig config file @ " 
				+ global + " to initialize servlet");
	}
	
	// http://localhost:7001/state/login.do
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// check if cookie exists
		Cookie[] cookies = req.getCookies();
		if(cookies != null){
			for(Cookie cookie : cookies){
				if(cookie.getName().equals("u")){
					// if so, send username to JSP to prepopulate field
					req.setAttribute("val", cookie.getValue());
				}
			}
		}

		req.getRequestDispatcher("login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// number of seconds to timeout the session
		// programmatic not recommended... use declarative approach  
		// req.getSession().setMaxInactiveInterval(300);
		
		// store username as a cookie
		Cookie cookie = new Cookie("u", req.getParameter("user"));
		// number of seconds before cookie expires
		cookie.setMaxAge(60 * 60 * 24);
		// cookie.setMaxAge(-1);
		resp.addCookie(cookie);
		
		// store first name in session
		User user = new User(req.getParameter("f_name"),
				req.getParameter("user"),
				req.getRemoteAddr());
		req.getSession().setAttribute("logged_user", user);
		
		// send to another page
		//resp.sendRedirect("/secure/home.jsp"); removes context path
		resp.sendRedirect("secure/home.jsp"); 
			// TODO remove forward slash
	}
	
}








