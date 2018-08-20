/**  
* @Title: Test.java
* @Package com.nevile.rts.spring.jdbctemplate.trasaction
* @Description: TODO
* @author Nevile  
* @date 2018年5月26日 下午10:39:18
* @version V1.0  
*/
package com.nevile.rts.spring.jdbctemplate.transaction;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @author Nevile QQ1102739617
* @version 创建时间：2018年5月26日 下午10:39:18
* 
*/
/**
 * ClassName: Test
 * 
 * @Description: 执行模拟spring 声明式事务操作
 */
public class TransactionTest {
	private ApplicationContext context = null;
	private BookService bookService = null;
	private BookService2 bookService2 = null;

	{
		context = new ClassPathXmlApplicationContext("applicatonContext-aop-anotation.xml");
		bookService = context.getBean(BookService.class);
		bookService2 = context.getBean(BookService2.class);
	}

/**
* @Description: jdbcTemplate 模拟账户买书 ，并添加事务。
* @Title: buybook 
* void
 */
	
	//程序报错：
	//1、java.lang.NoClassDefFoundError ; nested exception is java.lang.NoClassDefFoundError: org/springframework/context/event/EventListenerFactory
	//原因：pom 文件中依赖重复，版本冲突等
	//2、执行事务不成功
	//原因：spring 声明式事务默认只对运行时异常进行事务管理，其他类型异常需要配置.在编写异常类时编写继承的Exception
	@Test
	public void buybook() {
			bookService.buyBook(3, "Java", 2);
		}
	
	//程序问题：
	//1、buyManeyBook方法调用buyBook方法时，这两个方法在一个类中，导致使用REQUIRES_NEW事务传播失败。具体问题是因为spring 的AOP特性导致的。
	//还可以
	@Test
	public void buyManeyBook() {
		bookService2.buyManeyBook(3, Arrays.asList("Java","JavaScript"), 1);
	}
	}
	
	

