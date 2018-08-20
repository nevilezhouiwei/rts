/**  
* @Title: People.java
* @Package com.nevile.rts.hibernate.pojo
* @Description: TODO
* @author Nevile  
* @date 2018年6月28日 下午4:27:31
* @version V1.0  
*/
package com.nevile.rts.hibernate.maping.manyone.pojo;

/**
 * ClassName: Person
 * 
 * @Description:One的一方
 */
public class Person {

	private Long idp;
	private int age;
	private String firstname;
	private String lastname;

	// 默认无参数构造器
	public Person() {
	}



	public Long getIdp() {
		return idp;
	}



	public void setIdp(Long idp) {
		this.idp = idp;
	}



	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Person(int age, String firstname, String lastname) {
		super();
		this.age = age;
		this.firstname = firstname;
		this.lastname = lastname;
	}



	@Override
	public String toString() {
		return "Person [idp=" + idp + ", age=" + age + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}




}
