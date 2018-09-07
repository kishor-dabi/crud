package com.crud.crud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.Model.User;


@RestController
public class crudController {

	@GetMapping("/user")
	@ResponseBody
	private List<User> publi() {
		User u = new User( "1", "aman", "abc"); 
		ArrayList l = new ArrayList();
		System.out.println("User call");
		l.add(u);
		return l;
		
	}
	/*public java.util.List<E> retrieveCoursesForStudent() {
		ArrayList<User> val = new ArrayList<User>();
		System.out.println("User call");
		return (List) val;		
	}*/
}
