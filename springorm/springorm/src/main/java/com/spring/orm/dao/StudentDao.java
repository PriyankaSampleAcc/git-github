package com.spring.orm.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.entities.Student;

public class StudentDao {
	// @Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int insert(Student student) {
		Integer r = (Integer) this.hibernateTemplate.save(student);
		return r;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
