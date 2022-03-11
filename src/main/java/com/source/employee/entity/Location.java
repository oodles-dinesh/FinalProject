package com.source.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	//private String place;
	@Column(unique = true)
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
	public Location(long id, String description,String place, double latitude, double longitude) {
		super();
		this.id = id;
		this.place = place;
		this.description = description;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
