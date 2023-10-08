package com.spring.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.entites.*;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate ;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public StudentDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	public int insert(Demo demo) {
		String query = "insert into demo(name,address,section) values(?,?,?) " ;
		int result = jdbcTemplate.update(query,demo.getName(),demo.getAddress(),demo.getSection()) ;	
		return result;
	}
	
//	For updating record
	public int modify(Demo demo) {
		String query = "update demo set name = ?,address = ? , section = ? where id = ? " ;
		int result = jdbcTemplate.update(query,demo.getName(),demo.getAddress(),demo.getSection(),demo.getId()) ;	
		return result;
	}

	public int delete(Demo demo) {
		String query = "delete from demo where id = ?  " ;
		int result = jdbcTemplate.update(query,demo.getId()) ;	
		return result;
	}

	public Demo select(Demo demo) {
		String query = "select * from demo where id = ? " ;
		RowMapper<Demo> rowMapper = new RowMapperImpl() ;
		
//		 To get data for a single record
		Demo result = jdbcTemplate.queryForObject(query,rowMapper ,demo.getId()) ;	
		return result;
	}

}
