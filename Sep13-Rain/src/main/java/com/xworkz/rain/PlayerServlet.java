package com.xworkz.rain;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/player",loadOnStartup = 1)
public class PlayerServlet extends HttpServlet{
	public PlayerServlet() {
		System.out.println("Invoking default constructor in PlayerServlet");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("Invoking init in PlayerServlet");
		super.init();
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking service in PlayerServlet");
		super.service(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String sport=req.getParameter("sport");
		String country=req.getParameter("country");
		String married=req.getParameter("married");
		String wife=req.getParameter("wife");
		String gender=req.getParameter("gender");
		String dob=req.getParameter("dob");
		String father=req.getParameter("father");
		String jerseyNo=req.getParameter("jerseyNo");
		String captainName=req.getParameter("captain");
		String coachName=req.getParameter("coach");
		String mother=req.getParameter("mother");
		String age=req.getParameter("age");
		String alive=req.getParameter("alive");
		System.out.println("Name "+name);
		System.out.println("Sport "+sport);
		System.out.println("Country "+country);
		System.out.println("Married "+married);
		System.out.println("Wife "+wife);
		System.out.println("Gender "+gender);
		System.out.println("DOB "+dob);
		System.out.println("Father "+father);
		System.out.println("JerseyNo "+jerseyNo);
		System.out.println("Captain Name "+captainName);
		System.out.println("Coach Name "+coachName);
		System.out.println("Mother "+mother);
		System.out.println("Age "+age);
		System.out.println("Alive "+alive);
		req.setAttribute("key1", name);
		req.setAttribute("key2", sport);
		req.setAttribute("key3", country);
		req.setAttribute("key4", married);
		req.setAttribute("key5", wife);
		req.setAttribute("key6", gender);
		req.setAttribute("key7", dob);
		req.setAttribute("key8", father);
		req.setAttribute("key9", jerseyNo);
		req.setAttribute("key10", captainName);
		req.setAttribute("key11", coachName);
		req.setAttribute("key12", mother);
		req.setAttribute("key13", age);
		req.setAttribute("key14", alive);
	
		RequestDispatcher dispatcher=req.getRequestDispatcher("PlayerSuccess.jsp");
		dispatcher.forward(req,resp);
		
		
	}
	@Override
	public void destroy() {
		System.out.println("Invoking destroy in PlayerServlet");
		super.destroy();
	}
}
