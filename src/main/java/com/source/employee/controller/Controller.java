package com.source.employee.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.source.employee.entity.Employee;
import com.source.employee.exception.BuisnessException;
import com.source.employee.exception.ControllerException;
import com.source.employee.service.EmployeeServiceProvider;

@RestController
public class Controller {
	@Autowired
	private EmployeeServiceProvider employeeservice;

	@GetMapping("/employee")
	public  ResponseEntity<List<Employee>> getEmployee() {
		List<Employee> getAllEmployee=employeeservice.getEmployee();
		return new ResponseEntity<List<Employee>>(getAllEmployee,HttpStatus.OK);
	}

	@GetMapping("/employee/{id}")
	public ResponseEntity<?> getEmployeedId(@PathVariable("id") @Validated long id) {
		try {
		Employee empRetirved= employeeservice.getEmployeeId(id);
		return new ResponseEntity<Employee>(empRetirved,HttpStatus.OK);
		}
		catch(BuisnessException e)
		{
			ControllerException ce=new ControllerException(e.getErrorCode(),e.getErrorMessage());
			return new ResponseEntity<ControllerException>(ce,HttpStatus.BAD_REQUEST);
		}
		catch(Exception e)
		{
			ControllerException ce=new ControllerException("611","Something went wrong in controller layer");
			return new ResponseEntity<ControllerException>(ce,HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping("/employee")
	public ResponseEntity<?> addEmployee(@RequestBody Employee employee) {
		try {
		Employee employeeSaved =employeeservice.addEmployee(employee);
		return  new ResponseEntity<Employee>(employeeSaved,HttpStatus.CREATED);
		}
		catch(BuisnessException e)
		{
			ControllerException ce=new ControllerException(e.getErrorCode(),e.getErrorMessage());
			return new ResponseEntity<ControllerException>(ce,HttpStatus.BAD_REQUEST);
		}
		catch(Exception e)
		{
			ControllerException ce=new ControllerException("610","Something went wrong in controller layer");
			return new ResponseEntity<ControllerException>(ce,HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/employee/{id}")
	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable("id") long id) {
		employeeservice.updateEmployee(employee, id);
		return employee;

	}

	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable("id") long studentid) {
		
		
	         employeeservice.deleteEmployee(studentid);
	

	}

	@DeleteMapping("/employee")
	public void deleteAllEmployee() {
		employeeservice.deleteAllEmployee();
	}
	
	
	 
	
     org.slf4j.Logger logger =LoggerFactory.getLogger(Controller.class);

	@GetMapping("/project")
	public String homepage()
	{
	  logger.trace("fatal error");
	  return "Project Of Employee_Trainee";
	}
}
