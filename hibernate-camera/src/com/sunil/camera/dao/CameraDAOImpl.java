package com.sunil.camera.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sunil.camera.entity.CameraEntity;
import com.sunil.camera.util.SFUtil;

public class CameraDAOImpl implements CameraDAO {

	private SessionFactory fact = SFUtil.getFactory();

	@Override
	public void save(CameraEntity entity) {
		try (Session session = fact.openSession()) {
			Transaction tx = session.beginTransaction();
			System.out.println("Save : " + session.save(entity));
			session.flush();
			session.clear();
			tx.rollback();
		}

	}

	@Override
	public CameraEntity readById(int id) {
		try (Session session = fact.openSession()) {
			CameraEntity entity = session.get(CameraEntity.class, id);
			System.out.println("Read data: " + entity);
			return entity;

		}
	}

	@Override
	public void updateNameById(int id, String name) {
		try (Session session = fact.openSession()) {
			Transaction tr = session.beginTransaction();
			CameraEntity entity = session.get(CameraEntity.class, id);
			entity.setName(name);
			System.out.println("updated data : " + entity);
			tr.commit();
		}

	}

	@Override
	public void saveList(List<CameraEntity> Entity) {

		try (Session session = fact.openSession()) {
			Transaction tx = session.beginTransaction();
			Entity.forEach(entity -> {
				session.save(entity);
				System.out.println(entity);
			});
			tx.commit();
		}

	}

	@Override
	public void deleteById(int id) {
		
		try (Session session = fact.openSession()) {
			Transaction trans = session.beginTransaction();
			CameraEntity entity = session.get(CameraEntity.class, id);
			session.delete(entity);
			System.out.println("deleted data: "+ entity);
			trans.commit();
		}
		
		
	}

	@Override
	public void deleteList(List<Integer> id) {
                
		try(Session session = fact.openSession()){
			
			Transaction tx = session.beginTransaction();
			id.forEach(entity -> {
				CameraEntity ce = session.get(CameraEntity.class, entity);
				if(id.contains(entity)) {
					session.delete(ce);
					System.out.println(ce);
				}
			});
			tx.commit();
		}
	}

}
