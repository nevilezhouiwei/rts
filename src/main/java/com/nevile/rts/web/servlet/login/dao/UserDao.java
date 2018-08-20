package com.nevile.rts.web.servlet.login.dao;

import com.nevile.rts.web.servlet.login.pojo.User;

public interface UserDao {
	//查找用户信息
	public User findUser(User user);
	//新增(注册)用户
	public void addUser(User user);
	//删除用户
	public void deleteUser(User user);
	//更新用户信息
	public void updateUser(User user);

}
