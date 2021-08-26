package com.sunil.bird.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sunil.bird.entity.BirdEntity;

public class BirdDAOImpl implements BirdDAO{

	@Override
	public int save(BirdEntity entity) {
		Configuration config=new Configuration();
		config.configure();
		config.addAnnotatedClass(BirdEntity.class);
		SessionFactory fact = config.buildSessionFactory();
		Session session = fact.openSession();
		Transaction tx = session.beginTransaction();
		int pk = (int) session.save(entity);
		tx.commit();
		System.out.println(pk);
		session.close();
		fact.close();
		return pk;
	}

	@Override
	public BirdEntity readById(int pk) {
		Configuration config = new Configuration().configure().addAnnotatedClass(BirdEntity.class);
		SessionFactory fact = config.buildSessionFactory();
		Session session = fact.openSession();
		BirdEntity be = session.get(BirdEntity.class, pk);
		return be;
	}

}
