package com.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Bulb {

	@Value("led")
	private String type ;
	private String operated ;
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
