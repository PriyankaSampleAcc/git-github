package com.helper;

import org.hibernate.cfg.Configuration;

import com.mysql.cj.xdevapi.SessionFactory;

public class Factory {
	public static SessionFactory factory;

	public static SessionFactory getFactory() {
		if (factory == null) {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.buildSessionFactory();
		}
		return factory;
	}

}