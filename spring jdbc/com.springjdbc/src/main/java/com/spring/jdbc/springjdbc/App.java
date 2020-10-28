package com.spring.jdbc.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Started ....");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/springjdbc/config.xml");
		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		System.out.println("******");
		// insert query
		 String query = "insert into student(id,name,city) values(?,?,?)";
		
		 // fire query
		 int result = template.update(query, 1231, "Kumar", "pune");
		 System.out.println("No.of record inserted " + result);
	}
}
