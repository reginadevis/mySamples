package com.in28minutes.springboot.web.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public LoginService(){
		super();
	}

	public boolean validateUser(String username, String password) {
		return username.equalsIgnoreCase("User") && password.equals("Pass");
	}
	
}
