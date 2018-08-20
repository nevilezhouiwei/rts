/**  
* @Title: HibernateUtil.java
* @Package com.nevile.rts.hibernate.utils
* @Description: TODO
* @author Nevile  
* @date 2018年6月22日 下午3:13:23
* @version V1.0  
*/ 
package com.nevile.rts.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * ClassName: HibernateUtil
 * @Description: HibernateUtil工具
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
        	Configuration cfg = new Configuration().configure();
        	StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
        	                    .applySettings(cfg.getProperties()).build();
        	System.out.println(cfg.toString());
        	SessionFactory sessionFactory = cfg.buildSessionFactory(serviceRegistry);
        	return sessionFactory;
        }
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("初始化SessionFactory失败." + ex);
            throw new ExceptionInInitializerError(ex);
        }
		
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}