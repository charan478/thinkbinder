package com.java.thinkbinder.dao;

import com.java.thinkbinder.model.Login;

public interface UserDao {
	
	public Login login(String username, String password);
}
