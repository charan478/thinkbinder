package com.java.thinkbinder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.java.thinkbinder.model.Login;
import com.java.thinkbinder.services.UserService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
@Autowired
	private UserService userService;

@RequestMapping(method = RequestMethod.GET)
public String index(ModelMap modelMap){
	modelMap.put("login", new Login());
		return "login.jsp";
}
}
