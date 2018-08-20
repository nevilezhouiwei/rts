package com.nevile.rts.hibernate.maping.onemany;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.nevile.rts.hibernate.maping.onemany.pojo.Person;
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
public class OneManyTest {
	/**
	 * 
	 */
	@Test
	public void unidirectionalOne2Many() { 

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		//==================================
		Person aPerson = (Person) session.get(Person.class,(long)1);
		aPerson.setAge(13);
		//==================================
		session.getTransaction().commit();
		HibernateUtil.getSessionFactory().close();
	}
	/**
	 * 一对多的一级缓存和快照测试
	 * 1、缓存是从数据库中查询到值封装成对象后存储在session中的数据。
	 * 2、快照是查询到的数据又备份到另外的区域。
	 * 3、在事务中的持久态对象状态如果发生改变，在事务提交的时刻，持久态的数据会和快照中的
	 * 数据对比。一致就不更新，不一致就执行更新语句。
	 */
	@Test
	public void one2many1Cach() { 

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		//==================================
		Person aPerson = new Person(30,"Képler Laveran","Lima Ferreira");
		session.save(aPerson);
		System.out.println("session.save over .");
		aPerson.setAge(31);
		System.out.println("setAge over .");

		//==================================
		session.getTransaction().commit();
		HibernateUtil.getSessionFactory().close();
		System.out.println("aPerson"+aPerson);
	}
	
	/**
	 * 通过many 的一方找到 one 的一方初始化数据
	 * load:lazy加载数据的id，生成代理对象。
	 * get:直接加载完成的数据再封装成对象。 
	 * OID方式检索：

	 */
	@Test
	public void one2manyOID() { 

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		//==================================
		//get方法查询
		System.out.println("======1、get方法查询======");
		Person aPerson = (Person) session.get(Person.class, (long)1);
		System.out.println(aPerson);
		System.out.println("=====2、HQL方法查询批量查询======");
		String hql = "from Person";
		Query createQuery = session.createQuery(hql);
		List list = createQuery.list();
		System.out.println(list);
		System.out.println("=====3、HQL方法查询条件查询======");
		String hql1 = "from Person p where p.id=1 and p.firstname=\'Losin1\'";
		Query p1 = session.createQuery(hql1);
		List listp1 = p1.list();
		System.out.println(listp1);
		
		String hql2 = "select new List(id,firstname) from Person";
		Query p2 = session.createQuery(hql2);
		List listp2 = p2.list();
		System.out.println(listp2);
		
		String hql3 = "select new Map(id,firstname) from Person";
		Query p3 = session.createQuery(hql3);
		List listp3 = p3.list();
		System.out.println(listp3);
		//==================================
		session.getTransaction().commit();
		HibernateUtil.getSessionFactory().close();
	}
	
	/** 
	 * QBC方式检索：
	 * Query By Criteria,是一种更加面向对象的查询语言，提供的一系列QBC API来检索对象。
	 */
	@Test
	public void one2manyQBC() { 

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		//==================================
		System.out.println("======1、Criteria 查询实体所有");
		Criteria criteria = session.createCriteria(Person.class);
		List list = criteria.list();
		System.out.println(list);
		System.out.println("======2、 Criteria 按条件查询实体");
		Person aPerson = (Person) criteria.add(Restrictions.eq("firstname", "Losin1")).uniqueResult();
		System.out.println(aPerson);
		
		
		//==================================
		session.getTransaction().commit();
		HibernateUtil.getSessionFactory().close();
	}
	


}
