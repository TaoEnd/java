package com.bjpowernode.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EncodingProblem extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 设置POST请求提交正文中的字符编码
		// 使得服务器端按照UTF-8进行解码，因为GET方法的参数在URI中，
		// 因此该方法无法解决GET方法中的乱码问题，
		// 解决GET方法的乱码问题需要设置servel.xml文件中的内容，同时需要重启服务器
		// request.setCharacterEncoding("UTF-8");
		
		// 第二种方式，该方法对POST、GET方式都起作用
		String name = request.getParameter("name");
		// 请求参数传过来（从tomcat服务器传过来的）时的编码
		byte[] bytes = name.getBytes("ISO8859-1");
		name = new String(bytes, "UTF-8");
	}


}
