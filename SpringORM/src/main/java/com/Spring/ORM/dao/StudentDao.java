package com.Spring.ORM.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.Spring.ORM.entities.Student;

import javax.transaction.Transactional;

public class StudentDao{
	
	private HibernateTemplate hibernateTemplate;
	
	//save student
	@Transactional
	public int insert(Student student) {
		Integer i=(Integer) this.hibernateTemplate.save(student);
		return i;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}