package com.nevile.rts.web.servlet.register.service;

import com.nevile.rts.web.servlet.register.pojo.Register;

public interface RegisterService {
	//保存注册人信息
	public boolean savaRegister(Register register);
	//验证是否注册过
	public boolean existRegister(Register register);

}
