package com.source.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.source.employee.dao.RepositoryDao;
import com.source.employee.entity.Employee;

@Service
	public class EmployeeServiceProvider {
	
	@Autowired
	private RepositoryDao repositorydao; 
	
		public List<Employee> getEmployee() {
			return repositorydao.findAll();
		
		}

	
		
		

		public Employee addEmployee(Employee employee) {
			// TODO Auto-generated method stub
			return repositorydao.save(employee);
		}

		public void updateEmployee(Employee employee, long id) {
			employee.setId(id);
		repositorydao.save(employee);
			
		}

		
		public void deleteEmployee(long studentid) {
			repositorydao.deleteById(studentid);
			
		}

		public void deleteAllEmployee() {
		repositorydao.deleteAll();
			
		}



		public Employee getEmployeeId(long id) {
			
			 return repositorydao.getById(id);
			
		}
		

		

}
