package com.source.employee.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/source/employee/aop/NewFile.xml");
         EmployeeSalaryAccount account =context.getBean("payement",EmployeeSalaryAccount.class);
         //joint point
         account.makePayment();
	}

}
