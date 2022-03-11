package com.source.employee.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeDescription {
@Bean	
public EmployeeDetail getEmployee() {
	EmployeeDetail employeeDetail =new EmployeeDetail();
	return  employeeDetail;
	
}
}
