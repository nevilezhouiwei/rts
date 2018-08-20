/**  
* @Title: Dao.java
* @Package com.nevile.rts.spring.jdbctemplate.trasaction
* @Description: TODO
* @author Nevile  
* @date 2018年5月26日 下午10:38:36
* @version V1.0  
*/
package com.nevile.rts.spring.jdbctemplate.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
* @author Nevile QQ1102739617
* @version 创建时间：2018年5月26日 下午10:38:36
* 
*/

@Repository(value="dao")
public class DaoImp implements Dao {
	@Autowired
	private JdbcTemplate jdbcTemplate ;

	public BookInfor findBook(String bookName) {
		String sql = "SELECT * FROM BOOK_INFOR WHERE NAME=?";
		// 表和bean 映射
		RowMapper<BookInfor> rowMapper = new BeanPropertyRowMapper<>(BookInfor.class);
		BookInfor bookInfor = jdbcTemplate.queryForObject(sql, rowMapper, bookName);
		return bookInfor;
	}

	public void updateBook(int bookId,int mount) {
		String sql = "UPDATE BOOK_INFOR SET STORAGE = STORAGE - ? WHERE ID=?";
		jdbcTemplate.update(sql,mount,bookId);
	}

	public Account findAccount(int sid) {
		String sql = "SELECT * FROM ACCOUNT WHERE SID=?";
		RowMapper<Account> rowMapper = new BeanPropertyRowMapper<>(Account.class);
		Account account = jdbcTemplate.queryForObject(sql, rowMapper, sid);
		return account;
	}
	
	public void updateAccount(int account,int sid) {
		String sql = "UPDATE ACCOUNT SET MONEY = MONEY-? WHERE SID = ?";
		jdbcTemplate.update(sql, account,sid);
	}

}
