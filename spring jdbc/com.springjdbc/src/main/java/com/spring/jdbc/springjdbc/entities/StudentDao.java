package com.spring.jdbc.springjdbc.entities;

import java.util.List;

import com.spring.jdbc.springjdbc.Student;

public interface StudentDao {
	public int insert(Student student);

	public int change(Student student);

	public int delete(Student student);

	public Student getStudent(int studentId);

	public List<Student> getAllElements();
}
