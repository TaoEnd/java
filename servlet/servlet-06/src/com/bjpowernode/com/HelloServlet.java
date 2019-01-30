package com.bjpowernode.com;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("This is Get Method");
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("This is Post Method");
	}
	
}
