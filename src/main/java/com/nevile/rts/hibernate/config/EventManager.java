/**  
* @Title: EventManager.java
* @Package com.nevile.rts.hibernate.service
* @Description: TODO
* @author Nevile  
* @date 2018年6月22日 下午3:19:32
* @version V1.0  
*/ 
package com.nevile.rts.hibernate.config;

import java.util.Date;

import org.hibernate.Session;

import com.nevile.rts.hibernate.pojo.Event;
import com.nevile.rts.hibernate.pojo.Person;
import com.nevile.rts.hibernate.utils.HibernateUtil;

/**
 * ClassName: EventManager
 * @Description: TODO
 */
public class EventManager {

    public static void main(String[] args) {
        EventManager mgr = new EventManager();

        if (args[0].equals("store")) {
            mgr.createAndStoreEvent("My Event", new Date());
        }
        mgr.createAndStorePerson(28, "zhou", "wei");

        HibernateUtil.getSessionFactory().close();
    }

    private void createAndStoreEvent(String title, Date theDate) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        Event theEvent = new Event();
        theEvent.setTitle(title);
        theEvent.setDate(theDate);
        session.save(theEvent);
        theEvent.setTitle("my event2！");
        

        session.getTransaction().commit();
    }
    
    private void createAndStorePerson(int age,String firstName,String lastName) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        Person aPerson = new Person();
        aPerson.setAge(age);
        aPerson.setLastname(lastName);
        aPerson.setFirstname(firstName);
        session.save(aPerson);
        session.getTransaction().commit();
    }

}