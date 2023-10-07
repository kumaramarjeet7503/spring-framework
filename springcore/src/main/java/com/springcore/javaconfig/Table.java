package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

//@Component
public class Table {
	
	private Leg leg ;

	public Leg getLeg() {
		return leg;
	}

	public void setLeg(Leg leg) {
		this.leg = leg;
	}

	public void getTable() 
	{
		this.leg.display();
		System.out.println("Hi i am table");
	}
	
	public Table(Leg leg) {
//		 Dependency injection
		this.leg = leg ;
		// TODO Auto-generated constructor stub
	}

}
