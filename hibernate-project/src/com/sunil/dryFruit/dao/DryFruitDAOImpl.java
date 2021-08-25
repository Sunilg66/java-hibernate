package com.sunil.dryFruit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sunil.dryFruit.dto.DryFruitDTO;

public class DryFruitDAOImpl implements DryFruitDAO {

	DryFruitDTO dt = null;

	@Override
	public int save(DryFruitDTO entity) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(DryFruitDTO.class);
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
	public int read(DryFruitDTO entity) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(DryFruitDTO.class);
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		DryFruitDTO dt = (DryFruitDTO) session.get(DryFruitDTO.class, 1);
		System.out.println(dt);
		tr.commit();
		session.close();
		factory.close();

		return 1;
	}

	@Override
	public int update(DryFruitDTO entity) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(DryFruitDTO.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		dt = (DryFruitDTO) session.get(DryFruitDTO.class, 2);
		dt.setName("Pista");
		session.update(dt);
		session.getTransaction().commit();
		System.out.println("updated name : " + dt);
		session.close();
		return 1;
	}

	@Override
	public int delete(DryFruitDTO entity) {
		Configuration con = new Configuration();
		con.configure();
		con.addAnnotatedClass(DryFruitDTO.class);
		SessionFactory sessionfact = con.buildSessionFactory();
		Session session = sessionfact.openSession();
		Object obj = session.load(DryFruitDTO.class, new Integer(1));
		DryFruitDTO dt = (DryFruitDTO) obj;
		Transaction tr = session.beginTransaction();
		session.delete(dt);
		System.out.println("data at first row as been deleted");
		tr.commit();
		session.close();
		sessionfact.close();
		return 1;
	}

}
