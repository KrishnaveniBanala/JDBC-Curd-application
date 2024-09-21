import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet {
	

		public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException{
	        
			
					
				int i= Integer.parseInt(req.getParameter("num1"));
				int j = Integer.parseInt(req.getParameter("num1"));
				
				int k = i+j;
				
				//res.sendRedirect("sq?k="+k); // session management we can transfer data one servlet to anthor servlet
				
				   //URL rewriting
				
					/*
					 * HttpSession session = req.getSession(); session.setAttribute("k", k);
					 */
				
				Cookie cookie = new Cookie("k",k+" ");
				res.addCookie(cookie);
				
				res.sendRedirect("sq");
				
				
		
				/*
				 * PrintWriter out = res.getWriter();
				 * 
				 * out.println("result is:"+k);
				 * 
				 * RequestDispatcher rd = req.getRequestDispatcher("sq"); rd.forward(req, res);
				 */
			
			
			
			
			
}
}
