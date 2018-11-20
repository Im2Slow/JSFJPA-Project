package com.jsf.jpa.crud;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="StudentManager")
@SessionScoped
public class StudentManager {
public StudentManager() {
	}
List<Student> students;
Student newStudent = new Student();

public List<Student> getStudents() {
	return students;
}
public Student getStudent() {
	return newStudent;
}
public void setStudent(Student newStudent) {
	this.newStudent = newStudent;
}
public void setStudents(List<Student> students) {
	this.students = students;
}
public List<Student> loadStudents() {
	students = StudentDbUtil.getStudents();
	return students;
}
public void addStudent(Student s) {
	StudentDbUtil.addStudent(s);
}
public void editStudent(Student s) {
	StudentDbUtil.editStudent(s);
}
public void deleteStudent(int id) {
	StudentDbUtil.deleteStudent(id);
}
public StudentEntity fetchStudent(int id) {
	return StudentDbUtil.fetchStudent(id);
}
}
