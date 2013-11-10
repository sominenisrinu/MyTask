package com.my.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.my.model.User;
import com.my.service.UserService;
import com.my.service.UserServiceImpl;

@WebServlet("/login")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;



	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("in User Controller Servlet");
		
		boolean flag = false;
		String action = request.getParameter("action");
		User user = new User();
		UserService userService = new UserServiceImpl();
		if (action.equals("login")) {
			String name = request.getParameter("name");
			String password = request.getParameter("pwd");
			user = userService.checkUser(name, password);
			if (user != null) {
				System.out.println(user.getUsername());
				flag = true;
			} else {
				System.out.println("No Data Returned");
			}
		} else if (action.equals("register")) {

			user.setUsername(request.getParameter("username"));
			user.setPassword(request.getParameter("pwd"));
			user.setEmail(request.getParameter("email"));
			user.setPhno(request.getParameter("phno"));
			flag = userService.addUser(user);
		}
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String password = request.getParameter("password");

		if (flag) {
			List<User> userList= userService.getAllUsers();
			System.out.println("no odf users :"+userList.size());			
			RequestDispatcher rd = request
					.getRequestDispatcher("userDetails.jsp");
			request.setAttribute("users", userList);
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request
					.getRequestDispatcher("login-error.jsp");
			
			rd.forward(request, response);
		}

	}
}
