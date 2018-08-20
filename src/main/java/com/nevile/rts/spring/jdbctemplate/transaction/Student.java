/**  
* @Title: Student.java
* @Package com.nevile.rts.spring.jdbctemplate.transaction
* @Description: TODO
* @author Nevile  
* @date 2018年5月27日 上午7:43:42
* @version V1.0  
*/ 
package com.nevile.rts.spring.jdbctemplate.transaction;

import java.util.Date;

/**
 * ClassName: Student
 * @Description: 
 */
public class Student {
	private int id;
	private String name;
	private String sex;
	private Date birthday;
	private Date entrance_shool;
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Date getEntrance_shool() {
		return entrance_shool;
	}
	public void setEntrance_shool(Date entrance_shool) {
		this.entrance_shool = entrance_shool;
	}
	
	

}
