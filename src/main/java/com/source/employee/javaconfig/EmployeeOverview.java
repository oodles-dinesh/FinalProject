package com.source.employee.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeOverview {
	
public static void main(String[] args)
  {
	ApplicationContext context =new AnnotationConfigApplicationContext(EmployeeDescription.class);
			EmployeeDetail employeeDetail =context.getBean("getEmployee",EmployeeDetail.class);
			employeeDetail.display();
  }

}
