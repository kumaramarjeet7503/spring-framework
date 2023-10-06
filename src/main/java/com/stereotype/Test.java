package com.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/stereotype/stereotypeconfig.xml") ;
		Bulb bulb =  context.getBean("bulb",Bulb.class) ;
		System.out.println(bulb);

	}

}
