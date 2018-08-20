package com.nevile.rts.web.servlet.login.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nevile.rts.java.jdbc.JdbcUtil;
import com.nevile.rts.web.servlet.login.dao.UserDao;
import com.nevile.rts.web.servlet.login.pojo.User;

public class UserDaoDBImpl implements UserDao {

	@SuppressWarnings("finally")
	@Override
	public User findUser(User _user) {
		User user = null;
		Connection conn = JdbcUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			String sql = "select * from t_sys_user where user_name=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, _user.getUserName());
			rs = ps.executeQuery();
			user = new User();
			while (rs.next()) {
				user.setId(rs.getString("ID"));
				user.setUserName(rs.getString("USER_NAME"));
				user.setBirthday(rs.getString("BIRTHDAY"));
				user.setCerIDno(rs.getString("CER_ID"));
				user.setAddress(rs.getString("ADDRESS"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, ps, rs);
			return user;
		}
	}

	@Override
	public void addUser(User user) {
		Connection conn = JdbcUtil.getConnection();
		PreparedStatement ps = null;
		String sql = "insert into t_sys_user values (?,?,?,?,?,?,?);";
		try {
			// prepareStatement中已经设置了sql语句，不用在执行中再次添加。
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getId());
			ps.setString(2, user.getUserName());
			ps.setString(3, user.getBirthday());
			ps.setString(4, user.getPassword());
			ps.setString(5, user.getCerIDno());
			ps.setString(6, user.getAddress());
			ps.setString(7, "0");
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, ps);
		}

	}

	@Override
	public void deleteUser(User user) {

		Connection conn = JdbcUtil.getConnection();
		PreparedStatement ps = null;
		String sql = "update t_sys_user set is_de=?  where id=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, "1");
			ps.setString(2, user.getId());
			ps.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, ps);
		}

	}

	@Override
	public void updateUser(User user) {

		Connection conn = JdbcUtil.getConnection();
		PreparedStatement ps = null;
		String sql = "update t_sys_user set user_name=?,birthday=?,password=?cer_id=?,address=?  where id=? and is_de='0'";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getBirthday());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getCerIDno());
			ps.setString(5, user.getAddress());
			ps.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, ps);
		}

	}

}
