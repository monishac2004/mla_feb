package com.test;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/LifecycleDemo")
public class LifecycleDemo extends GenericServlet {
	private static final long serialVersionUID = 1L;
     
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init()");
	}

	
	public void destroy() {
		System.out.println("destroy()");
	}

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("service()");
		System.out.println("Processing request and response");
	}

}
