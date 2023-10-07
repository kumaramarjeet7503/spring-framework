package com.core.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunWire {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/core/wire/wireconfig.xml") ;
		Book book = context.getBean(Book.class) ;
		book.setCover("fadslf");
		book.setPicture("alia");
		System.out.println(book);

	}

}
