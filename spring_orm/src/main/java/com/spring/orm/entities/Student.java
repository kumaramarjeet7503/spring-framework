package com.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

// Hibernate for making it as entity to communicate with database
@Entity
@Table(name="student")
public class Student {

	@javax.persistence.Id
	private int Id ;
	
	@Column(name="Course")
	private String Course ;
	@Column(name="Duration")
	private double Duration ;
	@Column(name="City")
	private String City ;
	@Column(name="Name")
	private String Name ;
	

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public double getDuration() {
		return Duration;
	}

	public void setDuration(double duration) {
		Duration = duration;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Student(int id) {
		super();
		Id = id;
	}

	public Student(String course, double duration, String city, String name) {
		super();
		Course = course;
		Duration = duration;
		City = city;
		Name = name;
	}

	public Student() {
		
	}

}
