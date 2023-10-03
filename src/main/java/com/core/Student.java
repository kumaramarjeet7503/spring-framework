package com.core;

public class Student {
	private int StudentId ;

	private String Address ;
	private String Section ;
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}

	public Student(int studentId, String address, String section) {
		super();
		StudentId = studentId;
		Address = address;
		Section = section;
	}
	public String getSection() {
		return Section;
	}
	public void setSection(String section) {
		Section = section;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return StudentId+" "+Address+" "+Section ;
	}
	
}
