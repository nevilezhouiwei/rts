package com.nevile.rts.web.servlet.login.service.impl;

import com.nevile.rts.web.servlet.login.dao.UserDao;
import com.nevile.rts.web.servlet.login.dao.impl.UserDaoDBImpl;
import com.nevile.rts.web.servlet.login.pojo.User;
import com.nevile.rts.web.servlet.login.service.UserService;

public class UserServiceDBImpl implements UserService {
	UserDao userDao = new UserDaoDBImpl();

	@Override
	public boolean isInvalidUserName(User user) {
		User findUser = userDao.findUser(user);
		return (findUser == null) ? true : false;
	}

	@Override
	public User chekLogin(User user) {
		User findUser = userDao.findUser(user);
		if (findUser != null) {
			return findUser;
		}
		return null;
	}

	@Override
	public void registerUser(User user) {
		userDao.addUser(user);
	}

	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	@Override
	public void lockUser(User user) {
		userDao.deleteUser(user);
	}

}
