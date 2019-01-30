package com.bjpowernode.com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("This is HelloServlet's service()!");
		String servletName = this.getServletName();
		System.out.println(servletName);
	}
	
	@Override
	public void init(){
		// 首先调用父类的init方法，对父类的config进行初始化，防止父类中方法因为
		// config为空出现异常
		System.out.println("========");
	}

}
