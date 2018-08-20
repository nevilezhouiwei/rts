package com.nevile.rts.hibernate.maping.manyone;

import java.util.Date;

import org.hibernate.Session;
import org.junit.Test;

import com.nevile.rts.hibernate.maping.manyone.pojo.Event;
import com.nevile.rts.hibernate.maping.manyone.pojo.Person;
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
public class ManyOneTest {
	/**
	 * 通过many 的一方找到 one 的一方初始化数据
	 */
	@Test
	public void unidirectionalMany2One() { 

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		//==================================

//		for(int i=1;i<5;i++) {
//			Person aPerson = new Person();
//			aPerson.setAge(31);
//			aPerson.setFirstname("Losin"+i);
//			aPerson.setLastname("Messi"+i);
//			session.save(aPerson);
//		}
		for(int i=1;i<5;i++) {
			Person aPerson = (Person) session.load(Person.class, (long)i);
			Event anEvent = new Event("My Event",new Date(),aPerson);
			System.out.println(anEvent);
			session.save(anEvent);
		}
		
		//==================================
		session.getTransaction().commit();
		HibernateUtil.getSessionFactory().close();
	}
	
	@Test
	public void unidirectionalMany2OneFind() { 

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		//==================================
		Event anEvent = (Event)session.load(Event.class, (long)1);
		System.out.println(anEvent);
		
		//==================================
		session.getTransaction().commit();
		HibernateUtil.getSessionFactory().close();
	}

}
