package com.source.employee.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.source.employee.dao.RepositoryDao;
import com.source.employee.entity.Employee;
import com.source.employee.exception.BuisnessException;

@Service
	public class EmployeeServiceProvider {
	
	@Autowired
	private RepositoryDao repositorydao; 
	
		public List<Employee> getEmployee() {
			try {
				List<Employee> employeeList=repositorydao.findAll();
				if(employeeList.isEmpty())
				{
					throw new BuisnessException("604","List is completely Empty nothing to return");
				}
				return employeeList;
			}catch(Exception e)
			{
				 throw new BuisnessException("605","something went wrong in service layer"+e.getMessage());

			}
			
		
		}

	

		public Employee addEmployee(Employee employee) {
			 try {
				 if(employee.getEmp_Name().isEmpty()||employee.getEmp_Name().length()==0)
				 {
					 throw new BuisnessException("601","please give proper name  It's blank");
				 }
				 Employee employeeSaved =repositorydao.save(employee);
				 return employeeSaved;
			 }catch(IllegalArgumentException e)
			 {
				 throw new BuisnessException("602", "given employee is null" +e.getMessage());
			 }
			 catch(Exception e)
			 {
				 throw new BuisnessException("603","something went wrong in service layer"+e.getMessage());
			 }
			
		}

		public void updateEmployee(Employee employee, long id) {
			employee.setId(id);
		repositorydao.save(employee);
			
		}

		
		public void deleteEmployee(long id) {
			
			try {
				
			 repositorydao.deleteById(id);
			
			}
			catch(IllegalArgumentException e)
			{
				throw new BuisnessException("608","please give proper Id"+e.getMessage());
	
			}
			catch(Exception e) {
			throw new BuisnessException("615","No such exception exist in Database"+e.getMessage());
			}
		}

		public void deleteAllEmployee() {
		repositorydao.deleteAll();
			
		}



		public Employee getEmployeeId(long id) {
			try {
			
			 return repositorydao.findById(id).get();
			}
			catch(IllegalArgumentException e)
			
			{
				throw new BuisnessException("606","please give proper Id"+e.getMessage());
			}
			catch(NoSuchElementException e)
			{
				throw new BuisnessException("607","No such Id present in Database"+e.getMessage());
			}
			
		}
		
	

}


		
					
			
		

