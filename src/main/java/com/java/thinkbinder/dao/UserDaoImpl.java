package com.java.thinkbinder.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.java.thinkbinder.model.Login;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Repository("accountDAO")
public class UserDaoImpl implements UserDao {

	@Autowired
	private MongoTemplate mongoTemplate;

	public Login login(String username, String password) {
		try {
			Query query = new Query();
			Login login = mongoTemplate.findOne(query.addCriteria(Criteria.where("username").is(username)),
					Login.class);

			if (login != null) {
				BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

				if (bCryptPasswordEncoder.matches(password, login.getPassword())) {
					return login;
				}
			}
			return null;
		} catch (Exception e) {
			return null;
		}
	}
}
