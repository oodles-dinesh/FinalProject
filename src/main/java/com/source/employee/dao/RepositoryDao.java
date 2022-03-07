package com.source.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.source.employee.entity.Employee;

@Repository
@EnableJpaRepositories
public interface RepositoryDao extends JpaRepository<Employee, Long> {


}
