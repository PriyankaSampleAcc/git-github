package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Courses;

public interface ICourseService {
	public List<Courses> getCourses();

	public Courses getCourse(long parseLong);

	public Courses addCourse(Courses course);
}
