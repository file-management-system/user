package com.user.queries;

public class QueryBuilder {
	public static final String GET_ALL = "SELECT * FROM USER";
	public static final String INSERT = "INSERT INTO USER(USER_ID, EMAIL, PASSWORD) VALUES(?,?,?)";
	public static final String GET_USER_BY_ID = "select * from user where user_id = ?";
	public static final String DELETE_USER_BY_ID = "delete from user where user_id = ?";
	public static final String DELETE_ALL = "delete from user";
	public static final String UPDATE_EMAIL_BY_ID = "update user set email = ? where user_id = ?";

	public static final String NJ_GET_ALL = "SELECT * FROM USER";
	public static final String NJ_INSERT = "INSERT INTO USER(USER_ID, EMAIL, PASSWORD) VALUES(:id,:email,:password)";
	public static final String NJ_GET_USER_BY_ID = "select * from user where user_id = :id";
	public static final String NJ_DELETE_USER_BY_ID = "delete from user where user_id = :id";
	public static final String NJ_DELETE_ALL = "delete from user";
	public static final String NJ_UPDATE_EMAIL_BY_ID = "update user set email = :email where user_id = :id";
}
