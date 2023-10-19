package com.spring.orm.dao;

import java.util.List;

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


//	 Insert data into data table with hibernate template
	@Transactional
	public int insert(Student student) 
	{
		Integer impactedRow = (Integer) hibernateTemplate.save(student) ;
		return impactedRow ;
	}
	
//	 Get student data from data table
	public Student getStudent(int studentId) 
	{
		Student student = this.hibernateTemplate.get(Student.class,studentId) ;
		return student ;
	}

	// Get list of students from database	
	public List<Student> getAllStudent() 
	{
		List<Student> students = this.hibernateTemplate.loadAll(Student.class) ;
		return students ;
	}
	
//	delete students from table
	public void  delete(int studentId) 
	{
		Student student = this.hibernateTemplate.get(Student.class,studentId) ;
		 this.hibernateTemplate.delete(student) ;
	}
	
//	update data in database
//	@Transactional to resolve the issue [ Write operations are not allowed in read-only mode ]
	@Transactional
	public void update(Student student) 
	{
		 this.hibernateTemplate.update(student);
	}
	
	public StudentDao() {
		// TODO Auto-generated constructor stub
	}

}
