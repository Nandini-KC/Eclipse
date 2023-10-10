package com.xworkz.temple.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.temple.DTO.TempleDTO;
import com.xworkz.temple.repository.TempleRepository;
import com.xworkz.temple.repository.TempleRepositoryImpl;
import com.xworkz.temple.service.TempleService;
import com.xworkz.temple.service.TempleServiceImpl;
@WebServlet(urlPatterns = { "/save","/total","/view"},loadOnStartup = 100)
public class TempleController extends HttpServlet {
	TempleRepository repo=new TempleRepositoryImpl();
	TempleService service=new TempleServiceImpl(repo);
	public TempleController() {
		System.out.println("Invoking Default Constructor");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String place=req.getParameter("place");
		String mainGod=req.getParameter("mainGod");
		int year=Integer.parseInt(req.getParameter("year"));
		String constBy=req.getParameter("by");
		TempleDTO dto=new TempleDTO(name, place, mainGod, year, constBy);
		
		boolean saved=service.ValidateAndSave(dto);
		System.out.println("Data saved+saved");
		req.setAttribute("total",this.service.total());
		 RequestDispatcher dispatcher=req.getRequestDispatcher("TempleInfo.jsp");
		 dispatcher.forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet in TempleController");
		String uri=req.getRequestURI();
		System.out.println("URI is :"+uri);
		if(uri.endsWith("/total"))
		{
			req.setAttribute("total",this.service.total());
			req.getRequestDispatcher("TempleInfo.jsp").forward(req, resp);
		}
		else if(uri.endsWith("/view"))
		{
			req.setAttribute("view",this.service.getAll());
			req.getRequestDispatcher("HomeView.jsp").forward(req, resp);
		}
	}
	
}
