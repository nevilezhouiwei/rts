package com.nevile.rts.web.servlet.register.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.nevile.rts.java.jdbc.JdbcUtil;
import com.nevile.rts.web.servlet.register.dao.RegisterDao;
import com.nevile.rts.web.servlet.register.pojo.Register;

public class RegisterDaoImplDB implements RegisterDao {

	@Override
	public boolean save(Register register) {
		// TODO Auto-generated method stub
		Connection conn = JdbcUtil.getConnection();
		Statement cs = null;
		boolean flag = false;
		try {
			String sql = "insert into t_sys_user values ("
		+"\'"+register.getId()+"\',"
		+"\'"+register.getUserName()+"\',"
		+"\'"+register.getBirthday()+"\',"
		+"\'"+register.getPassword()+"\',"
		+"\'"+register.getCerIDno()+"\',"
		+"\'"+register.getAddress()+"\'"
		+")";
			 cs = conn.createStatement();
			int i = cs.executeUpdate(sql);
			flag = (i==1);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn, cs);		}
		return flag;
	}

	@Override
	public boolean exists(Register register) {
		Connection conn = JdbcUtil.getConnection();
		Statement cs = null;
		boolean flag = false;
		try {
			String sql = "select * from t_sys_user where user_name = \'"
					+register.getUserName()+ "\'";
			cs = conn.createStatement();
			ResultSet eq = cs.executeQuery(sql);
			flag = eq.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn, cs);
		}
		return flag;
	}

}
