package com.xworkz.dosa.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/register",loadOnStartup = 1)
public class Register extends HttpServlet{
	public Register() {
		System.out.println("Creating servlet");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("Invoking init in Register");
		super.init();
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking service in register");
		super.service(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String pass=req.getParameter("reenterpassword");
		System.out.println("Name="+name);
		System.out.println("\nEmail="+email);
		System.out.println("\nPassword="+"xxxxx");
		System.out.println("\nConfirm password="+"xxxxx");
		
		
		resp.setContentType("text/html");
		PrintWriter printWriter=resp.getWriter();
		printWriter.print("<html>");
		printWriter.print("<head>");
		printWriter.print("<meta charset=\"utf-8\">");
		printWriter.print("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
		printWriter.print("<title>");
		printWriter.print("Response page");
		printWriter.print("</title>");
		printWriter.print("<link\r\n"
				+ "	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\r\n"
				+ "	rel=\"stylesheet\"\r\n"
				+ "	integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\r\n"
				+ "	crossorigin=\"anonymous\">");
		printWriter.print("</head>");
		printWriter.print("<body>");
		printWriter.print("<nav class=\"navbar bg-primary\" data-bs-theme=\"dark\">\r\n"
				+ "			<ul class=\"nav nav-pills card-header-pills\">\r\n"
				+ "				<li class=\"nav-item\"><a class=\"nav-link active\"\r\n"
				+ "					href=\"index.html\">Home</a></li>\r\n"
				+ "				<li class=\"nav-item\"><a class=\"nav-link active\"\r\n"
				+ "					href=\"movie.html\">Movie</a></li>\r\n"
				+ "\r\n"
				+ "			</ul>\r\n"
				+ "		</nav>");
		printWriter.print("<script\r\n"
				+ "		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"\r\n"
				+ "		integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\"\r\n"
				+ "		crossorigin=\"anonymous\"></script>");
		printWriter.print("<br>Registration succesfully completed!!!!!!");
		printWriter.print("<br>Name="+name);
		printWriter.print("<br>Email="+email);
		printWriter.print("</body>");
		printWriter.print("</html>");
		
	}
}
