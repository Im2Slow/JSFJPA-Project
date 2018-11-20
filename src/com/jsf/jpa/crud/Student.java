package com.jsf.jpa.crud;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Student {
	public Student() {
		super();
	}
	public Student(String firstname, String lastname, String email) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}
	public Student(int id, String firstname, String lastname, String email) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}
	
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_Name() {
		return firstname;
	}
	public void setFirst_Name(String first_Name) {
		this.firstname = first_Name;
	}
	public String getLast_Name() {
		return lastname;
	}
	public void setLast_Name(String last_Name) {
		this.lastname = last_Name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", first_Name=" + firstname + ", last_Name=" + lastname + ", email=" + email
				+ "]";
	}
}

