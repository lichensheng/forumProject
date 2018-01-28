package com.lcs.forume.daoImp;

import javax.annotation.Resource;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.lcs.forume.dao.UserDao;
import com.lcs.forume.domain.User;
@Repository("userDao")
public class UserDaoImp extends BaseDao implements UserDao {
	
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(user);
	}


}
