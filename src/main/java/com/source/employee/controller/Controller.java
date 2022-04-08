package com.source.employee.controller;

import java.util.List;

import javax.validation.constraints.NegativeOrZero;

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
	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable("id") long id) 
			throws Exception{
	Employee employee1=	employeeservice.updateEmployee(employee, id);
	if(employee1==null)
	throw new Exception("this id is not exist in database"+id);	
	
		return employee1;

	}

	@DeleteMapping("/employee/{id}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable("id") long empId) throws Exception {
		boolean flag =false;
		   if(flag==false) {
            employeeservice.deleteEmployee(empId);
 	       return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
		   }
		   else
		   {
			   flag=true;
			 throw new Exception("this id is not present in db"+empId);
		
		   }
	      
	    	  
	      
	

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
