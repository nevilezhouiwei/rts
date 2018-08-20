package com.nevile.rts.web.servlet.login.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nevile.rts.web.servlet.login.pojo.User;
import com.nevile.rts.web.servlet.login.service.UserService;
import com.nevile.rts.web.servlet.login.service.impl.UserServiceDBImpl;

/**
 * Servlet implementation class Login
 */
@WebServlet("/loginAction")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService userService = new UserServiceDBImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
		user.setUserName(request.getParameter("userName"));
		user.setPassword(request.getParameter("password"));
		User onlineUser = userService.chekLogin(user);
		if(onlineUser!=null) {
			request.getSession().setAttribute("login", onlineUser);
			response.sendRedirect("/rts/jsp/login/index.jsp");
		}else {
			request.setAttribute("message", "用户名或密码错误");
			request.getRequestDispatcher("/jsp/login/login.jsp").forward(request, response);
		}
		
	}

}
