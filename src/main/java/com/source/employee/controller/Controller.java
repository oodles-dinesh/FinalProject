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

import com.source.employee.entity.Employee;
import com.source.employee.service.EmployeeServiceProvider;

@RestController
	public class Controller{
		@Autowired
		private EmployeeServiceProvider employeeservice;
          @GetMapping("/employee")
		public List<Employee> getEmployee()
		{
			return employeeservice.getEmployee();
		}
		@GetMapping("/employee/{id}")
		public Employee  getEmployeedId(@PathVariable("id") long  id)
		{
			return employeeservice.getEmployeeId(id);
		}
		@PostMapping("/employee")
		  public Employee addEmployee(@RequestBody Employee employee)
		  {
			  return employeeservice.addEmployee(employee);
		  }
		  @PutMapping("/employee/{id}")
		  public Employee updateEmployee(@RequestBody Employee employee,@PathVariable("id") long id)
		  {
			  employeeservice.updateEmployee(employee,id);
			  return employee;
			  
		  }
		  @DeleteMapping("/employee/{id}")
		  public void deleteEmployee(@PathVariable("id") long studentid)
		 {
			 employeeservice.deleteEmployee(studentid);
			 
		  }
		  @DeleteMapping("/employee")
		  public void deleteAllEmployee()
		  {
			  employeeservice.deleteAllEmployee();
		  }
		
		
	}


