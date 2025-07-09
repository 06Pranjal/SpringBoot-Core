package com.SpringJDBC.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.SpringJDBC.entities.Student;

public class StudentDaoimpl implements StudentDao{
	
	private JdbcTemplate jdbcTemplate;
	@Override
	public int insert(Student student) {
		String query="insert into students(id,name,city) values(?,?,?)";
		int r=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	
	@Override
	public int change(Student student) {
		String query="update students set name=?,city=? where id=?";
		int r=this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	
	
	@Override
	public int delete(int studentId) {
		String query="delete from students where id=?";
		int r=this.jdbcTemplate.update(query,studentId);
		return r;
	}
	
	@Override
	public Student getStudent(int studentId) {
		String query="select * from students where id=?";
		RowMapper<Student> rowMapper= new RowMapperImpl();
		Student student=this.jdbcTemplate.queryForObject(query,rowMapper,studentId);
		return student;
	}	
		
	
	@Override
	public List<Student> getAllStudents() {
	    String query="select * from students";
	    List<Student> students=this.jdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}

	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	

	
	}


	
	
	


