package com.source.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.source.employee.entity.Department;
import com.source.employee.service.DepartmentServiceProvider;
import java.util.*;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentServiceProvider departmentServiceProvider;
	
	@GetMapping("/emp")
	public List<Department> getDepartment(@RequestBody Department department)
	{
		return departmentServiceProvider.getDepartment(department);
	}
	@PostMapping("/emp")
	public Department  putDepartment(@RequestBody Department department)
	{
		return departmentServiceProvider.putDepartment(department);
	}
	

}
