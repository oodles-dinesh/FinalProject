package com.source.employee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
@Entity
public class EmployeeValidation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotEmpty
	@Email
	private  String email;
	@NotEmpty
	@Size(min = 8,message = "the password should atleast 8 character")
	private  String password;
	@NotEmpty
	@Size(min=10,max=10,message = "It contains 10 digits")
	private String phoneNumber;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public EmployeeValidation(long id ,String email,String password,String phoneNumber)
	 {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}
	public EmployeeValidation() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
