package com.java.MySpringBoot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	public List<Users> getAllUserService(){
		
		List<Users> list = new ArrayList<Users>();
		return Arrays.asList(new Users(1, "Vikas", "bangalore"),
		new Users(2, "Alok", "Delhi"),
		new Users(3, "Vivek", "DDU"),
		new Users(4, "Naveen", "RT Nagar"),
		new Users(5, "Raj", "Hubali"));
	}
}
