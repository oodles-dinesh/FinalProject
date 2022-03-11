package com.source.employee.dto;

public class EmployeeLocationDto {
	private long id;
	private String Employee_Name;
	private String place;
	private String description;
	private double latitude;
	private double longitude;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmployee_Name() {
		return Employee_Name;
	}
	public void setEmployee_Name(String employee_Name) {
		Employee_Name = employee_Name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	@Override
	public String toString() {
		return "EmployeeLocationDto [id=" + id + ", Employee_Name=" + Employee_Name + ", place=" + place
				+ ", description=" + description + ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}
	
	
	
}
	
	
	