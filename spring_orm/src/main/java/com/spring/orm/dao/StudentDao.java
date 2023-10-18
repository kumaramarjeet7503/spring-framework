package com.spring.orm.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {

//	This helps in saving or retrieval of data in spring
	private HibernateTemplate hibernateTemplate ;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}



	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	@Transactional
	public int insert(Student student) 
	{
		Integer impactedRow = (Integer) hibernateTemplate.save(student) ;
		return impactedRow ;
	}
	
	
	
	public StudentDao() {
		// TODO Auto-generated constructor stub
	}

}
