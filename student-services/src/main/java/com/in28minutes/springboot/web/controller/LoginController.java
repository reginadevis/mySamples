package com.in28minutes.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.in28minutes.springboot.web.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		return "login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String showWelcome(ModelMap model,@RequestParam String username, @RequestParam String password) {
		
		boolean isValidUser = loginService.validateUser(username, password);
		if(!isValidUser) {
			model.put("error", "Invalid User");
			return "login";
		}
		model.put("name", username);
		model.put("password", password);
		return "welcome";
		
	}

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

}