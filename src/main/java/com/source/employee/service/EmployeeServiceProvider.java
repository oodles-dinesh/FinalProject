package com.source.employee.service;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.source.employee.dao.RepositoryDao;
import com.source.employee.entity.Employee;
import com.source.employee.exception.BuisnessException;

@Service
	public class EmployeeServiceProvider {
	private static final org.slf4j.Logger LOGGER=  LoggerFactory.getLogger(EmployeeServiceProvider.class);
	
	@Autowired
	private RepositoryDao repositorydao; 
	
		public List<Employee> getEmployee() {
			try {
				List<Employee> employeeList=repositorydao.findAll();
				if(employeeList.isEmpty())
				{
					LOGGER.info("this is empty");
					throw new BuisnessException("604","List is completely Empty nothing to return");
				}
				LOGGER.info("reteriving");
				return employeeList;
			}catch(Exception e)
			{
				 throw new BuisnessException("605","something went wrong in service layer"+e.getMessage());

			}
			
		
		}

	

		public Employee addEmployee(Employee employee) {
			 
				 try {
					 LOGGER.info("saving");
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

		public Employee updateEmployee(Employee employee, long id) {
		LOGGER.info("updating");
			employee.setId(id);
		return repositorydao.save(employee);
			
		}

		
		
			
		

		public void deleteAllEmployee() {
		repositorydao.deleteAll();
			
		}



		public Employee getEmployeeId(long id) throws Exception{
		
			
			 Employee empl= repositorydao.findById(id).get();
			 if(empl==null)
			 {
				 throw new Exception("this key  is not valid");
			 }
			 
			 return empl;
			
			
		}



		public void deleteEmployee(long empId) {
		 //  Employee employeeId =new Employee();
				
	        repositorydao.deleteById(empId);
			
		}
		
	

}


		
					
			
		

