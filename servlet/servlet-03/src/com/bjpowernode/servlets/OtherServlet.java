package com.bjpowernode.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class OtherServlet implements Servlet{
	
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
		ServletContext servletContext = config.getServletContext();
		String mobile = (String)servletContext.getAttribute("mobile");
		System.out.println("mobile = " + mobile);
		
		// 获取应用名称，即：“/工程名”
		String contextPath = servletContext.getContextPath();
		System.out.println("contextPath = " + contextPath);
		
		// 获取当前工程中某个目录的绝对路径，是基于本地磁盘的
		String realPath = servletContext.getRealPath("/WEB-INF");
		System.out.println("realPath = " + realPath);
	}

}
