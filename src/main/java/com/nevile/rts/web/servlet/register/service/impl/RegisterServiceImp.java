package com.nevile.rts.web.servlet.register.service.impl;

import org.apache.commons.lang3.StringUtils;

import com.nevile.rts.web.servlet.register.dao.RegisterDao;
import com.nevile.rts.web.servlet.register.dao.impl.RegisterDaoImplDB;
import com.nevile.rts.web.servlet.register.pojo.Register;
import com.nevile.rts.web.servlet.register.service.RegisterService;

public class RegisterServiceImp implements RegisterService {
	RegisterDao registerDao = new RegisterDaoImplDB();

	@Override
	public boolean savaRegister(Register register) {
		// TODO Auto-generated method stub
		if(existRegister(register)) {
			return false;

		}
		return registerDao.save(register);
		
	}

	@Override
	public boolean existRegister(Register register) {
		// TODO Auto-generated method stub
			return StringUtils.isBlank(register.getUserName())?true:registerDao.exists(register);
	}

}
