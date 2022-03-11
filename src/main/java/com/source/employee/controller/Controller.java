package com.source.employee.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.source.employee.dto.EmployeeLocationDto;
import com.source.employee.entity.Employee;
import com.source.employee.service.EmployeeServiceProvider;

@RestController
public class Controller {
	@Autowired
	private EmployeeServiceProvider employeeservice;

	@GetMapping("/employee")
	public List<Employee> getEmployee() {
		return employeeservice.getEmployee();
	}

	@GetMapping("/employee/{id}")
	public Employee getEmployeedId(@PathVariable("id") long id) {
		return employeeservice.getEmployeeId(id);
	}

	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeservice.addEmployee(employee);
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
	
	@GetMapping("/employee-department")
	public List<EmployeeLocationDto> getAllEmployees(){
		return employeeservice.getallEmployees();
	}
	 
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name",defaultValue = "world",required = true)
	String name,Model model){
		model.addAttribute("name",name);
		return "hello";
		
		
	}
	
     org.slf4j.Logger logger =LoggerFactory.getLogger(Controller.class);

	@GetMapping("/")
	public String homepage()
	{
	  logger.trace("fatal error");
	  return "Project Of Employee_Trainee";
	}
}
