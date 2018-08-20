/**  
* @Title: InsufficientAccountException.java
* @Package com.nevile.rts.spring.jdbctemplate.transaction
* @Description: TODO
* @author Nevile  
* @date 2018年5月30日 下午9:22:13
* @version V1.0  
*/ 
package com.nevile.rts.spring.jdbctemplate.transaction;

/**
 * ClassName: InsufficientAccountException
 * @Description: 余额不足异常
 */
public class InsufficientAccountException extends RuntimeException{
	
	public InsufficientAccountException(String meString,int data) {
		System.out.println("用户"+meString+"余额不足，目前余额："+data);
	}

}
