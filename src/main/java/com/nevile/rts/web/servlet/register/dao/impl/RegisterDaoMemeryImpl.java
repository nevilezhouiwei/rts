package com.nevile.rts.web.servlet.register.dao.impl;

import com.nevile.rts.web.servlet.register.dao.RegisterDao;
import com.nevile.rts.web.servlet.register.pojo.Register;

public class RegisterDaoMemeryImpl implements RegisterDao {

	@Override
	public boolean save(Register register) {
		System.out.println("保存："+register);
		return false;

	}

	@Override
	public boolean exists(Register register) {
		return 	register.getUserName().equals("nevile")&&register.getCerIDno().equals("123456");
	}

}
