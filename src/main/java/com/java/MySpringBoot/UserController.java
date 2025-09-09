package com.java.MySpringBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan("Student")
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/users")
	public List<Users> getAllUsers() {
		List<Users> users = service.getAllUserService();
		Student s= new Student(1,"Ajay");
		return users;
	}

}
