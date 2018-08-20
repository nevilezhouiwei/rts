/**  
* @Title: JdbcTempCUID.java
* @Package com.nevile.rts.spring.jdbctemplate.cuid
* @Description: TODO
* @author Nevile  
* @date 2018年5月20日 下午4:16:39
* @version V1.0  
*/
package com.nevile.rts.spring.jdbctemplate.crud;

import java.util.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * ClassName: CRUD
 * 
 * @Description: JdbcTemplate CRUD 操作
 */
public class CRUD {
	/**
	 * @Description: 单条记录的CRUD 操作 @throws
	 */
	@Test
	public void test1() {
		ApplicationContext aContext = new ClassPathXmlApplicationContext("applicatonContext-aop-anotation.xml");
		JdbcTemplate template = (JdbcTemplate) aContext.getBean("jdbcTemplate");
		// 添加数据 student
		String sql = "insert into t_student (name,sex,birthday,entrance_school)  values(?,?,?,?)";
		Date date = new Date();
		int insert = template.update(sql, "Mexi", "male", date, date);
		System.out.println("insert返回:" + insert);

		sql = "update t_student set sex=? where name = ?;";
		int update = template.update(sql, "male", "tom");
		System.out.println("update返回值:" + update);

		sql = "delete from t_student where name=?";
		int delete = template.update(sql, "Mexi");
		System.out.println("delete:" + delete);
	}



}
