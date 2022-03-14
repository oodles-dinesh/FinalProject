package com.source.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.source.employee.dao.EmployeeAddressDao;
import com.source.employee.dto.EmployeeAddressDto;
import com.source.employee.entity.EmployeeAddress;
import com.source.employee.service.EmployeeAddressConverter;

  @RestController
public class EmployeeAddressController {
	
	
		@Autowired EmployeeAddressDao  employeeAddressDao;
		@Autowired EmployeeAddressConverter employeeAddressConverter;
		@GetMapping("/find")
		public List<EmployeeAddressDto> findAll()
		
		{
			List<EmployeeAddress> findAll = employeeAddressDao.findAll();
			return employeeAddressConverter.entityToDto(findAll);
		}
		
		@GetMapping("/find/{id}")
	  public EmployeeAddressDto findById(@PathVariable("id") long id){
			EmployeeAddress getById= employeeAddressDao.findById(id).orElse(null);
		  return employeeAddressConverter.entityToDto(getById);
	  }
		@PostMapping("/save")
		public EmployeeAddressDto  save(@RequestBody EmployeeAddressDto dto)
		{
			EmployeeAddress employeeAddress = employeeAddressConverter.dtoToEntity(dto);
			employeeAddress=employeeAddressDao.save(employeeAddress);
			System.out.println(employeeAddress);
			return employeeAddressConverter.entityToDto(employeeAddress);
					
			
		}
		
	}


