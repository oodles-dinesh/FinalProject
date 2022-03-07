package com.source.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.source.employee.dao.ValidatorDao;
import com.source.employee.entity.EmployeeValidation;

@Service
public class ServiceValidation {
	@Autowired
	private ValidatorDao validatordao;

	public List<EmployeeValidation> getValidator() {
		return validatordao.findAll();
	}

	public EmployeeValidation putValidator(EmployeeValidation employee) {
		return validatordao.save(employee);
	}

}
