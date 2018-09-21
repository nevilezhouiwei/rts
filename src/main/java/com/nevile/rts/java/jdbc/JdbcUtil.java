/**  
* @Title: JdbcUtil.java
* @Package com.nevile.rts.java.jdbc
* @Description: TODO
* @author Nevile  
* @date 2018年5月23日 下午2:53:13
* @version V1.0  
*/
package com.nevile.rts.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * ClassName: JdbcUtil
 * 
 * @Description: 原生JDBC工具类
 */
/**
 * ClassName: JdbcUtil
 * 
 * @Description: TODO
 */
public class JdbcUtil {
	private static String URL = "jdbc:mysql://localhost:3306/rts";
	private static String name = "root";
	private static String password = "abc123";
	private static String driver = "com.mysql.jdbc.Driver";

	/**
	 * 注册驱动
	 */
	static {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("注册驱动失败！");

		}
	}

	/**
	 * @Description: 获得数据库连接 @throws
	 */
	public static Connection getConnection() {
		try {
			Connection connection = DriverManager.getConnection(URL, name, password);
			return connection;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("无法获得数据库连接!");
		}
		return null;
	}

	/**
	 * @Description: 释放资源,Statement接口类还派生出两个接口类PreparedStatement和CallableStatement。 
	 * @Title: close 同时关闭执行对象Statement和连接Connection，后创建先关闭。
	 * @param connection连接接口
	 * @param statement 执行接口
	 * @return void
	 */
	public static void close(Connection connection,Statement statement,ResultSet resultSet) {
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("关闭ResultSer执行对象失败！");
			}
		}
		
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("关闭Statement执行对象失败！");
			}
		}
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("连接Connection关闭失败！");
			}
		}
	}
	
	
	public static void close(Connection connection,Statement statement) {

		
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("关闭Statement执行对象失败！");
			}
		}
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("连接Connection关闭失败！");
			}
		}
	}
}