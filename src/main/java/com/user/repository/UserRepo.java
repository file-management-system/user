package com.user.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.user.entity.User;
import com.user.queries.QueryBuilder;

@Repository(value = "JT")

public class UserRepo implements IUserRepo {

	@Autowired
	JdbcTemplate template;

	public List<User> getAll() {
		RowMapper<User> rowMapper = new UserRowmapper();
		return template.query(QueryBuilder.GET_ALL, rowMapper);
	}

	public int addUser(User user) {
		return template.update(QueryBuilder.INSERT, user.getUserId(), user.getEmail(), user.getPassword());
	}

	public User getUserById(int id) {
		RowMapper<User> rowMapper = new UserRowmapper();
		return template.queryForObject(QueryBuilder.GET_USER_BY_ID, new Object[] { id }, rowMapper);
	}

	public int deleteUserByID(int id) {
		return template.update(QueryBuilder.DELETE_USER_BY_ID, new Object[] { id });
	}

	public int deleteAll() {
		return template.update(QueryBuilder.DELETE_ALL);
	}

	public int updateUserEmail(User user) {
		return template.update(QueryBuilder.UPDATE_EMAIL_BY_ID, user.getEmail(), user.getUserId());
	}

	

}
