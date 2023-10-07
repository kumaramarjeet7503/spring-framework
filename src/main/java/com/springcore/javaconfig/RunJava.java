package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 Used Annotation config to use pure java class for configuration 
		ApplicationContext context  = new AnnotationConfigApplicationContext(JavaConfig.class) ;
		Table table = (Table) context.getBean("table") ;
		
		table.getTable();

	}

}
