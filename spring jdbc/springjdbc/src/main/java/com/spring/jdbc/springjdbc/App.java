package com.spring.jdbc.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.entities.Student;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello ..");
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentDaoImpl stu = context.getBean("sd", StudentDaoImpl.class);
		List<Student> s = stu.getAllStudents();
		for (Student student : s) {
			System.out.println(student);
		}
	}
}
