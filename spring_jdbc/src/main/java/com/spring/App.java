package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		System.out.println("end");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbcconfig.xml") ;
//		Get jdbc template from bean
		System.out.println(context);
		JdbcTemplate template =  context.getBean("jdbcTemplate",JdbcTemplate.class) ;
		
		String query = "insert into demo(name,address,section) values('amarjeet','abcd test' , 'D') " ;
		int result = template.update(query) ;	
    }
}
