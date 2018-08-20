/**  
* @Title: People.java
* @Package com.nevile.rts.hibernate.pojo
* @Description: TODO
* @author Nevile  
* @date 2018年6月28日 下午4:27:31
* @version V1.0  
*/
package com.nevile.rts.hibernate.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * ClassName: Person
 * 
 * @Description: TODO
 */
public class Person {

	private Long id;
	private int age;
	private String firstname;
	private String lastname;

	private Set events = new HashSet();

	private Set emailAddresses = new HashSet();

	public Person() {
	}

	// Accessor methods for all properties, private setter for 'id'

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	private void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname
	 *            the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname
	 *            the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Set getEvents() {
		return events;
	}

	public void setEvents(Set events) {
		this.events = events;
	}

	public Set getEmailAddresses() {
		return emailAddresses;
	}

	public void setEmailAddresses(Set emailAddresses) {
		this.emailAddresses = emailAddresses;
	}

	// public void addToEvent(Event event) {
	// this.getEvents().add(event);
	// event.getParticipants().add(this);
	// }
	//
	// public void removeFromEvent(Event event) {
	// this.getEvents().remove(event);
	// event.getParticipants().remove(this);
	// }
	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", firstname=" + firstname + ", lastname=" + lastname + ", events="
				+ events + "]";
	}

}
