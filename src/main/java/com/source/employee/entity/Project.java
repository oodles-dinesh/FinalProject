package com.source.employee.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long project_id;
	private String projectName;
	public long getPrject_id() {
		return project_id;
	}
	public void setPrject_id(long project_id) {
		this.project_id = project_id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public Project(long project_id, String projectName, Department department) {
		super();
		this.project_id = project_id;
		this.projectName = projectName;
		this.department = department;
	
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public Project() {
		super();
	}
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="workspace_id",
	referencedColumnName = "office_id")
	private Department department;
	@ManyToMany
	@JoinTable(name="employee_project",
	 joinColumns = @JoinColumn(name="projectid",referencedColumnName = "project_id"),
	 inverseJoinColumns = @JoinColumn(name="employee_id",referencedColumnName = "id"))
	private  List<Employee>employees; 

}
