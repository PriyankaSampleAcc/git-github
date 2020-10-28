package com.spring.jdbc.springjdbc;

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
		Student student = new Student();
		student.setId(155);
		student.setName("Vishal");
		student.setCity("JAbalpur");
		int result = studentDao.insert(student);
		System.out.println("Rows inserted " + result);

		Student student1 = new Student();
		student1.setId(1231);
		student1.setName("qwert");
		student1.setCity("erty");
		int r = studentDao.change(student);
		System.out.println("Updated rows " + r);

	}
}
