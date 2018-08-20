/**  
* @Title: StudentUtils.java
* @Package com.nevile.rts.base.aop.anotation.service
* @Description: TODO
* @author Nevile  
* @date 2018年4月24日 下午10:41:11
* @version V1.0  
*/
package com.nevile.rts.spring.aop.anotation.service;

import org.springframework.stereotype.Component;

/**
 * ClassName: StudentUtils
 * 
 * @Description: TODO
 */
@Component
public class StudentUtils {

	public Student addId(Student student) {
		student.setId(student.getId()+1);
		return student;
	}

}
