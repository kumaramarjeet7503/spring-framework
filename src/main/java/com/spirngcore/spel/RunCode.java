package com.spirngcore.spel;

import org.springframework.expression.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class RunCode {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/spirngcore/spel/spelconfig.xml") ;
		Bowl bowl   = context.getBean("fishbowl",Bowl.class) ;
		System.out.println(bowl);
		
//		Enable spring expression language 
		SpelExpressionParser  parser = new  SpelExpressionParser() ;
		Expression expression = parser.parseExpression("1+2") ;
		System.out.println(expression.getValue());
		
	}

}
