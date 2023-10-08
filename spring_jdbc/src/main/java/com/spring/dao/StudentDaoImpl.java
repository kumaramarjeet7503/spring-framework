package com.spring.dao;

import org.springframework.jdbc.core.JdbcTemplate;
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

}
