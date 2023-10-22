package com.spring.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.spring.model.*;

@Repository
public class UserDao {

   @Autowired
   @Qualifier("hTemplate")
   private HibernateTemplate hibernateTemplate ;
	
   public HibernateTemplate getHibernateTemplate() {
	return hibernateTemplate;
}
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int saveUser(User user) 
	{
		int id = (Integer) this.hibernateTemplate.save(user) ;
		return id ;
	}
	
	public UserDao() {
		// TODO Auto-generated constructor stub
	}

}
