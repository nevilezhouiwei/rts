/**  
* @Title: BookServiceImp.java
* @Package com.nevile.rts.spring.jdbctemplate.transaction
* @Description: TODO
* @author Nevile  
* @date 2018年5月27日 上午10:59:56
* @version V1.0  
*/
package com.nevile.rts.spring.jdbctemplate.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName: BookServiceImp
 * 
 * @Description: TODO
 */
@Service(value = "bookService")
public class BookServiceImp implements BookService {
	@Autowired
	private Dao dao;

	/**
	 * spring 声明式事务默认对非检查型异常进行回滚。对检查型异常不回滚。可以配置事务对检查和非检查类型的回滚。
	 */
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void buyBook(int sid, String bookName, int mount) {
		BookInfor book = dao.findBook(bookName);
		Account account = dao.findAccount(sid);
		dao.updateBook(book.getId(), mount);

		int amount = book.getPrice() * mount;
		if (account.getMoney() < amount) {
			throw new InsufficientAccountException(Integer.toString(sid), account.getMoney());
		} else {
			dao.updateAccount(amount, account.getSid());

		}

	}

}
