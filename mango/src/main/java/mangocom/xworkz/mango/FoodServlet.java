package mangocom.xworkz.mango;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/food",loadOnStartup = 1)
public class FoodServlet extends HttpServlet{
	public FoodServlet() {
		System.out.println("Invoking default constructor in FoodServlet");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("Invoking init in FoodServlet");
		super.init();
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking service in FoodServlet");
		super.service(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String type=req.getParameter("type");
		String hotelName=req.getParameter("hotelName");
		String price=req.getParameter("price");
		String quantity=req.getParameter("quantity");
		
		
		double price1=Double.parseDouble(price);
		double quantity1=Double.parseDouble(quantity);
		double totalAmount=price1*quantity1;
		String total=String.valueOf(totalAmount);
		
		
		System.out.println("Name "+name);
		System.out.println("Type "+type);
		System.out.println("Hotel Name "+hotelName);
		System.out.println("Price "+price);
		System.out.println("Quantity "+quantity);
		System.out.println("Total"+total);
	
		req.setAttribute("key1", name);
		req.setAttribute("key2", type);
		req.setAttribute("key3", hotelName);
		req.setAttribute("key4", price);
		req.setAttribute("key5", quantity);
		req.setAttribute("key6", total);
		
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("FoodSuccess.jsp");
		dispatcher.forward(req,resp);
		
		
	}
	@Override
	public void destroy() {
		System.out.println("Invoking destroy in FoodServlet");
		super.destroy();
	}

}
