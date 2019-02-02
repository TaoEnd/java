package com.bjpowernode.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestParameterServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获取指定名称的请求参数值
		String name = request.getParameter("name");
		String ageString = request.getParameter("age");
		int age = Integer.parseInt(ageString);
		System.out.println("name = " + name + "，age = " + age);
		
		// 获取所有请求参数名称
		Enumeration<String> names = request.getParameterNames();
		while(names.hasMoreElements()) {
			System.out.println("parameterName = " + names.nextElement());
		}
		
		// 获取请求参数值，返回类型是字符串数组
		String[] values = request.getParameterValues("name");
		for(String value : values) {
			System.out.println(value);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
