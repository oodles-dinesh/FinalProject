package com.source.employee.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity

public class Employee {
          @Id
          @GeneratedValue(strategy = GenerationType.AUTO)
			private long id;
			private String Employee_Name;
			@Column(unique=true)
             private String Email;
			private BigDecimal salary;
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
		//basically this is for bi directional 
		@OneToOne(mappedBy = "employee")
		private Department department;
		
           @ManyToOne
           @JoinColumn(name="location_id",referencedColumnName = "id"
           )
           
           private Location location;
		
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


