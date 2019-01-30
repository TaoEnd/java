package com.bjpowernode.com;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class HelloServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		/*
		 * 多态：分为上转型和下转型
		 * 上转型：将子类引用赋值给父类引用
		 * 下转型：将父类引用赋值给子类引用，但是java不支持真正的下转型，在使用时需要给
		 * 父类引用进行强制转换
		 */
		HttpServletRequest request = (HttpServletRequest) req;
		
		// 获取请求的提交方式
		String method = request.getMethod();
		System.out.println("method = " + method);
		
		if("POST".equals(method)) {
			doPost(req, res);
		}else if("GET".equals(method)){
			doGet(req, res);
		}
	}

	private void doGet(ServletRequest req, ServletResponse res) {
		System.out.println("This is Get");
	}

	private void doPost(ServletRequest req, ServletResponse res) {
		System.out.println("This is Post");
	}
	
}
