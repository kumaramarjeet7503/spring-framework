package com.spring.dao;

import com.spring.entites.Demo;

//  Interface created for dao implementation
public interface StudentDao {
	public int insert(Demo demo) ;
	public int modify(Demo demo) ;
	public int delete(Demo demo) ;
	public Demo select(Demo demo) ;
}
