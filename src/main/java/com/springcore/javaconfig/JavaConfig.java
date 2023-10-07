package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


// Create new config file via java configuration, it is in replace of xml file 
@Configuration
// This helps scan base package where the class is located for bean creation
//@ComponentScan(basePackages="com.springcore.javaconfig")
public class JavaConfig {
	
//	 If not wanted to use component scan can follow this one also
//	 In order to make a bean annotate with @Bean
//	 Change the name of table with name 
	@Bean(name="table")
	public Table getTable() 
	{
		Table table = new Table(getLegs()) ;
		return  table ;
	}
	
	@Bean
	public Leg getLegs() 
	{
		Leg leg = new Leg() ;
		return leg ;
	}
}
