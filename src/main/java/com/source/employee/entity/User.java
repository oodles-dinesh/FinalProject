package com.source.employee.entity;



import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String userName;
	
	@ManyToMany(cascade =CascadeType.PERSIST,fetch  = FetchType.EAGER)
	@JoinTable(name = "user_role",joinColumns = @JoinColumn(name="user_id"),
	inverseJoinColumns = @JoinColumn(name="role_id"))
	private List<Role> roles;
	@Temporal(TemporalType.DATE)
	private Date date;
	 public Date getDate() {
	        return date;
	    }
	    public void setDate(Date date) {
	        this.date = date;
	    }
	  
	    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern ="HH:MM:SS")
	    @Temporal(TemporalType.TIME)
       private Date time;
      
       
	
	public Date getTime() {
			return time;
		}
		public void setTime(Date time) {
			this.time = time;
		}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public User(long id, String userName, List<Role> roles) {
		super();
		this.id = id;
		this.userName = userName;
		this.roles = roles;
	
	}
	
	
	
	public User() {
		
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", roles=" + roles + "]";
	}
	
	

}
