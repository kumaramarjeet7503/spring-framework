package com.spring.orm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate ;

	public int insert(Student student) 
	{
		Integer impactedRow = (Integer) hibernateTemplate.save(student) ;
		return impactedRow ;
	}
	
	
	
	public StudentDao() {
		// TODO Auto-generated constructor stub
	}

}
