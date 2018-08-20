package com.nevile.rts.web.servlet.login.service;

import com.nevile.rts.web.servlet.login.pojo.User;

public interface UserService {
	//验证用户名是否有效
	public boolean isInvalidUserName(User user);
	
	//用户登录检查，用户名和密码同时吻合，验证用户成功
	public User chekLogin(User user);
	
	//用户注册
	public void registerUser(User user);
	
	//修改用户信息
	public void updateUser(User user);
	
	//锁定用户(逻辑删除用户)
	public void lockUser(User user);

}
