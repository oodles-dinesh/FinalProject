package com.source.employee.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.source.employee.dao.UserDao;
import com.source.employee.entity.User;

@Service
public class  UserServiceProvider {
	@Autowired UserDao userDao;

	public List<User> getAllUser() {
		 return userDao.findAll();
	   
	}

	public User getUser(long id) {
		return userDao.getById(id);
	}

	public User addUser(User user) {
		return userDao.save(user);
	}

	public User userUpdate(User user, long id) {
	
		user.setId(id);
		return userDao.save(user);
	}

	public void removeEmployee(long id) {
		userDao.deleteById(id);
		
	}

	public void removeAllEmployee() {
		userDao.deleteAll();
		
	}

	
}
