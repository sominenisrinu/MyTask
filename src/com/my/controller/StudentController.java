package com.my.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.my.model.Student;
import com.my.service.StudentService;
import com.my.service.StudentServiceImpl;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudentController() {
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
		System.out.println("in Student Controller Servlet");

		boolean flag = false;
		String action = request.getParameter("action");
		Student student = new Student();

		StudentService studentService = new StudentServiceImpl();
		if (action.equals("student")) {
			student.setCollege_Id(Integer.parseInt(request
					.getParameter("college_id")));
			student.setBranch_Id(Integer.parseInt(request
					.getParameter("branch_id")));
			student.setName(request.getParameter("name"));
			student.setSurName(request.getParameter("surname"));
			student.setRollno(request.getParameter("rollno"));
			student.setAddress(request.getParameter("address"));
			student.setCity(request.getParameter("city"));
			student.setState(request.getParameter("state"));
			student.setPostCode(request.getParameter("postcode"));
			flag = studentService.addStudent(student);
		}
		if (flag) {
			List<Student> studentList = studentService.getAllstudents();
			System.out.println("no off students :" + studentList.size());
			RequestDispatcher rd = request
					.getRequestDispatcher("studentDetails.jsp");
			request.setAttribute("students", studentList);
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request
					.getRequestDispatcher("login-error.jsp");

			rd.forward(request, response );
		}

	}

}
