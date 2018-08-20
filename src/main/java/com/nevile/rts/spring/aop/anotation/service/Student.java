/**  
* @Title: Student.java
* @Package com.nevile.rts.base.aop.anotation.service
* @Description: TODO
* @author Nevile  
* @date 2018年4月23日 下午10:21:07
* @version V1.0  
*/ 
package com.nevile.rts.spring.aop.anotation.service;

import org.springframework.stereotype.Component;

/**
 * ClassName: Student
 * @Description: 实体
 */
@Component
public class Student {
	private Integer id;
	private String name;
	private String sex;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + "]";
	}
	
	
}
