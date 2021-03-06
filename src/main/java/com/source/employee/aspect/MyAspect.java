package com.source.employee.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
//where we have fine cross sectional area
@Aspect
public class MyAspect {
	//this is point cut
	@Before("execution( * com.source.employee.aop.EmployeeSalaryAccountImpl.makePayment())")
	public void beforePayment() {
		System.out.println("payment started");
		
	}
	@After("execution( * com.source.employee.aop.EmployeeSalaryAccountImpl.makePayment())")
	public void afterPayment() {
		System.out.println("Money transferred successfully");
	}
  //@Around is used before and after the execution
	 @Around("execution( * com.source.employee.aop.EmployeeSalaryAccountImpl.makePayement())")
	 public void usingAround()
	 {
		 System.out.println("sucessfully done");
	 }
	 @AfterReturning("execution( * com.source.employee.aop.EmployeeSalaryAccountImpl.doOperation())")
	 public void usingAfterReturning() {
		 System.out.println("Do this before Money is Credited");
	 }
	/* @AfterThrowing("execution( * com.source.employee.aop.EmployeeSalaryAccountImpl.doTask())")
	 
		 public void usingAfterThrowing(MyException ex)
		 {
			 System.out.println("this is my exception " +ex);
		 }
		*/ 
	 
}