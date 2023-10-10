package com.xworkz.rain;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/vendor",loadOnStartup = 1)
public class VendorServlet extends HttpServlet{
	public VendorServlet() {
		System.out.println("Invoking default constructor in VendorServlet");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("Invoking init in VendorServlet");
		super.init();
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking service in VendorServlet");
		super.service(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String gst=req.getParameter("gst");
		String owner=req.getParameter("owner");
		String location=req.getParameter("location");
		System.out.println("Name "+name);
		System.out.println("GST "+gst);
		System.out.println("Owner "+owner);
		System.out.println("Location "+location);
		req.setAttribute("key1", name);
		req.setAttribute("key2", gst);
		req.setAttribute("key3", owner);
		req.setAttribute("key4", location);
	
		RequestDispatcher dispatcher=req.getRequestDispatcher("VendorSuccess.jsp");
		dispatcher.forward(req,resp);
		
		
	}
	@Override
	public void destroy() {
		System.out.println("Invoking destroy in VendorServlet");
		super.destroy();
	}
}

