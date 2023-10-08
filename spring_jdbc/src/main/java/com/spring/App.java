package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.dao.StudentDao;
import com.spring.entites.Demo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbcconfig.xml") ;
//		Get jdbc template from bean
//		JdbcTemplate template =  context.getBean("jdbcTemplate",JdbcTemplate.class) ;
		
//		 Get demo dao via bean
		StudentDao demoDao = context.getBean("demoDao",StudentDao.class) ;
		
		Demo demo = new Demo(2,"Karishma","Mohan garden","A") ;
		
//		int studentSaved =  demoDao.insert(demo) ;
		int studentSaved =  demoDao.modify(demo) ;
		System.out.println(studentSaved);
		
    }
}
