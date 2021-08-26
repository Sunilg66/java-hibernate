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
		Configuration config = createdConfig();
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
	public void read(int id) {
		Configuration config = createdConfig();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		DryFruitDTO dt = (DryFruitDTO) session.get(DryFruitDTO.class, id);
		System.out.println(dt);
		tr.commit();
		session.close();
		factory.close();
	}

	private Configuration createdConfig() {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(DryFruitDTO.class);
		return config;
	}

	@Override
	public void update(DryFruitDTO entity) {
		Configuration config = createdConfig();
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		dt = (DryFruitDTO) session.get(DryFruitDTO.class, 2);
		dt.setName("Pista");
		session.update(entity);
		session.getTransaction().commit();
		System.out.println("updated name : " + dt);
		session.close();
	}

	@Override
	public void delete(DryFruitDTO entity) {
		Configuration con = createdConfig();
		SessionFactory sessionfact = con.buildSessionFactory();
		Session session = sessionfact.openSession();
		Transaction tr = session.beginTransaction();
		Object obj = session.load(DryFruitDTO.class, new Integer(1));
		DryFruitDTO dt = (DryFruitDTO) obj;
		session.delete(entity);
		System.out.println("data at first row as been deleted");
		tr.commit();
		session.close();
		sessionfact.close();
	}

}
