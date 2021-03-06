package com.revature.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fc.Example;

public class FrontController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req,
			HttpServletResponse resp) 
					throws ServletException, IOException {
		// hard-coded dispatch logic
		String requestURI = req.getRequestURI(); // "/fc/abc.do"
		switch(requestURI){
			case "/fc/abc.do":{
				// invoke business logic
				new Example().log("Request sent for ABC");
				resp.sendRedirect("abc.html");
				break;
			}
			case "/fc/xyz.do":{
				// invoke OTHER business logic
				new Example().log("Request sent for XYZ");
				resp.sendRedirect("xyz.html");
				break;
			}
			default: {
				throw new IllegalArgumentException("Invalid URI");
			}
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	
}
