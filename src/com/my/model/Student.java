package com.my.model;

public class Student {
	private int student_id;
	private int college_id;
	private int branch_id;
	private String name;
	private String surname;
	private String address;
	private String city;
	private String state;
	private String postcode;
	private String rollno;

	public int getStudent_Id() {
		return student_id;
	}

	public void setId(int student_id) {
		this.student_id = student_id;
	}

	public int getCollege_Id() {
		return college_id;
	}

	public void setCollege_Id(int college_id) {
		this.college_id = college_id;
	}

	public int getBranch_Id() {
		return branch_id;
	}

	public void setBranch_Id(int branch_id) {
		this.branch_id = branch_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surname;
	}

	public void setSurName(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostCode() {
		return postcode;
	}

	public void setPostCode(String postcode) {
		this.postcode = postcode;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
}
