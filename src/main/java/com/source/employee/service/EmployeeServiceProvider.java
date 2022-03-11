package com.source.employee.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.source.employee.dao.RepositoryDao;
import com.source.employee.dto.EmployeeLocationDto;
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

		
		public void deleteEmployee(long id) {
			repositorydao.deleteById(id);
			
		}

		public void deleteAllEmployee() {
		repositorydao.deleteAll();
			
		}



		public Employee getEmployeeId(long id) {
			
			 return repositorydao.getById(id);
			
		}
		
	public List<EmployeeLocationDto> getallEmployees(){
		return repositorydao.findAll()
				.stream()
				.map(this::convertEntityToDto)
				.collect(Collectors.toList());
	}
		
	
	
		private EmployeeLocationDto  convertEntityToDto(Employee employee) 
		{
			EmployeeLocationDto employeeLocationDto=new EmployeeLocationDto();
			employeeLocationDto.setId(employee.getId());
			employeeLocationDto.setEmployee_Name(employee.getEmp_Name());
			employeeLocationDto.setPlace(employee.getLocation().getPlace());
			employeeLocationDto.setLatitude(employee.getLocation().getLatitude());
			employeeLocationDto.setLongitude(employee.getLocation().getLongitude());
			employeeLocationDto.setDescription(employee.getLocation().getDescription());
		 return employeeLocationDto;
		}


}


		
					
			
		

