package com.preacher.forum.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class HibernateInit {
	
	    static Configuration cfg;    
	    static SessionFactory sessionFactory;    
	    static ServiceRegistry serviceRegistry;    
	    static {    
	        cfg = new Configuration().configure();// 默认找文件hibernate.hbm.xml  
	        // 创建服务注册对象    
	        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(    
	                cfg.getProperties()).build();    
	        // 创建Factory工厂    
	        sessionFactory = cfg.buildSessionFactory(serviceRegistry);    
	    }    
	    
	    // 获取session对象    
	    public static Session getSession() {    
	        // 打开session    
	        return sessionFactory.getCurrentSession();    
	    }    
	    
	   
}
