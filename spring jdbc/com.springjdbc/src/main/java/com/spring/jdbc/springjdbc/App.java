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
		// this is insert operation
		Student student = new Student();
		student.setId(155);
		student.setName("Vishal");
		student.setCity("JAbalpur");
		int result = studentDao.insert(student);
		System.out.println("Rows inserted " + result);

		// this is update operation
		Student student1 = new Student();
		student1.setId(1231);
		student1.setName("qwert");
		student1.setCity("erty");
		int r = studentDao.change(student);
		System.out.println("Updated rows " + r);

		// this is delete operation
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id to be deleted");
		int id = sc.nextInt();
		Student student2 = new Student();
		student2.setId(id);
		int r1 = studentDao.delete(student2);
		System.err.println("Rows deleted " + r1);
	}
}
