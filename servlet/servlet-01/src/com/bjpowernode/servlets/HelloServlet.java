package com.bjpowernode.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet implements Servlet{
	

	// 无参构造器和init()只执行一次，service()方法可以执行多次
	public HelloServlet() {
		System.out.println("This is HelloServlet()");
	}

	public void destroy() {
		System.out.println("This is destory()");
		
	}
	
	// 容器向servlet传递信息
	public ServletConfig getServletConfig() {
		System.out.println("This is getServletConfig()");
		return null;
	}
	
	// getServletInfo方法是对当前servlet的说明，比如当前servlet方法的版本、作者等
	public String getServletInfo() {
		System.out.println("This is getServletInfo()");
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("This is init()");
	}

	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("This is service()");
	}

}
