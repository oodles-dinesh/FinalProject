package com.source.employee.globalexception;

import java.util.Date;
import java.util.NoSuchElementException;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;

import org.springframework.beans.factory.UnsatisfiedDependencyException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.source.employee.exception.ExceptionOccured;

@ControllerAdvice
public class MyControllerAdvice extends ResponseEntityExceptionHandler {
	@ExceptionHandler(NoSuchElementException.class)
	
	public ResponseEntity<Object> handleEmptyException(NoSuchElementException exceptionHandling,WebRequest request)
	{
		
	 ExceptionOccured exceptionOccured =new ExceptionOccured( exceptionHandling.getMessage(),
			 new Date(),request.getDescription(false));
	 return new ResponseEntity<Object>(exceptionOccured,HttpStatus.NOT_FOUND);
	 
	 
	}
	@ExceptionHandler(EmptyResultDataAccessException.class)
	public ResponseEntity<Object> handleEmptyException(EmptyResultDataAccessException exceptionHandling,WebRequest request)
	{
		
	 ExceptionOccured exceptionOccured =new ExceptionOccured( exceptionHandling.getMessage(),
			 new Date(),request.getDescription(false));
	 return new ResponseEntity<Object>(exceptionOccured,HttpStatus.NOT_FOUND);
	 
	 
	}
	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<Object> handleEmptyException(DataIntegrityViolationException exceptionHandling,WebRequest request)
	{
		
	 ExceptionOccured exceptionOccured =new ExceptionOccured( exceptionHandling.getMessage(),
			 new Date(),request.getDescription(false));
	 return new ResponseEntity<Object>(exceptionOccured,HttpStatus.NOT_FOUND);
	 
	 
	}
	@ExceptionHandler(java.lang.NullPointerException.class)
	public ResponseEntity<Object> handleEmptyException(java.lang.NullPointerException exceptionHandling,WebRequest request)
	{
		
	 ExceptionOccured exceptionOccured =new ExceptionOccured( exceptionHandling.getMessage(),
			 new Date(),request.getDescription(false));
	 return new ResponseEntity<Object>(exceptionOccured,HttpStatus.BAD_REQUEST);
	 
	 
	}
	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<Object> handleEmptyException( ConstraintViolationException exceptionHandling,WebRequest request)
	{
		
	 ExceptionOccured exceptionOccured =new ExceptionOccured( exceptionHandling.getMessage(),
			 new Date(),request.getDescription(false));
	 return new ResponseEntity<Object>(exceptionOccured,HttpStatus.BAD_REQUEST);
	 
	 
	}
	@ExceptionHandler(UnsatisfiedDependencyException.class)
	public ResponseEntity<Object> handleEmptyException( UnsatisfiedDependencyException exceptionHandling,WebRequest request)
	{
		
	 ExceptionOccured exceptionOccured =new ExceptionOccured( exceptionHandling.getMessage(),
			 new Date(),request.getDescription(false));
	 return new ResponseEntity<Object>(exceptionOccured,HttpStatus.BAD_REQUEST);
	 
	 
	}
	@ExceptionHandler(java.lang.Exception.class)
	public ResponseEntity<Object> handleEmptyException( java.lang.Exception exceptionHandling,WebRequest request)
	{
		
	 ExceptionOccured exceptionOccured =new ExceptionOccured( exceptionHandling.getMessage(),
			 new Date(),request.getDescription(false));
	 return new ResponseEntity<Object>(exceptionOccured,HttpStatus.BAD_REQUEST);
	 
	 
	}
	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported( @Valid  HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		return new ResponseEntity<Object>("please change you are provide a wrong URL",HttpStatus.BAD_GATEWAY);
	}

}