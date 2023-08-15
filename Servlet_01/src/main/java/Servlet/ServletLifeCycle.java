package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lifeCycle")
public class ServletLifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {
	  System.out.println("init() 호출");
	}
	
	@Override
	public void destroy() {
	  System.out.println("destroy() 호출");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  System.out.println("doGet() 호출");
	  response.setContentType("text/html");
	  response.setCharacterEncoding("EUC-KR");
		response.getWriter().append("<h1>Check Servlet LifeCycle</h1>");
	}

}
