package com.Spring.ORM.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.Spring.ORM.entities.Student;

import java.util.List;

import javax.transaction.Transactional;

public class StudentDao{
	
	private HibernateTemplate hibernateTemplate;
	
	//save student
	@Transactional
	public int insert(Student student) {
		Integer i=(Integer) this.hibernateTemplate.save(student);
		return i;
	}
	
	//get the single data(object)
	public Student getStudent(int studentId) {
		Student student=this.hibernateTemplate.get(Student.class,studentId);
		return student;
	}
	
	//get all students
	public List<Student> getAllStudents(){
		List<Student> students=this.hibernateTemplate.loadAll(Student.class);
		return students;
		
	}
	
	//delete the data
	@Transactional
	public void deleteStudent(int studentId) {
		Student student=this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
	}
	
	//update
	@Transactional
	public void updateStudent(Student student) {
		this.hibernateTemplate.update(student);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}