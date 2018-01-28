package com.lcs.forume.daoImp;

import javax.annotation.Resource;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class BaseDao<T>{
	private HibernateTemplate hibernateTemplate;
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public BaseDao(){
		
	}
}
