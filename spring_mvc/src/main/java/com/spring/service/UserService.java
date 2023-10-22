package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.spring.dao.UserDao;
import com.spring.model.User;

@Service
@Configurable
public class UserService {

	@Autowired
	@Qualifier("userDao")
	private UserDao userDao ;
	
	public int createUser(User user) 
	{
		return this.userDao.saveUser(user) ;
	}
	
	public UserDao getUserDao() {
		return userDao;
	}

	public UserService(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public UserService() {
		// TODO Auto-generated constructor stub
	}

}
