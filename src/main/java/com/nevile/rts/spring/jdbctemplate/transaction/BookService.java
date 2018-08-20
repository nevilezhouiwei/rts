/**  
* @Title: Service.java
* @Package com.nevile.rts.spring.jdbctemplate.trasaction
* @Description: TODO
* @author Nevile  
* @date 2018年5月26日 下午10:39:03
* @version V1.0  
*/
package com.nevile.rts.spring.jdbctemplate.transaction;

public interface BookService {

	public void buyBook(int sid, String bookName, int mount) throws InsufficientAccountException;

	//public void buyManeyBook(int sid, List<String> list, int mount);

}
