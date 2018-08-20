/**  
* @Title: BaseDaoImpl.java
* @Package com.nevile.rts.base.aop.anotation.dao.impl
* @Description: TODO
* @author Nevile  
* @date 2018年4月23日 下午10:16:51
* @version V1.0  
*/ 
package com.nevile.rts.spring.aop.anotation.dao.impl;

import com.nevile.rts.spring.aop.anotation.dao.BaseDao;

/**
 * ClassName: BaseDaoImpl
 * @Description: TODO
 */
public class BaseDaoImpl<T> implements BaseDao<T> {

	/* (non-Javadoc)
	 * @see com.nevile.rts.base.aop.anotation.dao.BaseDao#save(java.lang.Object)
	 */
	@Override
	public T save(T t) {
		System.out.println("增加："+t.toString());
		return t;
	}

	/* (non-Javadoc)
	 * @see com.nevile.rts.base.aop.anotation.dao.BaseDao#delet(java.lang.Object)
	 */
	@Override
	public T delet(T t) {
		System.out.println("删除："+t.toString());
		return t;
	}

	/* (non-Javadoc)
	 * @see com.nevile.rts.base.aop.anotation.dao.BaseDao#find(int)
	 */
	@Override
	public T find(int i) {
		return null;
	}

}
