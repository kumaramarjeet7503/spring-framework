package com.standalone;
import java.util.* ;

public class Person {

	private List<String> friends ;
	public Person(List<String> friends) {
		super();
		this.friends = friends;
	}
	@Override
	public String toString() {
		return "Person [friends=" + friends + "]";
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Person() {
		
	}

}
