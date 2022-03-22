package com.source.employee.entity;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Role {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long Id;
private String roleAssigned;
private int day;


@ManyToMany(mappedBy = "roles")


private Set<User> users=new HashSet<>();

public long getId() {
	return Id;
}
public void setId(long id) {
	Id = id;
}
public String getRoleAssigned() {
	return roleAssigned;
}
public void setRoleAssigned(String roleAssigned) {
	this.roleAssigned = roleAssigned;
}
public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public Set<User> getUsers() {
	return users;
}
public void setUsers(Set<User> users) {
	this.users =  users;
}
public Role(long id, String roleAssigned, int day, Set<User> users) {
	super();
	Id = id;
	this.roleAssigned = roleAssigned;
	this.day = day;
	this.users = users;
}

public Role()
{
	}
@Override
public String toString() {
	return "Role [Id=" + Id + ", roleAssigned=" + roleAssigned + ", day=" + day + ", users=" + users + "]";
}

}
