/**  
* @Title: BookService2Imp.java
* @Package com.nevile.rts.spring.jdbctemplate.transaction
* @Description: TODO
* @author Nevile  
* @date 2018年6月2日 下午5:51:21
* @version V1.0  
*/
package com.nevile.rts.spring.jdbctemplate.transaction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName: BookService2Imp
 * 
 * @Description: TODO
 */
@Service("bookService2")
public class BookService2Imp implements BookService2 {

	@Autowired
	private BookService bookService;

	@Override
	@Transactional
	public void buyManeyBook(int sid, List<String> list, int mount) {
		for (String name : list) {
			bookService.buyBook(sid, name, mount);
		}
	}

}
