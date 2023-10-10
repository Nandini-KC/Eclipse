package com.xworkz.zoo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/save",loadOnStartup = 1)
public class WasteServlet extends HttpServlet{
	public WasteServlet() {
		System.out.println("Invoking constructor in wasteServlet");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("Invoking init in WasteServlet");
		super.init();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String type=req.getParameter("type");
		String weight=req.getParameter("weight");
		double newWeight=Double.parseDouble(weight);
		
		System.out.println("Name="+name);
		System.out.println("Type="+type);
		System.out.println("Weight="+weight);
		
		WasteRepository wasteRepository=new WasteRepositoryImpl();
		WasteService wasteService=new WasteServiceImpl(wasteRepository);
		WasteDTO dto=new WasteDTO(name, type, newWeight);
		boolean saved=wasteService.ValidateAndSave(dto);
		if(saved)
		{
			System.out.println("Waste is saved"+saved);
			req.setAttribute("msg", "waste is saved");
		}
		else
		{
			System.out.println("Waste is not saved"+saved);
			req.setAttribute("msg", "waste is not saved");
		}
		RequestDispatcher dispatcher=req.getRequestDispatcher("WasteSuccess.jsp");
		dispatcher.forward(req,resp);
		
	}
	@Override
	public void destroy() {
		System.out.println("Invoking destroy in WasteServlet");
		super.destroy();
	}
}
