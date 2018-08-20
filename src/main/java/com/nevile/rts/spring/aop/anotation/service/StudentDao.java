/**  
* @Title: ServiceStudent.java
* @Package com.nevile.rts.base.aop.anotation.service
* @Description: TODO
* @author Nevile  
* @date 2018年4月23日 下午10:26:23
* @version V1.0  
*/
package com.nevile.rts.spring.aop.anotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nevile.rts.spring.aop.anotation.dao.impl.BaseDaoImpl;

/**
 * ClassName: ServiceStudent
 * 
 * @Description: TODO
 */
@Component("aa")
public class StudentDao extends BaseDaoImpl<Student> {
	@Autowired
	public StudentUtils studentUtils;
	

	public Integer getAllStudentsNo() {
		return 5000;
	}
	
	public int addStudentId(Student student) {
		student = studentUtils.addId(student);
		return student.getId();
	}

}
