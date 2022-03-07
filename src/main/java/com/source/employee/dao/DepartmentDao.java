package com.source.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.source.employee.entity.Department;
@Repository
public interface DepartmentDao extends JpaRepository<Department, Long> {

}
