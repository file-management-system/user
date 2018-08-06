package com.user.repository;

import java.util.List;

import com.user.entity.User;

public interface IUserRepo {
	public List<User> getAll();

	public int addUser(User user);

	public User getUserById(int id);

	public int deleteUserByID(int id);

	public int deleteAll();

	public int updateUserEmail(User user);
}
