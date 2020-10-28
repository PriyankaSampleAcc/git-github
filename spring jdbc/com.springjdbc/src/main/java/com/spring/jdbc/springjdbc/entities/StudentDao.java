package com.spring.jdbc.springjdbc.entities;

import com.spring.jdbc.springjdbc.Student;

public interface StudentDao {
	public int insert(Student student);
	public int change(Student student);
}
