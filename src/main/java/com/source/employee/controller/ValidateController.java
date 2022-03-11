package com.source.employee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.source.employee.entity.EmployeeValidation;
import com.source.employee.service.ServiceValidation;

@RestController
public class ValidateController {
	@Autowired
	private ServiceValidation servicevalidation;
	@GetMapping("/employee/validation")
	public List<EmployeeValidation> getValidator()
	{
		return  servicevalidation.getValidator();
	}
	@PostMapping("/employee/validation")
	
		public EmployeeValidation putValidator(@RequestBody @Valid EmployeeValidation employee)
		{
		return  servicevalidation.putValidator(employee);
	}

}
