package com.java.thinkbinder.services;

import com.java.thinkbinder.model.Login;

public interface UserService {
	public Login login(String username, String password);
}
