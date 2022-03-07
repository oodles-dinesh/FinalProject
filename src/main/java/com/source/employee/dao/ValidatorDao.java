package com.source.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.source.employee.entity.EmployeeValidation;

@Repository
public interface ValidatorDao extends JpaRepository<EmployeeValidation, Long> {

}
