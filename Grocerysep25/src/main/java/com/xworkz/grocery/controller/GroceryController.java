package com.xworkz.grocery.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.grocery.dto.GroceryDTO;
import com.xworkz.grocery.repository.GroceryRepository;
import com.xworkz.grocery.repository.GroceryRepositoryImpl;
import com.xworkz.grocery.service.GroceryService;
import com.xworkz.grocery.service.GroceryServiceImpl;
@WebServlet(urlPatterns = { "/save","/total","/view"},loadOnStartup = 100)
public class GroceryController extends HttpServlet {
	GroceryRepository repo=new GroceryRepositoryImpl();
	GroceryService service=new GroceryServiceImpl(repo);
	public GroceryController() {
		System.out.println("Invoking Default Constructor");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		double price=Double.parseDouble(req.getParameter("price"));
		String type=req.getParameter("type");
		double quantity=Double.parseDouble(req.getParameter("quantity"));
		
		
		GroceryDTO dto=new GroceryDTO(name, price, type, quantity);
		
		boolean saved=service.ValidateAndSave(dto);
		System.out.println("Data Saved "+saved);
		req.setAttribute("total", this.service.total());
		RequestDispatcher dispatcher=req.getRequestDispatcher("Grocery.jsp");
		dispatcher.forward(req, resp);
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet in GroceryController");
		String uri=req.getRequestURI();
		System.out.println("URI is :"+uri);
		if(uri.endsWith("/total"))
		{
			req.setAttribute("total",this.service.total());
			req.getRequestDispatcher("Grocery.jsp").forward(req, resp);
		}
		else if(uri.endsWith("/view"))
		{
			req.setAttribute("view",this.service.getAll());
			req.getRequestDispatcher("GroceryView.jsp").forward(req, resp);
		}
	}
}
