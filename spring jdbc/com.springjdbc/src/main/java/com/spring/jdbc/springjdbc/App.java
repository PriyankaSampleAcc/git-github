package com.spring.jdbc.springjdbc;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.springjdbc.entities.StudentDao;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Started ....");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/springjdbc/config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		Student student = studentDao.getStudent(123);
		System.out.println(student);
	}
}
