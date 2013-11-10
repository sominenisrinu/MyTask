package com.my.service;

import java.util.List;

import com.my.model.User;

public interface UserService {

	public boolean addUser(User user);

	public boolean deleteUser(int id);

	public boolean updateUser(User user);

	public List<User> getAllUsers();

	public User getUserById(int id);

	public User checkUser(String name, String password);

}
