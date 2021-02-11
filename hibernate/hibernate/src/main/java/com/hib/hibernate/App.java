package com.hib.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.xdevapi.SessionFactory;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("/com/hib/hibernate/hibernate.cfg.xml");
		org.hibernate.SessionFactory factory = cfg.buildSessionFactory();
		// System.out.println(factory);
		Student st = new Student();
		st.setId(111);
		st.setName("Priyanka");
		st.setCity("Pune");
		Session session = factory.openSession();
		session.save(st);
		Transaction tx = session.beginTransaction();
		tx.commit();
		session.close();
	}
}
