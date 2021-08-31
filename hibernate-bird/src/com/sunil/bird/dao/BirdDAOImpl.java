package com.sunil.bird.dao;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.sunil.bird.entity.BirdEntity;
import com.sunil.bird.util.SFUtil;

public class BirdDAOImpl implements BirdDAO{
	


	@Override
	public int save(BirdEntity entity) {
		
		SessionFactory fact = SFUtil.getFactory();
		Session session = fact.openSession();
		Transaction tx = session.beginTransaction();
		int pk = (int) session.save(entity);
		tx.commit();
		System.out.println(pk);
		session.close();
		return pk;
	}

	@Override
	public BirdEntity readById(int pk) {
		SessionFactory fact = SFUtil.getFactory();
		Session session = fact.openSession();
		BirdEntity be = session.get(BirdEntity.class, pk);
		session.close();
		return be;
	}

	@Override
	public void updateNameById(int id, String name) {
		SessionFactory fact = SFUtil.getFactory();
		Session session = fact.openSession();
		Transaction tr = session.beginTransaction();
		entity=session.get(BirdEntity.class, id);
		entity.setName(name);
		session.update(entity);
		tr.commit();
		session.close();
		
		
	}

	@Override
	public void deleteById(int id) {
		SessionFactory fact = SFUtil.getFactory();
		Session session = fact.openSession();
		Transaction tr = session.beginTransaction();
		entity=session.get(BirdEntity.class, id);
		session.delete(entity);
		tr.commit();
		session.close();
	
		
	}

}
