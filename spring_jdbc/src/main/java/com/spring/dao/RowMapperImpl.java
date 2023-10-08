package com.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.entites.Demo;

// For getting data from table implements rowmapper
public class RowMapperImpl implements RowMapper<Demo> {

	public RowMapperImpl() {
	
	}

	public Demo mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Demo demo = new Demo() ;
		demo.setName(rs.getString("name")) ;
		demo.setAddress(rs.getString("address"));
		demo.setSection(rs.getString("section"));
		
		return demo;
	}

}
