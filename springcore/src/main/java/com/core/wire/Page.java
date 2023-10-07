package com.core.wire;

public class Page {
	private String length ;
	private String width ;
	
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public Page(String length, String width) {
		super();
		this.length = length;
		this.width = width;
	}
	public Page() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return length+" "+width;
	}
	
}
