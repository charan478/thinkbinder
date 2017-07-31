package com.java.thinkbinder.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.thinkbinder.dao.UserDao;
import com.java.thinkbinder.model.Login;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userdao;

	public Login login(String username, String password) {
		
		return userdao.login(username, password);
	}
	
	}


