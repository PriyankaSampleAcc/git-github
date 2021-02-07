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
		System.out.println("Hello ..");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/springjdbc/config.xml");
		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		// insert
		String query = "insert into Student(id,name,city)values(?,?,?)";

		// fire query
		int result = template.update(query, 122, "Uttam kumar", "Kanpur");
		System.out.println("Number of records inserted:" + result);
	}
}
