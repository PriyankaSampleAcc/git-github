package com.spring.jdbc.springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.springjdbc.Student;
import com.spring.jdbc.springjdbc.entities.StudentDao;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {
		String query = "insert into student(id,name,city) values(?,?,?)";
		int result = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return result;
	}

	public int change(Student student) {
		String query = "update student set name = ? , city = ? where id = ?";
		int result = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return result;
	}

	public int delete(Student student) {
		String query = "delete from student where id = ? ";
		int result = this.jdbcTemplate.update(query, student.getId());
		return result;
	}

	public Student getStudent(int studentId) {
		// selecting single student data
		RowMapper<Student> rowMapper = new RowMapperImpl();
		String query = "select * from student where id = ?";
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return student ;
	}
}
