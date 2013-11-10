package com.my.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.my.model.Student;
import com.my.util.DBconnection;

public class StudentServiceImpl implements StudentService {

	@Override
	public boolean addStudent(Student student) {
		// TODO Auto-generated method stub
		boolean flag = false;
		Connection conn = null;
		try {

			conn = DBconnection.getConnection();
			PreparedStatement pStmt = conn
					.prepareStatement("insert into user(college_id,branch_id,name,surname,address,city,state,postcode,rollno) values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
			pStmt.setInt(1, student.getCollege_Id());
			pStmt.setInt(2, student.getBranch_Id());
			pStmt.setString(3, student.getName());
			pStmt.setString(4, student.getSurName());
			pStmt.setString(5, student.getAddress());
			pStmt.setString(6, student.getCity());
			pStmt.setString(7, student.getState());
			pStmt.setString(8, student.getPostCode());
			pStmt.setString(9, student.getRollno());
			int rtn = pStmt.executeUpdate();
			if (rtn == 1) {
				flag = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
	}

	@Override
	public boolean deleteStudent(int student_id) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			conn = DBconnection.getConnection();
			PreparedStatement pStmt = conn
					.prepareStatement("delete from student where id=?");

			pStmt.setInt(1, student_id);
			pStmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception ex) {

			}
		}
		return false;
	}

	@Override
	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			conn = DBconnection.getConnection();
			PreparedStatement pStmt = conn
					.prepareStatement("update student set college_id=?,branch_id=?,name=?, surname=?, address=?,city=?,state=?,postcode=?,rollno=?"
							+ "where student_id=?");
			pStmt.setInt(1, student.getCollege_Id());
			pStmt.setInt(2, student.getBranch_Id());
			pStmt.setString(3, student.getName());
			pStmt.setString(4, student.getSurName());
			pStmt.setString(5, student.getAddress());
			pStmt.setString(6, student.getCity());
			pStmt.setString(7, student.getState());
			pStmt.setString(8, student.getPostCode());
			pStmt.setString(9, student.getRollno());
			pStmt.setInt(10, student.getStudent_Id());

			pStmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception ex) {

			}
		}
		return false;
	}

	@Override
	public List<Student> getAllstudents() {
		// TODO Auto-generated method stub
		Connection conn = null;
		List<Student> students = new ArrayList<Student>();
		try {
			conn = DBconnection.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rSet = stmt.executeQuery("select * from student");
			while (rSet.next()) {
				Student student = new Student();
				student.setId(rSet.getInt("student_id"));
				student.setId(rSet.getInt("college_id"));
				student.setId(rSet.getInt("branch_id"));
				student.setName(rSet.getString("name"));
				student.setSurName(rSet.getString("surname"));
				student.setAddress(rSet.getString("address"));
				student.setCity(rSet.getString("city"));
				student.setState(rSet.getString("state"));
				student.setPostCode(rSet.getString("postcode"));
				student.setRollno(rSet.getString("rollno"));
				students.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception ex) {

			}
		}

		return null;
	}

	@Override
	public Student getById(int student_id) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Student student = new Student();
		try {
			conn = DBconnection.getConnection();
			PreparedStatement pStmt = conn
					.prepareStatement("select * from user where student_id=?");
			pStmt.setInt(1, student_id);
			ResultSet rSet = pStmt.executeQuery();

			if (rSet.next()) {

				student.setCollege_Id(rSet.getInt("college_id"));
				student.setBranch_Id(rSet.getInt("branch_id"));
				student.setName(rSet.getString("name"));
				student.setSurName(rSet.getString("surname"));

				student.setAddress(rSet.getString("address"));
				student.setCity(rSet.getString("city"));
				student.setState(rSet.getString("state"));
				student.setPostCode(rSet.getString("city"));
				student.setRollno(rSet.getString("rollno"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception ex) {

			}
		}

		return student;
	}

}
