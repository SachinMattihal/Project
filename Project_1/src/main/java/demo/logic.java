package demo;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class logic implements Servlet
{

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("firstname");
		String name1=req.getParameter("lastname");
		System.out.println("good afternoon "+name);
		System.out.println("good afternoon "+name1);
		res.getWriter().print("<h1 style='color:green;'>good afternoon "+name+" "+name1+"</h1>");
		
	}

}
