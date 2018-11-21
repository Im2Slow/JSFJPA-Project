package com.jsf.jpa.crud;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Pattern;
@Entity
@Table(name="student")
public class StudentEntity {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
@NotNull @Size(min=2,max=20)
private String firstname;
@NotNull @Size(min=2,max=20)
private String lastname;
@NotNull @Pattern(regexp="^(.+)@(.+)$")
private String email;
public StudentEntity() { }
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}
