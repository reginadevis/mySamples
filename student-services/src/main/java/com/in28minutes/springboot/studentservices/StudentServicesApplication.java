package com.in28minutes.springboot.studentservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@SpringBootApplication(scanBasePackages= {"com.in28minutes.springboot.web.controller","com.in28minutes.springboot.web.service"})
public class StudentServicesApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(StudentServicesApplication.class, args);
	}
	


}

