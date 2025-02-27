package com.org.controller.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class reg
 */
@WebServlet("/register")
public class registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("name");
		String uemail = request.getParameter("email");
		String umobile = request.getParameter("contact");
		String upwd = request.getParameter("password");
		RequestDispatcher dispatcher = null;
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","quasar");
			PreparedStatement pst = con.prepareStatement("insert into user(uname,upwd,uemail,umobile) values(?,?,?,?)");
			pst.setString(1, uname);
			pst.setString(2, upwd);
			pst.setString(3,uemail);
			pst.setString(4, umobile);
			
			int rowCount = pst.executeUpdate();{
			dispatcher = request.getRequestDispatcher("registration.jsp");
				if (rowCount > 0) {
					request.setAttribute("status","success");
					
				}else {
					request.setAttribute("status","failed");
				}
				
				dispatcher.forward(request, response);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
			
		
}}


