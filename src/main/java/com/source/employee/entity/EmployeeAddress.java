package com.source.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeAddress {
	@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private  int houseNumber;
	private String landmark;
	@Column(unique =true)
	private String  place;
	private double latitude;
	private  double longitude;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
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
	public EmployeeAddress(long id, int houseNumber, String landmark, String place, double latitude, double longitude) {
		super();
		this.id = id;
		this.houseNumber = houseNumber;
		this.landmark = landmark;
		this.place = place;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	public EmployeeAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
     
}
