package com.spring.jdbc.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.springjdbc.Student;

public class RowMapperImpl implements RowMapper {

	public Student mapRow(ResultSet rs, int value) throws SQLException {
		Student student = new Student();
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setCity(rs.getString(3));
		return student;
	}

}
