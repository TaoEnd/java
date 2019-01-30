package com.bjpowernode.com;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

// 缺省适配器设计模式（该类实现一个接口，但是只实现这个接口中的部分方法，并且是空实现，
// 留下部分方法让它的子类来实现）
public abstract class GenericServlet implements Servlet, ServletConfig {

	private ServletConfig config;

	public void destroy() {
	}

	public ServletConfig getServletConfig() {
		return config;
	}

	public String getServletInfo() {
		return null;
	}
	
	// jvm在执行过程中首先调用当前对象的无参构造器，然后再调用init()方法，
	// 服务器只会调用带参数的init()方法，由于父类中包含了这个方法，因此在它的
	// 子类对象中也会存在这个方法，因此在调用过程中this指代的这个父类的子类对象，
	// 它调用的init()方法也是子类中的init()方法
	// 这是模板方法设计模式
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		init();
	}
	
	// 在父类中增加一个无参init()方法，防止在子类中出错，忘了加上super.init()；
	public void init(){
	}

	public abstract void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException;
	
	public String getInitParameter(String name) {
		return config.getInitParameter(name);
	}
	
	public Enumeration<String> getInitParameterNames() {
		return config.getInitParameterNames();
	}
	
	public ServletContext getServletContext() {
		return config.getServletContext();
	}
	
	public String getServletName() {
		return config.getServletName();
	}
}
