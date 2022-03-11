package com.source.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.source.employee.dao.DepartmentDao;
import com.source.employee.entity.Department;

@Service
public class DepartmentServiceProvider {
	@Autowired
	private DepartmentDao departmentdao;

	public List<Department> getDepartment(Department department) {
		return departmentdao.findAll();
	}

	public Department saveDepartment(Department department) {
		return departmentdao.save(department);
	}
	

		
		
		}
		

	
	


