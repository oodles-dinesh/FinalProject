package com.source.employee.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.source.employee.entity.Form;
@Repository
@EnableJpaRepositories
public interface FormDao extends CrudRepository<Form, Integer> {
	// @Query("SELECT c FROM  Form c WHERE c.email = ?1")
	  //  public Form findByEmail(String email); 
	     
	   // public Form findByResetPasswordToken(String token);

}
