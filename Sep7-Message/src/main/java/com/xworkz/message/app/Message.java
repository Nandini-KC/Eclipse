package com.xworkz.message.app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/msg")
public class Message extends HttpServlet{
	public Message()
	{
		System.out.println("Created Servlet");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet in Servlet");
		String name=req.getParameter("name");
		String msg=req.getParameter("msg");
		System.out.println(name);
		System.out.println(msg);
	}

}
