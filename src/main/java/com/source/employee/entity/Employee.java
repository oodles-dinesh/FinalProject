package com.source.employee.entity;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "employee",uniqueConstraints = @UniqueConstraint(name="unique_email",
columnNames = {"email"}))
		  
public class Employee {
          @Id
          @GeneratedValue(strategy = GenerationType.AUTO)
			private long id;
          
			private String Employee_Name;
		
			@Column(name = "email")
             private String Email;
			
			private BigDecimal salary;
			//basically this is for bi directional 
			@OneToOne(mappedBy = "employee")
			private Department department;
			
	           @ManyToOne(targetEntity = Location.class,
	        		   cascade =CascadeType.ALL )
	           @JoinColumn(name="location_id",referencedColumnName = "id"
	           )
	           private Location location;
			
		public Employee(long id, String employee_Name, String email, BigDecimal d) {
			super();
			this.id = id;
			Employee_Name = employee_Name;
			Email = email;
			this.salary = d;
		}
		
		

		public Employee() {
			super();
			
		}
	

		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getEmp_Name() {
			return Employee_Name;
		}
		public void setEmp_Name(String employee_Name) {
			Employee_Name = employee_Name;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public BigDecimal getSalary() {
			return salary;
		}
		public void setSalary(BigDecimal salary) {
			this.salary = salary;
		}
		
           
           
		
       	public Location getLocation() {
			return location;
		}



		public void setLocation(Location location) {
			this.location = location;
		}



		public Employee(long id, String employee_Name, String email, BigDecimal salary, Department department,
				Location location) {
			super();
			this.id = id;
			Employee_Name = employee_Name;
			Email = email;
			this.salary = salary;
			this.department = department;
			this.location =location;
		
		}



		
		

    
	
		
	}


