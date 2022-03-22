package com.source.employee.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.source.employee.entity.Employee;
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
	public ResponseEntity<Employee> getEmployeedId(@PathVariable("id") long id) throws Exception {
	  
	  Employee empRetirved= employeeservice.getEmployeeId(id);
	 
	  return new ResponseEntity<Employee>(empRetirved,HttpStatus.ACCEPTED);
		
				
        	}

	@PostMapping("/employee")
	public ResponseEntity<?> addEmployee(@RequestBody Employee employee) {
		
		Employee employeeSaved =employeeservice.addEmployee(employee);
		return  new ResponseEntity<Employee>(employeeSaved,HttpStatus.CREATED);
		
	}

	@PutMapping("/employee/{id}")
	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable("id") long id) {
		employeeservice.updateEmployee(employee, id);
		return employee;

	}

	@DeleteMapping("/employee/{id}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable("id") long empId) {
	
		employeeservice.deleteEmployee(empId);
		
	       return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	      
	    	  
	      
	

	}
   
	@DeleteMapping("/employee")
	public ResponseEntity<Void>  deleteAllEmployee() {
		employeeservice.deleteAllEmployee();
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	
	
	
     org.slf4j.Logger logger =LoggerFactory.getLogger(Controller.class);

	@GetMapping("/project")
	public String homepage()
	{
	  logger.debug("fatal error");
	  return "Project Of Employee_Trainee";
	}
}
