package com.source.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.source.employee.dao.ProjectDao;
import com.source.employee.entity.Project;
@Service
public class ProjectServiceProvider {
	@Autowired
	private ProjectDao projectDao;

	public List<Project> getProject() {
		return  projectDao.findAll();
		
	}

	

	public Project updatingProject(Project project) {
		return  projectDao.save(project);
	}

}
