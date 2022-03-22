package com.source.employee.exception;

import java.util.Date;

public class ExceptionOccured  {
	private String error;
	private Date timestamp;
	private String path;
	
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public ExceptionOccured(String error, Date timestamp, String path) {
		super();
		this.error = error;
		this.timestamp = timestamp;
		this.path = path;
	}

	public ExceptionOccured() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	
	
    
}
