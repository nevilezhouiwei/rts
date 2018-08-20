/**  
* @Title: Student.java
* @Package com.nevile.rts.base.logs.pojo
* @Description: TODO
* @author Nevile  
* @date 2018年4月2日 下午7:14:06
* @version V1.0  
*/ 
package com.nevile.rts.spring.ioc.pojo;

import java.util.Date;
import java.util.List;

/**
 * ClassName: Student
 * @Description: 学生信息pojo
 */
public class Student {
	
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String name;
	private String sex;
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	private Date birthday;
	private Date entranceSchool;
	private List<Address> address;
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public List<Address> getAddress() {
		return address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Date getEntranceSchool() {
		return entranceSchool;
	}
	public void setEntranceSchool(Date entranceSchool) {
		this.entranceSchool = entranceSchool;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", birthday=" + birthday + ", entranceSchool="
				+ entranceSchool + ", address=" + address + "]";
	}
	
	

}
