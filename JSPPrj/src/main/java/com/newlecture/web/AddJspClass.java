package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addJsp")
public class AddJspClass extends HttpServlet{

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset = UTF-8");
		
		PrintWriter out = response.getWriter();
		
		int firstNum = 0;
		int secNum = 0;
		
		String x_ = request.getParameter("firstNum");
		String y_ = request.getParameter("secNum");
		
		if(!x_.equals("") && x_ != null) {
			firstNum = Integer.parseInt(x_);
		}
		
		if(!y_.equals("") && y_ != null) {
			secNum = Integer.parseInt(y_);
		}
		
		
		int result = firstNum + secNum;
		
		out.println(result);
		
	}
	
}
