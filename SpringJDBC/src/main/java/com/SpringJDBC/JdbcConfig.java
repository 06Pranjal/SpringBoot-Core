package com.SpringJDBC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.SpringJDBC.dao.StudentDao;
import com.SpringJDBC.dao.StudentDaoimpl;

@Configuration
public class JdbcConfig {
	
	@Bean(name = {"ds"})
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("123456");
		return ds;
	}
	
	@Bean(name = {"jdbcTemplate"})
	public JdbcTemplate getTemplate() {
		 JdbcTemplate jdbcTemplate=new JdbcTemplate();
		 jdbcTemplate.setDataSource(getDataSource());
		 return jdbcTemplate;
	}
	
	@Bean(name = {"studentDao"})
	public StudentDao getStudentDao() {
		StudentDaoimpl studentDao=new StudentDaoimpl();
		studentDao.setJdbcTemplate(getTemplate());
		return studentDao;
	}
}
