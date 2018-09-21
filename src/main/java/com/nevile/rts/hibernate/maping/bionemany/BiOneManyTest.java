package com.nevile.rts.hibernate.maping.bionemany;

import org.hibernate.Session;
import org.junit.Test;

import com.nevile.rts.hibernate.maping.bionemany.pojo.Event;
import com.nevile.rts.hibernate.maping.bionemany.pojo.Person;
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
public class BiOneManyTest {
	/**
	 * 通过many 的一方找到 one 的一方初始化数据
	 */
	@Test
	public void bi_One2Many() { 

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		//==================================
		Person aPerson = (Person) session.load(Person.class,(long)1);
		System.out.println(aPerson);
		
		Event anEvent = (Event) session.load(Event.class,(long)1);
		System.out.println(anEvent);
		System.out.println(anEvent.getPerson().toString());
		//==================================
		session.getTransaction().commit();
		HibernateUtil.getSessionFactory().close();
	}
	


}
