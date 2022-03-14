package com.source.employee.aop;

public class EmployeeSalaryAccountImpl implements EmployeeSalaryAccount {

	@Override
	public void makePayment() {
		System.out.println("Salary credited ");	
		
	}

	@Override
	public void makeReview() {
		System.out.println("regarding tax pay ");
		
	}

	@Override
	public int doOperation() {
		 return 500;
		
	}

	@Override
	public String doTask() {
		
		throw new MyException("this is my exception");
	
	}

}
