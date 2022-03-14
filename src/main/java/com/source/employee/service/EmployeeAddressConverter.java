package com.source.employee.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.source.employee.dto.EmployeeAddressDto;
import com.source.employee.entity.EmployeeAddress;

@Component
public class EmployeeAddressConverter {
	@Autowired
	private ModelMapper modelMapper;
	public EmployeeAddressDto entityToDto(EmployeeAddress employeeAddress)
	{
		EmployeeAddressDto dto =new EmployeeAddressDto();
		dto =modelMapper.map(employeeAddress, EmployeeAddressDto.class);
		return dto;
	}
	public EmployeeAddress dtoToEntity(EmployeeAddressDto employeeAddressDto) {
		EmployeeAddress employeeAddress =new EmployeeAddress();
		employeeAddress =modelMapper.map(employeeAddressDto ,EmployeeAddress.class);
		return employeeAddress;
	}
	public List<EmployeeAddress> dtoToEntity(List<EmployeeAddressDto> employeeAddressDto)
	{
		return employeeAddressDto.stream().map(x->dtoToEntity(x)).collect(Collectors.toList());
	}	
	public List<EmployeeAddressDto> entityToDto(List<EmployeeAddress> employeeAddress)
	{
		return employeeAddress.stream().map(x->entityToDto(x)).collect(Collectors.toList());
	}
}
