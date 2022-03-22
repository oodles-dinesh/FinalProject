package com.source.employee.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.source.employee.entity.User;
import com.source.employee.service.UserServiceProvider;

@RestController
public class UserController {
	@Autowired UserServiceProvider userServiceProvider;
	
	@GetMapping("/user")
	public List<User> getAllUser(){
		return userServiceProvider.getAllUser();
		
	}
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable("id") long id )
	{
		return userServiceProvider.getUser(id);
	}
	
	 @PostMapping("/user")
	 public User addUser(@RequestBody User user) {
	  return  userServiceProvider.addUser(user);
	   }
	 @PutMapping("user/{id}")
	 public User updateUser(@RequestBody User user, @PathVariable("id") long id)
	 {
		 User userReterived=userServiceProvider.userUpdate(user,id);
		 return userReterived;
	 }
	 @DeleteMapping("/user/{id}")
	 public void removeEmployee(@PathVariable("id") long id)
	 {
		 userServiceProvider.removeEmployee(id);
	 }
	 @DeleteMapping("/user")
	 
		 public void removeAllEmployee()
		 {
			 userServiceProvider.removeAllEmployee();
		 }
	 
}
