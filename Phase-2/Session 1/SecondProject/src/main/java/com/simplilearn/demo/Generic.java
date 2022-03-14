package com.simplilearn.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/login")
public class Generic extends GenericServlet{

	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		HttpSession session=req.getSession();
		
		String uname= req.getParameter("uname");
		String pass= req.getParameter("pass");
		
		if(pass.equals("admin123"))
		{ 
			out.print("Login done successfully");
			out.print("Welcome "+uname);
		}
		else
		{
			out.print("invalid Login");
			resp.sendRedirect("logout.html");
			
		}
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}