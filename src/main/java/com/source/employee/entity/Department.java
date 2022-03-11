package com.source.employee.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity

public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long office_id;
	private String office_name;
	public long getOffice_id() {
		return office_id;
	}
	public void setOffice_id(String office_name) {
		this.office_name = office_name;
	}
	public String getOffice_name() {
		return office_name;
	}
	public void setOffice_name(String office_name) {
		this.office_name = office_name;
	}
	
	
	public Department(long office_id, String office_name, Employee employee, List<Project> project) {
		super();
		this.office_id = office_id;
		this.office_name = office_name;
		this.employee = employee;
		this.project = project;
	}
	public List<Project> getProject() {
		return project;
	}
	public void setProject(List<Project> project) {
		this.project = project;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Employee_id",
	referencedColumnName = "id")
			
 private Employee employee;
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="workspace_id",
	referencedColumnName = "office_id")
	
	private List<Project> project;
}
