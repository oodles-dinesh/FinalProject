package com.source.employee;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.source.employee.dao.LocationDao;
import com.source.employee.dao.RepositoryDao;
import com.source.employee.entity.Employee;
import com.source.employee.entity.Location;

@SpringBootApplication
public class EmployeeTraineeApplication implements CommandLineRunner
  {
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeTraineeApplication.class, args);
		
		
	}
	 
	@Autowired
	private RepositoryDao repositorydao;
	
   @Autowired
  private LocationDao locationdao;
   
@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Location location =new Location();
		//location.setPlace("oodles private limited");
		location.setDescription("Near by Sohna Chowk");
		location.setPlace("");
		location.setLatitude(45);
		location.setLongitude(54);
		locationdao.save(location);
		
	
	Employee employee =new Employee();
	employee.setEmp_Name("dinesh");
	employee.setEmail("cdinesh123@gmail.com");
	employee.setSalary(new BigDecimal(45000));
	employee.setLocation(location);
	repositorydao.save(employee);
	
	Employee employee1 =new Employee();
	employee.setEmp_Name("vikas");
	employee.setEmail("cdinesh123@gmail.com");
	employee.setSalary(new BigDecimal(45000));
	employee1.setLocation(location);
	repositorydao.save(employee1);
		
	}
             
  }

