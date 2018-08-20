package com.nevile.rts.web.servlet.register.dao;

import com.nevile.rts.web.servlet.register.pojo.Register;

public interface RegisterDao {
	//用户注册保存
	public boolean save(Register register);
	
	//查找实名已经注册的用户
	public boolean exists(Register register);
}
