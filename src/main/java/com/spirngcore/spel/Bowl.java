package com.spirngcore.spel;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// Can change name of bean from here 
@Component("fishbowl")
public class Bowl {

	@Value("2.43 cm")
	public String radius ;
	
	@Value("10 cm³")
	public String volume ;
	
//	 Call java static function via Expression language
	@Value("#{T(java.lang.Math).sqrt(16)}")
	public Double height ;
	
//	 Create new object via  Expression language
	@Value("#{new java.lang.String('Pebbles')}")
	public String item ;
	
	public boolean isActive() {
		return isActive;
	}

//	 Conditional basis addition of value @Expression language
	@Value("#{ 5 > 3 }")
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	private boolean isActive ;
	
	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Value("#{fish}")
	public List<String> fish ;
	
	public List<String> getFish() {
		return fish;
	}

	public void setFish(List<String> fish) {
		this.fish = fish;
	}

	public String getRadius() {
		return radius;
	}

	public Bowl(String radius, String volume) {
		super();
		this.radius = radius;
		this.volume = volume;
	}

	public void setRadius(String radius) {
		this.radius = radius;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public Bowl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bowl [radius=" + radius + ", volume=" + volume + ", height=" + height + ", item=" + item + ", isActive="
				+ isActive + ", fish=" + fish + "]";
	}



}
