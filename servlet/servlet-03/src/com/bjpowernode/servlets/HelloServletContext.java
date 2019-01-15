package com.bjpowernode.servlets;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServletContext implements Servlet{
	
	private ServletConfig config;

	public void destroy() {
	}

	public ServletConfig getServletConfig() {
		return config;
	}

	public String getServletInfo() {
		return null;
	}

	public void init(ServletConfig config) throws ServletException {
		this.config = config;
	}

	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// 获取context对象
		ServletContext servletContext = config.getServletContext();
		
		// 获取context的初始化参数
		Enumeration<String> names = servletContext.getInitParameterNames();
		while(names.hasMoreElements()) {
			String name = names.nextElement();
			String value = servletContext.getInitParameter(name);
			System.out.println(name + " = " + value);
		}
		
		// 设置域属性（全局属性）
		servletContext.setAttribute("email", "xxx@163.com");
		servletContext.setAttribute("mobile", "1234567");
	}

}
