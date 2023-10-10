package mangocom.xworkz.mango;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/season",loadOnStartup = 1)
public class SeasonServlet extends HttpServlet{
	
	public SeasonServlet() {
		System.out.println("Invoking default constructor in SeasonServlet");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("invoking init in SeasonServlet");
		super.init();
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking service in SeasonServlet");
		super.service(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String country=req.getParameter("country");
		String season=req.getParameter("season");
		System.out.println("Country="+country);
		System.out.println("Season="+season);
		req.setAttribute("key1", country);
		req.setAttribute("key2", season);
	
		RequestDispatcher dispatcher=req.getRequestDispatcher("Success.jsp");
		dispatcher.forward(req,resp);
		
	}
	@Override
	public void destroy() {
		System.out.println("Invoking destroy in SeasonServlet");
		super.destroy();
	}
}
