/**  
* @Title: Event.java
* @Package com.nevile.rts.hibernate.pojo
* @Description: TODO
* @author Nevile  
* @date 2018年6月22日 下午2:59:06
* @version V1.0  
*/
package com.nevile.rts.hibernate.maping.manyone.pojo;

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
	//实体类中的 many to one的关联关系，与ORM 映射配置文件对应。
	private Person person;
	
	

	public Event(String title, Date date, Person person) {
		super();
		this.title = title;
		this.date = date;
		this.person = person;
	}



	public Event() {
	}



	private Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}



	@Override
	public String toString() {
		return "Event [id=" + id + ", title=" + title + ", date=" + date + ", person=" + person + "]";
	}



	public Person getPerson() {
		return person;
	}



	public void setPerson(Person person) {
		this.person = person;
	}
	










}