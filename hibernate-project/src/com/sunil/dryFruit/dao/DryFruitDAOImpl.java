package com.sunil.dryFruit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sunil.dryFruit.dto.DryFruitDTO;

public class DryFruitDAOImpl implements DryFruitDAO{

	@Override
	public int save(DryFruitDTO entity) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(DryFruitDTO.class);
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
