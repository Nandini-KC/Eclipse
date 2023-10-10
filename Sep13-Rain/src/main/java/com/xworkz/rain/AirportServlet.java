package com.xworkz.rain;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/airport",loadOnStartup = 1)
public class AirportServlet extends HttpServlet{
	public AirportServlet() {
		System.out.println("Invoking default constructor in AirportServlet");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("Invoking init in AirportServlet");
		super.init();
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking service in AirportServlet");
		super.service(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String type=req.getParameter("type");
		String country=req.getParameter("country");
		String city=req.getParameter("city");
		String capacity=req.getParameter("capacity");
		String width=req.getParameter("width");
		String totalTerminal=req.getParameter("totalTerminal");
		String openDate=req.getParameter("openDate");
		String operational=req.getParameter("operational");
		String inagrautedBy=req.getParameter("inagrautedBy");
		System.out.println("Name "+name);
		System.out.println("Type "+type);
		System.out.println("Country "+country);
		System.out.println("City "+city);
		System.out.println("Capacity "+capacity);
		System.out.println("Width "+width);
		System.out.println("Toatl Terminal "+totalTerminal);
		System.out.println("Open date "+openDate);
		System.out.println("Operational "+operational);
		System.out.println("Inagrauted By "+inagrautedBy);
		req.setAttribute("key1", name);
		req.setAttribute("key2", type);
		req.setAttribute("key3", country);
		req.setAttribute("key4", city);
		req.setAttribute("key5", capacity);
		req.setAttribute("key6", width);
		req.setAttribute("key7", totalTerminal);
		req.setAttribute("key8", openDate);
		req.setAttribute("key9", operational);
		req.setAttribute("key10", inagrautedBy);
		
	
		RequestDispatcher dispatcher=req.getRequestDispatcher("AirportSuccess.jsp");
		dispatcher.forward(req,resp);
		
		
	}
	@Override
	public void destroy() {
		System.out.println("Invoking destroy in AirportServlet");
		super.destroy();
	}
}
