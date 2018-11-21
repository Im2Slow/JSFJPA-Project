package com.jsf.jpa.crud;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="StudentManager")
@SessionScoped
public class StudentManager {
public StudentEntity getEditedStudent() {
		return editedStudent;
}
public void setEditedStudent(StudentEntity editedStudent) {
		this.editedStudent = editedStudent;
}
public StudentManager() {
	}
List<Student> students;
Student newStudent = new Student();
StudentEntity editedStudent = new StudentEntity();

public List<Student> getStudents() {
	return students;
}
public void setStudents(List<Student> students) {
	this.students = students;
}
public List<Student> loadStudents() {
	students = StudentDbUtil.getStudents();
	return students;
}
public String addStudent() {
	StudentDbUtil.addStudent(newStudent);
	newStudent = new Student();
	return "list-student.xhtml";
}
public String editStudent(StudentEntity student) {
	editedStudent = student;
	return "edit-student.xhtml";
}
public String updateStudent() {
	StudentDbUtil.updateStudent(editedStudent);
	return "list-student.xhtml";
}
public void deleteStudent(int id) {
	StudentDbUtil.deleteStudent(id);
}
public StudentEntity fetchStudent(int id) {
	return StudentDbUtil.fetchStudent(id);
}
public Student getNewStudent() {
	return newStudent;
}
public void setNewStudent(Student newStudent) {
	this.newStudent = newStudent;
}
}
