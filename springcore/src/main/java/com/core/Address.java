package com.core;

import java.util.List;

public class Address {

	private String PinCode ;
	private String City ;
	private String Street ;
	private List<String> Names ;
	
	
	public String getPinCode() {
		return PinCode;
	}


	public List<String> getNames() {
		return Names;
	}


	public void setNames(List<String> names) {
		Names = names;
	}


	public Address(String pinCode, String city, String street, List<String> names) {
		super();
		PinCode = pinCode;
		City = city;
		Street = street;
		Names = names;
	}


	public void setPinCode(String pinCode) {
		PinCode = pinCode;
	}


	public String getCity() {
		return City;
	}


	public void setCity(String city) {
		City = city;
	}


	public String getStreet() {
		return Street;
	}


	public void setStreet(String street) {
		Street = street;
	}

	

	public Address(String pinCode, String city, String street) {
		super();
		PinCode = pinCode;
		City = city;
		Street = street;
	}


	@Override
	public String toString() {
		return "Address [PinCode=" + PinCode + ", City=" + City + ", Street=" + Street + ", Names=" + Names + "]";
	}


	public Address() {
		
	}
	
	public void init() 
	{
		System.out.println("Initialization has been started");
	}

}
