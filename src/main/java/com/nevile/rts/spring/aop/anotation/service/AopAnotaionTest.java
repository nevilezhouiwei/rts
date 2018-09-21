/**  
* @Title: AopAnotaionTest.java
* @Package com.nevile.rts.base.aop.anotation.service
* @Description: TODO
* @author Nevile  
* @date 2018年4月23日 下午10:30:02
* @version V1.0  
*/ 
package com.nevile.rts.spring.aop.anotation.service;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: AopAnotaionTest
 * @Description: 切面编程测试类
 */
public class AopAnotaionTest {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/springApplicatonContext.xml");
		Student student = context.getBean(Student.class);
		student.setId(1);
		student.setName("rts");
		student.setSex("男");
		StudentDao studentDao = (StudentDao) context.getBean(StudentDao.class);
		studentDao.save(student);
		studentDao.addStudentId(student);
		System.out.println(student.toString());
		DataSource dataSource = (DataSource) context.getBean("dataSource");
		System.out.println(dataSource);
	}
}
