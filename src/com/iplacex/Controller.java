package com.iplacex;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    DAO test;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException{
    	String jdbcURL=getServletContext().getInitParameter("jdbcURL");
    	String jdbcUserName=getServletContext().getInitParameter("jdbcUserName");
    	String jdbcPassword=getServletContext().getInitParameter("jdbcPassword");
    	System.out.println(jdbcURL);
    	try {
			test= new DAO(jdbcURL, jdbcUserName, jdbcPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		doGet(request, response);
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		try {
		      Class.forName("com.mysql.cj.jdbc.Driver");
		      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eva2","root","admin");
		      Statement stmt = con.createStatement();
		      if(name.isEmpty()&&pass.isEmpty()) {
		    	  out.println("Los campos no pueden estar vacios");
		      }else {
		    	  ResultSet rs = stmt.executeQuery("select username, password from usuario where username='"+name+"' and password='"+pass+"'");
			      
			      
			      if(rs.next()) {
			        response.sendRedirect("home.jsp?name="+rs.getString("username"));
			        HttpSession session = request.getSession();
			        session.setAttribute("name", name);
			        
			        
			      }else {
			        out.println("Usuario o contraseña incorrecto");
			      }
		      }
		      
		      
		      
		      
		    } catch (ClassNotFoundException e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		    } catch (SQLException e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		    }
	}

}
