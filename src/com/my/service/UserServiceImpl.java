package com.my.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.my.model.User;
import com.my.util.DBconnection;

public class UserServiceImpl implements UserService {

	@Override
	public boolean addUser(User user) {

		Connection conn = null;
		try {

			conn = DBconnection.getConnection();
			PreparedStatement pStmt = conn
					.prepareStatement("insert into user(username,password,email,phno) values (?, ?, ?, ? )");

			pStmt.setString(1, user.getUsername());
			pStmt.setString(2, user.getPassword());
			pStmt.setString(3, user.getEmail());
			pStmt.setString(4, user.getPhno());
			pStmt.executeUpdate();

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
		return false;
	}

	@Override
	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			conn = DBconnection.getConnection();
			PreparedStatement pStmt = conn
					.prepareStatement("delete from users where id=?");

			pStmt.setInt(1, id);
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
	public boolean updateUser(User user) {
		Connection conn = null;
		try {
			conn = DBconnection.getConnection();
			PreparedStatement pStmt = conn
					.prepareStatement("update users set username=?, password=?, email=?,phno=?"
							+ "where userid=?");

			pStmt.setString(1, user.getUsername());
			pStmt.setString(2, user.getPassword());

			pStmt.setString(4, user.getEmail());

			pStmt.setString(1, user.getPhno());
			pStmt.setInt(5, user.getId());
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
	public List<User> getAllUsers() {
		Connection conn = null;
		List<User> users = new ArrayList<User>();
		try {
			conn = DBconnection.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rSet = stmt.executeQuery("select * from user");
			while (rSet.next()) {
				User user = new User();
				user.setId(rSet.getInt("id"));
				user.setUsername(rSet.getString("username"));
				user.setPassword(rSet.getString("password"));
				user.setEmail(rSet.getString("email"));
				user.setPhno(rSet.getString("phno"));
				users.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception ex) {

			}
		}

		return users;
	}

	@Override
	public User getUserById(int id) {
		Connection conn = null;
		User user = new User();
		try {
			conn = DBconnection.getConnection();
			PreparedStatement pStmt = conn
					.prepareStatement("select * from user where id=?");
			pStmt.setInt(1, id);
			ResultSet rSet = pStmt.executeQuery();

			if (rSet.next()) {
				user.setId(rSet.getInt("id"));
				user.setUsername(rSet.getString("username"));
				user.setPassword(rSet.getString("password"));

				user.setEmail(rSet.getString("email"));
				user.setPhno(rSet.getString("phno"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception ex) {

			}
		}

		return user;
	}

	public User checkUser(String username, String password) {
		Connection conn = null;
		User user = new User();
		try {
			conn = DBconnection.getConnection();
			PreparedStatement pStmt = conn
					.prepareStatement("select * from user where username=? and password=?");
			pStmt.setString(1, username);
			pStmt.setString(2, password);
			ResultSet rSet = pStmt.executeQuery();

			System.out.println("username :" + username);
			System.out.println("password :" + password);

			if (rSet.next()) {
				System.out.println("in result set");
				user.setId(rSet.getInt("id"));

				user.setUsername(rSet.getString("username"));
				user.setPassword(rSet.getString("password"));

				user.setEmail(rSet.getString("email"));
				user.setPhno(rSet.getString("phno"));
				return user;
			} else {
				return null;
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
}
