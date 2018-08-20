package com.nevile.rts.hibernate.maping.many2many;

import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.junit.Test;

import com.nevile.rts.hibernate.maping.many2many.pojo.Event;
import com.nevile.rts.hibernate.maping.many2many.pojo.Person;
import com.nevile.rts.hibernate.utils.HibernateUtil;

/**
 * 主题：一对多
 * 计划：
 * 1、单项一对对多
 * 2、单项多对一
 * 3、双向一对多或多对一
 * @author Administrator
 *
 */
public class ManyManyTest {
	/**
	 * 通过many 的一方找到 one 的一方初始化数据
	 */
	@Test
	public void many2many() { 

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		//==================================
		Person aPerson = (Person) session.load(Person.class,(long)1);
		System.out.println(aPerson);
		
		Event anEvent = (Event) session.load(Event.class,(long)2);
		System.out.println(anEvent);
		Set<Person> persons = (Set<Person>)anEvent.getPersons();
		for (Person p : persons) {
			System.out.println(p);
		}
		//aPerson.getEvents().remove(anEvent);
		//==================================
		session.getTransaction().commit();
		HibernateUtil.getSessionFactory().close();
	}
	


}
