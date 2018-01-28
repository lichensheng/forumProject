package com.lcs.forume.serviceImp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lcs.forume.dao.UserDao;
import com.lcs.forume.domain.User;
import com.lcs.forume.service.UserService;
@Service("userService")
public class UserServiceImp implements UserService {
	
     private UserDao userDao;
	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}
	public UserDao getUserDao() {
		return userDao;
	}
	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
