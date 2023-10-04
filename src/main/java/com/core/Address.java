package com.core;

public class Address {

	private String PinCode ;
	private String City ;
	private String Street ;
	
	
	public String getPinCode() {
		return PinCode;
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
		return "Address [PinCode=" + PinCode + ", City=" + City + ", Street=" + Street + "]";
	}


	public Address() {
		
	}

}
