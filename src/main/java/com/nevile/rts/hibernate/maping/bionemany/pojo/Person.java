/**  
* @Title: People.java
* @Package com.nevile.rts.hibernate.pojo
* @Description: TODO
* @author Nevile  
* @date 2018年6月28日 下午4:27:31
* @version V1.0  
*/
package com.nevile.rts.hibernate.maping.bionemany.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * ClassName: Person
 * 
 * @Description:One的一方
 */
public class Person {

	private Long id;
	private int age;
	private String firstname;
	private String lastname;
	
	private Set<Event> events =new HashSet<Event>();

	public Person() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Set getEvents() {
		return events;
	}

	public void setEvents(Set events) {
		this.events = events;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", firstname=" + firstname + ", lastname=" + lastname + ", events="
				+ events + "]";
	}
	
	
	
	





	


}
