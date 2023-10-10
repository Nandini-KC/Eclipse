package com.xworkz.dosa.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/msg")
public class Movies extends HttpServlet{
	public Movies()
	{
		System.out.println("Created servlet");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet in Servlet");
		String name=req.getParameter("name");
		String lang=req.getParameter("lang");
		String director=req.getParameter("director");
		String producer=req.getParameter("producer");
		String budget=req.getParameter("budget");
		String releaseDate=req.getParameter("date");
		System.out.println(name);
		System.out.println(lang);
		System.out.println(director);
		System.out.println(producer);
		System.out.println(budget);
		System.out.println(releaseDate);
		
		resp.setContentType("text/html");
		PrintWriter printWriter=resp.getWriter();
		printWriter.print("<html>");
		printWriter.print("<head>");
		printWriter.print("<meta charset=\"ISO-8859-1\">");
		printWriter.print("<title>Insert title here</title>");
		printWriter.print("<style type=\"text/css\">\r\n"
				+ "ul{\r\n"
				+ "    list-style-type: none;\r\n"
				+ "   background-color: rgb(225, 153, 177);\r\n"
				+ "}\r\n"
				+ "li{\r\n"
				+ "    display: inline-block;\r\n"
				+ "    padding: 10px;\r\n"
				+ "\r\n"
				+ "}\r\n"
				+ "body{\r\n"
				+ "    margin: 0;\r\n"
				+ "}\r\n"
				+ "a{\r\n"
				+ "    text-decoration: none;\r\n"
				+ "}\r\n"
				+ ".right{\r\n"
				+ "   float: right;\r\n"
				+ "}\r\n"
				+ "li:hover{\r\n"
				+ "    background-color: pink;\r\n"
				+ "}\r\n"
				+ "li a:hover{\r\n"
				+ "    color: green;\r\n"
				+ "}\r\n"
				+ "</style>");
		printWriter.print("</head>");
		printWriter.print("<body>");
		printWriter.print("<ul>\r\n"
				+ "  <li style=\"float: right;\"><a href=\"index.html\">Home</a></li>\r\n"
				+ "</ul>"
				+ " <br> name is " + name 
				
				+ "<br> lang is " + lang
				+ "<br> director " + director
				+ "<br> producer " + producer
				+ "<br> budget is " + budget
				+ "<br>Realease Date " + releaseDate);
		
		printWriter.print("</body>");
		printWriter.print("</html>");
		
	}

}
