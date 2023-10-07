package com.springcore.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


// Create new config file via java configuration, it is in replace of xml file 
@Configuration
// This helps scan base package where the class is located for bean creation
@ComponentScan(basePackages="com.springcore.javaconfig")
public class JavaConfig {

}
