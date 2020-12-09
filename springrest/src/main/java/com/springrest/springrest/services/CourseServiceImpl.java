package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Courses;

@Service
public class CourseServiceImpl implements ICourseService {

	List<Courses> list;

	public CourseServiceImpl() {
		list = new ArrayList();
		list.add(new Courses(123, "Java core course", "This is first course"));
		list.add(new Courses(143, "Spring boot course", "This is second"));
	}

	public List<Courses> getCourses() {
		return list;
	}

	public Courses getCourse(long courseId) {
		Courses c = null;
		for (Courses course : list) {
			if (course.getId() == courseId) {
				c = course;
				break;
			}
		}
		return c;
	}

	public Courses addCourse(Courses course) {
		list.add(course);
		return course;
	}
}
