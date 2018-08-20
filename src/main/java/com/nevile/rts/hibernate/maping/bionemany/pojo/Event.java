/**  
* @Title: Event.java
* @Package com.nevile.rts.hibernate.pojo
* @Description: TODO
* @author Nevile  
* @date 2018年6月22日 下午2:59:06
* @version V1.0  
*/
package com.nevile.rts.hibernate.maping.bionemany.pojo;

import java.util.Date;

/**
 * ClassName: Event
 * 
 * @Description: Many多的一方
 */
public class Event {

	private Long id;
	private String title;
	private Date date;
	private Person person;


	public Event() {
	}


	public Long getId() {
		return id;
	}


	private void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}


	@Override
	public String toString() {
		return "Event [id=" + id + ", title=" + title + ", date=" + date + "]";
	}







}