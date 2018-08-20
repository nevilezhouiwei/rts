/**  
* @Title: JDBCTest.java
* @Package com.nevile.rts.java.jdbc
* @Description: TODO
* @author Nevile  
* @date 2018年5月25日 下午9:58:23
* @version V1.0  
*/
package com.nevile.rts.java.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import com.nevile.rts.java.utils.PagingUtil;

/**
* @author Nevile QQ1102739617
* @version 创建时间：2018年5月25日 下午9:58:23
* 
*/
/**
 * ClassName: JDBCTest
 * 
 * @Description: JDBC测试
 */
public class JDBCTest {
	@Test
	public void test1() {
		Connection conn = JdbcUtil.getConnection();
		try {
			Statement cs = conn.createStatement();
			String sql = "select * from t_student";
			ResultSet rs = cs.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getInt("id") + "," + rs.getString(1) + ";" + rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

@Test
	public void test2() {

		Connection conn = JdbcUtil.getConnection();
		int totalRows = 0;
		try {
			Statement cs = conn.createStatement();
			String sql = "select count(*) from t_student";
			ResultSet rs = cs.executeQuery(sql);
			rs.next();
			totalRows = rs.getInt(1);
			cs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		PagingUtil pagingUtil = new PagingUtil(totalRows, 3);
		String sql = "SELECT * FROM T_STUDENT LIMIT ?,?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			for(int i =0;i<=6;i++) {
				ps.setInt(1, pagingUtil.startRow());
				ps.setInt(2, pagingUtil.getSize());
				ResultSet executeQuery = ps.executeQuery();
				while (executeQuery.next()) {
					System.out.println(
							executeQuery.getInt("id") + "," + executeQuery.getString(1) + ";" + executeQuery.getString(2));
				}
				System.out.println("第"+pagingUtil.getPageNum()+"页");
				pagingUtil.getNext();
				
			}
			
			JdbcUtil.close(conn, ps);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
