package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/calc2")
public class Calc2 extends HttpServlet{

	@Override
	public void service(HttpServletRequest request
						, HttpServletResponse response) throws ServletException, IOException{
		
		ServletContext application = request.getServletContext();
		HttpSession session = request.getSession();
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset = UTF-8");
		
		PrintWriter out = response.getWriter();
		
		
		String v_ = request.getParameter("v");
		String op = request.getParameter("operator");
		
		
		int v = 0;
		
		if(!v_.equals("")) {
			v = Integer.parseInt(v_);
		}
		
		
		
		if(op.equals("=")) {
			
//			int x = (int) application.getAttribute("value");
			int x = (int) session.getAttribute("value");
			int y = v;
//			String operator = (String) application.getAttribute("op");
			String operator = (String) session.getAttribute("op");
			int result = 0;
			
			if(operator.equals("+")) {
				result = x + y;
				out.printf("result is %d\n", result);
			}else {
				result = x - y;
				out.printf("result is %d\n", result);
			}
			
		} else {
//			application.setAttribute("value", v);
//			application.setAttribute("op", op);
			session.setAttribute("value", v);
			session.setAttribute("op", op);
		}
		
	}
}
