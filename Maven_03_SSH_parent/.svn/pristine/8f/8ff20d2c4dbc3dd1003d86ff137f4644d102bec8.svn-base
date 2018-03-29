package com.abc.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class HibernateUtils {

	private static SessionFactory sessionFactory;
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		HibernateUtils.sessionFactory = sessionFactory;
	}
	
//	private static Configuration config;
	
	
	// configure()参数为空默认查找classes目录下hibernate.cfg.xml 
    // configure("文件名")也有重载方法，参数名为配置文件名 
	static {
//		config = new Configuration().configure();
//		factory = config.buildSessionFactory();
		
	}
	//获取session
	public static Session getSession() {
		return sessionFactory.openSession();
		
	}
	//讲session绑定到线程
	public static Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
}