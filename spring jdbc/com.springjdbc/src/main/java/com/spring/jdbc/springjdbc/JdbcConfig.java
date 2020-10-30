package com.spring.jdbc.springjdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.springjdbc.dao.StudentDaoImpl;
import com.spring.jdbc.springjdbc.entities.StudentDao;

@Configuration
public class JdbcConfig {

	@Bean("ds")
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("admin");
		return ds;
	}

	@Bean
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemp = new JdbcTemplate();
		jdbcTemp.setDataSource(getDataSource());
		return jdbcTemp;
	}

	@Bean("studentDao")
	public StudentDao getStudentDao() {
		StudentDaoImpl student = new StudentDaoImpl();
		student.setJdbcTemplate(getTemplate());
		return student;
	}
}
