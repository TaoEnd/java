package com.bjpowernode.servlets;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet implements Servlet{
	
	private ServletConfig config;

	public void destroy() {
	}

	public ServletConfig getServletConfig() {
		return config;
	}

	public String getServletInfo() {
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException {
		this.config = arg0;
		System.out.println("config = " + config);
	}

	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// 获取servlet对象的名字
		String servletName = config.getServletName();
		System.out.println("servletName = " + servletName);
		
		// 获取servlet对象的context
		ServletContext context = config.getServletContext();
		System.out.println("servletContext = " + context);
		
		// 获取初始化参数
		Enumeration<String> names =  config.getInitParameterNames();
		while(names.hasMoreElements()) {
			String name = names.nextElement();
			String value = config.getInitParameter(name);
			System.out.println(name + " = " + value);
		}
	}

}
