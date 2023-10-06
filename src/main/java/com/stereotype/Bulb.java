package com.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bulb {

	@Value("led")
	private String type ;
	private String operated ;
	
	public String getType() {
		return type;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "type"+type+"operated"+operated;
	}


	public void setType(String type) {
		this.type = type;
	}

	public Bulb(String type, String operated) {
		super();
		this.type = type;
		this.operated = operated;
	}

	public String getOperated() {
		return operated;
	}

	public void setOperated(String operated) {
		this.operated = operated;
	}

	public Bulb() {
		// TODO Auto-generated constructor stub
	}

}
