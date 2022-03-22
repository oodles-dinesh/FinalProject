package com.source.employee.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.source.employee.dao.ValidatorDao;
import com.source.employee.entity.EmployeeValidation;

@Service
public class ServiceValidation {
	@Autowired
	private ValidatorDao validatordao;
	private  static final  Logger LOGGER=LoggerFactory.getLogger(ServiceValidation.class);

	public List<EmployeeValidation> getValidator() {
		LOGGER.info("Entering detail for login");
		return validatordao.findAll();
	}

	public EmployeeValidation putValidator(EmployeeValidation employee)  {
		LOGGER.info("Authentication the Employee detail is valid ");
		EmployeeValidation employeeValidation=validatordao.save(employee);
	        
		 return employeeValidation;
	 
	}

}
