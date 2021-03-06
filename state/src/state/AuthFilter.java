package state;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class AuthFilter implements Filter{

	@Override
	public void destroy() {}

	@Override
	public void doFilter(ServletRequest req, 
			ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Entering /secure/* Filter");
		// check if user is logged in
		HttpServletRequest request = (HttpServletRequest) req;
		if(request.getSession().getAttribute("logged_user") == null){
			// if no, goto login.do with errors
			req.setAttribute("please_login", "You must login!");
			//req.getRequestDispatcher("login.do")
				//.forward(req, resp); 
				//remains as localhost:7001/state/secure/login.do
			
			req.getRequestDispatcher("/login.do")
				.forward(req, resp); 
				// TODO removes everything before login.do
		}else{
			// if yes, go ahead
			chain.doFilter(req, resp); // send to next item in filterchain
		}
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		String file = config.getInitParameter("configLocation");
		System.out.println("Filter Reading config file @ " 
				+ file + " to initialize servlet");
		String global = config.getServletContext()
				.getInitParameter("globalConfig");
		System.out.println("Filter reading global config file @ " 
				+ global + " to initialize servlet");
	}

}
