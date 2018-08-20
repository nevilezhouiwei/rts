package com.nevile.rts.web.servlet.login.controller;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nevile.rts.web.servlet.login.pojo.User;
import com.nevile.rts.web.servlet.login.service.UserService;
import com.nevile.rts.web.servlet.login.service.impl.UserServiceDBImpl;

/**
 * Servlet implementation class RegiseterControl
 */
@WebServlet("/register")
public class RegiseterControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService userService = new UserServiceDBImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegiseterControl() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User user = new User();
		user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		user.setUserName(request.getParameter("userName"));
		user.setBirthday(request.getParameter("birthday"));
		user.setPassword(request.getParameter("password"));
		user.setCerIDno(request.getParameter("cerIDno"));
		user.setAddress(request.getParameter("address"));
		if (userService.isInvalidUserName(user)) {
			response.sendRedirect("/rts/jsp/servlet/register_error.jsp");

		} else {
			userService.registerUser(user);
			response.sendRedirect("/rts/jsp/servlet/register_success.jsp");
		}
	}

}
