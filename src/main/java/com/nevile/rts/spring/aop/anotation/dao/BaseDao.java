/**  
* @Title: BaseDao.java
* @Package com.nevile.rts.base.aop.anotation.dao
* @Description: TODO
* @author Nevile  
* @date 2018年4月23日 下午10:08:35
* @version V1.0  
*/ 
package com.nevile.rts.spring.aop.anotation.dao;

/**
 * ClassName: BaseDao
 * @Description: 底层dao
 */
public interface BaseDao<T> {
	/**
	 * 
	 * @Description: 增加
	 * @throws
	 */
	public T save(T t);
	/**
	 * @Description: 删除 
	 * @throws
	 */
	public T delet(T t);
	/**
	 * @Description: 查找
	 * @throws
	 */
	public T find(int i);
}
