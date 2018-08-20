/**  
* @Title: IocTest.java
* @Package com.nevile.rts.base.logs.service
* @Description: TODO
* @author Nevile  
* @date 2018年4月2日 下午7:28:39
* @version V1.0  
*/
package com.nevile.rts.spring.ioc.service;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nevile.rts.spring.ioc.pojo.Address;
import com.nevile.rts.spring.ioc.pojo.Student;

/**
 * ClassName: IocTest
 * 
 * @Description: spring 的IOC 依赖注入测试类
 */
public class IocTest {
	@Test
	public void test() {
		//按照文件路径找到 ioc 配置文件地址
		ApplicationContext ctx = new FileSystemXmlApplicationContext("/src/main/resources/springconf/spring.xml");

		Student student = (Student) ctx.getBean("student");
		Address address = (Address) ctx.getBean("address");
		student.setName("汤姆");
		Calendar calendar=Calendar.getInstance();
		calendar.set(1990, 1, 2);
	    Date birthday=calendar.getTime();//birthday就是你需要的时间
		student.setBirthday(birthday);
		Date date = new Date();
		student.setEntranceSchool(date);
		student.setSex("男");
		address.setAddressName("武汉市");
		
		System.out.println(student.toString());
	}

}
