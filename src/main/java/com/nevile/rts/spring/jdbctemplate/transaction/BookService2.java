/**  
* @Title: BookService2.java
* @Package com.nevile.rts.spring.jdbctemplate.transaction
* @Description: TODO
* @author Nevile  
* @date 2018年6月2日 下午5:50:15
* @version V1.0  
*/ 
package com.nevile.rts.spring.jdbctemplate.transaction;

import java.util.List;

/**
 * ClassName: BookService2
 * @Description: TODO
 */
public interface BookService2 {
	public void buyManeyBook(int sid,List<String> list,int mount) ;
}
