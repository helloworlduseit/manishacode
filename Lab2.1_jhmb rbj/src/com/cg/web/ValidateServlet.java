package com.cg.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.dto.Login;
import com.cg.service.LoginService;
import com.cg.service.LoginServiceImpl;


@WebServlet("/ValidateServlet")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	LoginService logService=null;
	public ValidateServlet() {
		super();

	}


	public void init(ServletConfig config) 
			throws ServletException {
		System.out.println("Init of Validate Servlet");
	}


	public void destroy() {
		System.out.println("destroy of Validate Servlet");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		PrintWriter pw=response.getWriter();
		logService= new LoginServiceImpl();
		String unm=request.getParameter("txtName");
		String pwd=request.getParameter("txtPwd");
		try
		{
			Login usr=logService.getUserByUnm(unm);
			if((usr.getUserName().equalsIgnoreCase(unm))&&
					(usr.getPassword().equalsIgnoreCase(pwd)))	//not case sensitive
			{
				response.sendRedirect("success.html");
			}
			else
			{
				response.sendRedirect("failure.html");
			}
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}	
	}

}
