package com.source.employee.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class Employee {
          @Id
          @GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
		private String Employee_Name;
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
		@OneToOne(mappedBy = "employee")
		private Department department;
		

	}


