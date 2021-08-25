package com.sunil.soap.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.sunil.soap.dto.SoapDTO;

public class SoapDAOImpl implements SoapDAO {

	SoapDTO dt = null;

	@Override
	public int read(SoapDTO entity) {

		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(SoapDTO.class);
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		SoapDTO dt = (SoapDTO) session.get(SoapDTO.class, 2);
		System.out.println(dt);
		tr.commit();
		session.close();
		factory.close();

		return 1;
	}

	@Override
	public int save(SoapDTO entity) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(SoapDTO.class);
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		int pk = (int) session.save(entity);
		tr.commit();
		System.out.println(pk);
		session.close();
		factory.close();
		return pk;
	}

	@Override
	public int saveAndUpdate(SoapDTO entity) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(SoapDTO.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		dt = (SoapDTO) session.get(SoapDTO.class, 2);
		dt.setBrandAmbassador("Mridula");
		session.update(dt);
		session.getTransaction().commit();
		System.out.println("updated ambassdor : " + dt);
		session.close();
		return 1;
	}

	@Override
	public int delete(SoapDTO entity) {
		Configuration con = new Configuration();
		con.configure();
		con.addAnnotatedClass(SoapDTO.class);
		SessionFactory sessionfact = con.buildSessionFactory();
		Session session = sessionfact.openSession();
		Object obj = session.load(SoapDTO.class, new Integer(4));
		SoapDTO dt = (SoapDTO) obj;
		Transaction tr = session.beginTransaction();
		session.delete(dt);
		System.out.println("data as been deleted");
		tr.commit();
		session.close();
		sessionfact.close();
		return 0;
	}

}
