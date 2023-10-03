package com.core.collections;
import java.util.*;

public class Employee {

	private String Name ;
	private List<String> Phones ;
	private Set<String> Address ;
	private Map<String,String> courses ;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<String> getPhones() {
		return Phones;
	}

	public void setPhones(List<String> phones) {
		Phones = phones;
	}

	public Set<String> getAddress() {
		return Address;
	}

	public void setAddress(Set<String> address) {
		Address = address;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}


	
	public Employee() {
		
	}
	
	public Employee(String name, List<String> phones, Set<String> address, Map<String, String> courses) {
		super();
		Name = name;
		Phones = phones;
		Address = address;
		this.courses = courses;
	}

}
