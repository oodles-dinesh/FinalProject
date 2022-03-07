package com.source.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.source.employee.entity.Project;
import com.source.employee.service.ProjectServiceProvider;

@RestController
@RequestMapping("/employee")
public class ProjectController {
	@Autowired
	private ProjectServiceProvider projectServiceProvider;
	@GetMapping("/mapping")
	public List<Project> getProject(){
		return projectServiceProvider.getProject();
	}
	@PostMapping("/mapping")
	public Project updatingProject(Project project)
	{
		return projectServiceProvider.updatingProject(project);
	}
 
}
