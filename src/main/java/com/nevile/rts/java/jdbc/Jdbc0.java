/**  
* @Title: Jdbc0.java
* @Package com.nevile.rts.java.jdbc
* @Description: TODO
* @author Nevile  
* @date 2018年5月22日 下午10:02:21
* @version V1.0  
*/
package com.nevile.rts.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * ClassName: Jdbc0
 * 
 * @Description: 原生jdbc的使用
 */
public class Jdbc0 {
	public static void main(String[] args) {
		// 1.创建jdbc 连接信息
		String URL = "jdbc:mysql://localhost:3306/rts";
		String name = "root";
		String password = "abc123";
		String driver = "com.mysql.jdbc.Driver";

		Connection conn = null;
		Statement cs = null;

		// 2.注册原生jdbc 的驱动信息
		try {
			// 注册驱动，机制是什么？
			Class.forName(driver);
			// 3.获得jdbc 的连接
			conn = DriverManager.getConnection(URL, name, password);
			// 连接中获得执行静态代码对象
			cs = conn.createStatement();
			// 静态sql 代码
			String sql = "insert into t_student(name,sex,birthday,entrance_school) values('java','male','2018-02-01','2019-01-05')";
			int executeUpdate = cs.executeUpdate(sql);
			System.out.println("插入影响" + executeUpdate + "条");
			sql = "select * from t_student";
			ResultSet executeQuery = cs.executeQuery(sql);
			while (executeQuery.next()) {
				System.out.println(
						executeQuery.getInt("id") + "," + executeQuery.getString(1) + ";" + executeQuery.getString(2));
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (cs != null) {
				try {
					cs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
