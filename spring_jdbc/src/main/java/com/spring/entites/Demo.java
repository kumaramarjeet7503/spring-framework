package com.spring.entites;

public class Demo {

	private String name ;
	private int id ;
	private String address ;
	private String section ;
	
	
	public String getName() {
		return name;
	}

	public Demo(int id ,String name, String address, String section) {
		super();
		this.name = name;
		this.id = id ;
		this.address = address;
		this.section = section;
	}


	public Demo(String name, String address, String section) {
		super();
		this.name = name;
		this.address = address;
		this.section = section;
	}
	
	public Demo(int id ) {
		super();
		this.id = id ;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Demo [name=" + name + ", id=" + id + ", address=" + address + ", section=" + section + "]";
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getSection() {
		return section;
	}


	public void setSection(String section) {
		this.section = section;
	}


	public Demo() {
		
	}

}
