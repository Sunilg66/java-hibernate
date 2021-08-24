package com.sunil.soap.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sunil.soap.dto.SoapDTO;

public class SoapDAOImpl implements SoapDAO{

	@Override
	public int save(SoapDTO entity) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(SoapDTO.class);
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		int pk = (int)session.save(entity);
		tr.commit();
		System.out.println(pk);
		session.close();
		factory.close();
		return pk;
	}

}
