/**  
* @Title: DaoImp.java
* @Package com.nevile.rts.spring.jdbctemplate.transaction
* @Description: TODO
* @author Nevile  
* @date 2018年5月27日 上午10:16:53
* @version V1.0  
*/
package com.nevile.rts.spring.jdbctemplate.transaction;

/**
 * ClassName: DaoImp
 * 
 * @Description: TODO
 */
public interface Dao {

	public BookInfor findBook(String bookName);

	public void updateBook(int bookId,int mount);

	public Account findAccount(int sid);

	public void updateAccount(int account,int sid);

}
