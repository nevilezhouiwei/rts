/**  
* @Title: Event.java
* @Package com.nevile.rts.hibernate.pojo
* @Description: TODO
* @author Nevile  
* @date 2018年6月22日 下午2:59:06
* @version V1.0  
*/
package com.nevile.rts.hibernate.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ClassName: Event
 * 
 * @Description: TODO
 */
public class Event {
	/**
	 * All persistent entity classes (there are less important dependent classes as
	 * well) will need such an identifier property if we want to use the full
	 * feature set of Hibernate.
	 */
	private Long id;

	private String title;
	private Date date;
	private Set participants = new HashSet();

	// hibernate要求无参数构造器,如果没有会使用反射技术自己创建。
	public Event() {
	}

	public Set getParticipants() {
		return participants;
	}

	public void setParticipants(Set participants) {
		this.participants = participants;
	}

	public Long getId() {
		return id;
	}

	@SuppressWarnings("unused")
	private void setId(Long id) {
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
		return "Event [id=" + id + ", title=" + title + ", date=" + date + ", participants=" + participants + "]";
	}


}