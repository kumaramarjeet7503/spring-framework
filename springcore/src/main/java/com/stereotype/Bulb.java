package com.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// For creating spring bean class via annotation
@Component

// @Scopr annotation with prototype will create always new object whenever called 
@Scope("prototype")
public class Bulb {

//	 Set value of the property
	@Value("led")
	private String type ;
	private String operated ;
	
//	 Get value of list from config which was using util-list
	@Value("#{lights}")
	private List<String> lights ;
	
	
	public List<String> getLights() {
		return lights;
	}


	public void setLights(List<String> lights) {
		this.lights = lights;
	}


	public String getType() {
		return type;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "type = "+type+" operated = "+operated+" lights"+lights;
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
