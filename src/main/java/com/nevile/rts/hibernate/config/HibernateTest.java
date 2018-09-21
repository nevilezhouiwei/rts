/**  
* @Title: HibernateTest.java
* @Package com.nevile.rts.hibernate.service
* @Description: TODO
* @author Nevile  
* @date 2018年6月28日 下午4:54:50
* @version V1.0  
*/
package com.nevile.rts.hibernate.config;

import org.hibernate.Session;
import org.junit.Test;

import com.nevile.rts.hibernate.pojo.Event;
import com.nevile.rts.hibernate.pojo.Person;
import com.nevile.rts.hibernate.utils.HibernateUtil;

/**
 * ClassName: HibernateTest
 * 
 * @Description: Hibernate多对多模型，xml配置
 */
public class HibernateTest {
	/**
	 * 一对多
	 */
	@Test
	public void addEventToPerson() {
		Long personId = (long) 2;
		Long eventId = (long) 2;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		// 使用load方法按照id查找
		Person aPerson = (Person) session.load(Person.class, personId);
		Event anEvent = (Event) session.load(Event.class, eventId);
		// 持久状态被修改后，不用对直接对数据重新保存，自动脏检查（automatic dirty checking）
		System.out.println("持久态1：" + aPerson);
		aPerson.getEvents().add(anEvent);
		System.out.println("持久态2：" + aPerson);
		session.getTransaction().commit();
		// session之外的实体被称为游离态吧（betached）
		aPerson.setAge(1);
		System.out.println("游离态1：" + aPerson);
		HibernateUtil.getSessionFactory().close();
	}


	@Test
	public void addPersonToEvent1() {
		Long personId = (long) 1;
		Long eventId = (long) 2;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		// createQuery
		// createSQLQuery
		Person aPerson = (Person) session
				.createQuery("select p from Person p left join fetch p.events where p.id = :pid")
				.setParameter("pid", personId).uniqueResult(); // Eager fetch the collection so we can use it detached
		System.out.println(aPerson);
		Event anEvent = (Event) session.load(Event.class, eventId);
		System.out.println(anEvent);
		session.getTransaction().commit();

		// End of first unit of work

		aPerson.getEvents().add(anEvent); // aPerson (and its collection) is detached
		System.out.println(aPerson);
		// Begin second unit of work

		Session session2 = HibernateUtil.getSessionFactory().getCurrentSession();
		session2.beginTransaction();
		session2.update(aPerson); // Reattachment of aPerson
		System.out.println(aPerson);
		session2.getTransaction().commit();
	}
//	@Test
//	public void addPersonToEvent( ) {
//		Long personId = (long) 1;
//		Long eventId = (long) 2;
//		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//		session.beginTransaction();
//		Person aPerson = (Person) session
//				.createQuery("select p from Person p left join fetch p.events where p.id = :pid")
//				.setParameter("pid", personId).uniqueResult(); // Eager fetch the collection so we can use it detached
//		
//		Event anEvent = (Event) session.load(Event.class, eventId);
//		System.out.println(anEvent);
//		
//		anEvent.getParticipants().add(aPerson);// aPerson (and its collection) is detached
//		
//		session.getTransaction().commit();
//
//
//	}
	
//	@Test
//    public void addEmailToPerson() {
//		Long personId = (long) 1;
//		Long eventId = (long) 2;
//		String emailAddress = "ZhongNanRoad";
//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        session.beginTransaction();
//
//        Person aPerson = (Person) session.load(Person.class, personId);
//        // adding to the emailAddress collection might trigger a lazy load of the collection
//        aPerson.getEmailAddresses().add(emailAddress);
//
//        session.getTransaction().commit();
//    }

}
