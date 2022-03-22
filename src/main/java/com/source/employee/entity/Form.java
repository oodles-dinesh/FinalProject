package com.source.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_email")
public class Form {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	 
    @Column(name = "reset_password_token")
    private String resetPasswordToken;
    private String  encodedPassword;

	public String getResetPasswordToken() {
		return resetPasswordToken;
	}

	public void setResetPasswordToken(String resetPasswordToken) {
		this.resetPasswordToken = resetPasswordToken;
	}
	

	public void setPassword(String encodedPassword) {
		this.setPassword(encodedPassword);
	}

	public String getEncodedPassword() {
		return encodedPassword;
	}

	
	}
		
	
     
    


