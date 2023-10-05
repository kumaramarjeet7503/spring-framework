package com.core.wire;

public class Book {

	private String cover ;
	private String picture ;
	private Page page ;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book [cover=" + cover + ", picture=" + picture + ", page=" + page + "]";
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public Book(String cover, String picture, Page page) {
		super();
		this.cover = cover;
		this.picture = picture;
		this.page = page;
	}
	
	

}
