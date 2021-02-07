package com.spring.jdbc.springjdbc;

import org.springframework.context.ApplicationContext;
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
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/springjdbc/config.xml");
		StudentDao stu = context.getBean("studentDao", StudentDao.class);
		Student s = new Student();
		// s.setId(1234);
		// s.setCity("Nagpurr");
		// s.setName("PBB");
		// int r = stu.change(s);
		// delete
		int r = stu.delete(1234);
		System.out.println(r + " rows deleted");
	}
}
