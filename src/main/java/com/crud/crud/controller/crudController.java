package com.crud.crud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.Model.User;
import com.crud.service.UserService;


@RestController
public class crudController {

//	@Autowired
	private UserService userService;  
	
	@GetMapping("/user")
	@ResponseBody
	private List<User> getUser() {
		User u = new User( "1", "aman", "abc"); 
		ArrayList l = new ArrayList();
		System.out.println("User call");
		l.add(u);
		return l;
		
	}
	
	@PostMapping("/user")
	private User saveUser(@RequestBody User user){
		User user2 = userService.save(user);
		return user2;
	}
	/*public java.util.List<E> retrieveCoursesForStudent() {
		ArrayList<User> val = new ArrayList<User>();
		System.out.println("User call");
		return (List) val;		
	}*/
}
