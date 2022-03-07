package com.source.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.source.employee.entity.Project;
@Repository
public interface ProjectDao extends JpaRepository<Project, Long> {

}
