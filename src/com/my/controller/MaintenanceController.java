package com.my.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.my.model.Branch;
import com.my.model.College;
import com.my.service.MaintenanceService;
import com.my.service.MaintenanceServiceImpl;

/**
 * Servlet implementation class MaintenanceController
 */
@WebServlet("/maintenance")
public class MaintenanceController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MaintenanceController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in Maintenance Controller Servlet");

		boolean flag = false;
		String action = request.getParameter("action");
		Branch branch = new Branch();
		College college = new College();
		MaintenanceService maintenanceService = new MaintenanceServiceImpl();
		if (action.equals("branch")) {
			branch.setCode(request.getParameter("code"));
			branch.setBranchName(request.getParameter("branchname"));
			flag = maintenanceService.addBranch(branch);

		} else if (action.equals("college")) {

			college.setCode(request.getParameter("code"));
			college.setName(request.getParameter("name"));
			college.setAddress(request.getParameter("address"));
			college.setCity(request.getParameter("city"));
			college.setState(request.getParameter("state"));
			college.setPostCode(request.getParameter("postcode"));
			flag = maintenanceService.addCollege(college);
		}

		if (flag) {
			RequestDispatcher rd = null;

			if (action.equals("branch")) {
				rd = request.getRequestDispatcher("branchDetails.jsp");
				rd.forward(request, response);
			} else if (action.equals("college")) {
				rd = request.getRequestDispatcher("collegeDetails.jsp");
				rd.forward(request, response);
			}

		} else {
			System.out.println("Error");
		}

	}

}
