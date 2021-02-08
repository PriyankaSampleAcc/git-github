package com.spring.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.entities.Student;
import com.spring.orm.dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello ..");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/config.xml");
		StudentDao stu = context.getBean("studentDao", StudentDao.class);
		Student s = new Student(444, "Priyankaa", "Pune");
		int r = stu.insert(s);
		System.out.println(" inserted" + r);
	}
}