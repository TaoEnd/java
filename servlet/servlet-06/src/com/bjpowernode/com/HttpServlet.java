package com.bjpowernode.com;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		service(request, response);
	}

	private void service(HttpServletRequest request, HttpServletResponse response) {
		String method = request.getMethod();
		if("POST".equals(method)) {
			doPost(request, response);
		}else if("GET".equals(method)){
			doGet(request, response);
		}
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) {
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) {
	}
	
}
