package com.source.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.source.employee.entity.EmployeeAddress;

@Repository
public interface EmployeeAddressDao extends JpaRepository<EmployeeAddress, Long> {

}
