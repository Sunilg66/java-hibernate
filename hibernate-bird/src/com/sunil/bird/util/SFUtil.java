package com.sunil.bird.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SFUtil {
	
	
 private static SessionFactory factory;
	
	public static SessionFactory getFactory() {
		if(factory!=null && factory.isClosed()) {
			throw new IllegalStateException("Some one closed SF please correct the code");
			
		}
		return factory;
	}
	
	static {
		try {
			System.out.println("SF STARTED");
			Configuration config = new Configuration().configure();
			factory=config.buildSessionFactory();
			System.out.println("SF INIT COMPLETED");
		}catch(HibernateException e) {
			e.printStackTrace();
		}
	}

}
