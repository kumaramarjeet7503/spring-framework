package com.core;

public class Student {
	private int StudentId ;
	private String Address ;
	private String Section ;
	private Address StudentAddress ;

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

	public Student(int studentId, String address, String section, com.core.Address studentAddress) {
		super();
		StudentId = studentId;
		Address = address;
		Section = section;
		StudentAddress = studentAddress;
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
		return StudentId+" "+Address+" "+Section+" "+StudentAddress ;
	}
	public Student(com.core.Address studentAddress) {
		super();
		StudentAddress = studentAddress;
	}
	public Address getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		StudentAddress = studentAddress;
	}
	
}
