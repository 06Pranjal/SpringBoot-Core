package com.SpringJDBC.dao;

import java.util.List;

import com.SpringJDBC.entities.Student;

public interface StudentDao {
	public int insert(Student student );
	public int change(Student student);
	public int delete(int studentId);
	//get single data column using a parameter
	public Student getStudent(int studentId);
	
	//get all data 
	public List<Student> getAllStudents();
	
}
