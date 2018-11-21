package com.jsf.jpa.crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class StudentDbUtil {
	private static final String PERSIS_NAME = "JSFJPA";
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSIS_NAME);
	private static EntityManager em = factory.createEntityManager();
	private static EntityTransaction et = em.getTransaction();
	@SuppressWarnings("unchecked")
	public static List<Student> getStudents() {
		Query q = em.createQuery("SELECT s FROM StudentEntity s order by s.id");
		List<Student> studentList = q.getResultList();
		return studentList;
	}
	public static void addStudent(Student student) {
		if(!et.isActive()) {
			et.begin();
		}
		StudentEntity newStudent = new StudentEntity();
		newStudent.setFirstname(student.getFirstname());
		newStudent.setLastname(student.getLastname());
		newStudent.setEmail(student.getEmail());
		em.persist(newStudent);
		et.commit();
	}
	public static void deleteStudent(int id) {
		if(!et.isActive()) {
			et.begin();
		}
		StudentEntity deleteStudent = new StudentEntity();
		deleteStudent.setId(id);
		em.remove(em.merge(deleteStudent));
		et.commit();
	}
	public static void updateStudent(StudentEntity student) {
		if(!et.isActive()) {
			et.begin();
		}
		em.merge(student);
		et.commit();
	}
	public static StudentEntity fetchStudent(int id) {
		Query q = em.createQuery("SELECT s FROM StudentEntity s WHERE s.id = :id");
		q.setParameter("id", id);
		StudentEntity selectedStud = (StudentEntity) q.getSingleResult();
		return selectedStud;
		
	}
}
