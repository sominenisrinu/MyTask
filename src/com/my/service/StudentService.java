package com.my.service;

import java.util.List;

import com.my.model.Student;

public interface StudentService {
	boolean addStudent(Student student);

	boolean deleteStudent(int student_id);

	boolean updateStudent(Student student);

	public List<Student> getAllstudents();

	public Student getById(int student_id);

}
