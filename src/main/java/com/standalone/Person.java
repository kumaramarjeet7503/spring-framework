package com.standalone;
import java.util.* ;

public class Person {

	private List<String> friends ;
	private Map<String,Integer> fees ;
	private Properties conn ;
	
	public Person(List<String> friends) {
		super();
		this.friends = friends;
	}

	public Map<String, Integer> getFees() {
		return fees;
	}

	public void setFees(Map<String, Integer> fees) {
		this.fees = fees;
	}

	public Properties getConn() {
		return conn;
	}

	public void setConn(Properties conn) {
		this.conn = conn;
	}

	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Person() {
		
	}
	
	@Override
	public String toString() {
		return "Person [friends=" + friends + "] fees="+fees+"]"+"conn=["+conn;
	}

}
