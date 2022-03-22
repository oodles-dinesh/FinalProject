package com.source.employee.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.source.employee.entity.User;

@Repository
public interface  UserDao extends JpaRepository<User, Long>{
	
}
