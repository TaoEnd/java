package com.bjpowernode.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OtherMethods extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获取请求的URL
		StringBuffer requestURL = request.getRequestURL();
		System.out.println("requesetUrl：" + requestURL);
		
		// 获取请求的URI，URI是URL去掉请求协议和host后剩余的部分
		String requestURI = request.getRequestURI();
		System.out.println("requestUri：" + requestURI);
		
		// 获取当前web项目的根路径
		String contextPath = request.getContextPath();
		System.out.println("context path : " + contextPath);
		
		// 获取客户端IP
		String clientIP = request.getRemoteAddr();
		System.out.println("client IP : " + clientIP);
	}

}
