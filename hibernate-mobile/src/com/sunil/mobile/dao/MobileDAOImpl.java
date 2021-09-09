package com.sunil.mobile.dao;

import java.util.List;
import java.util.Objects;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.internal.build.AllowSysOut;
import org.hibernate.query.Query;

import com.sunil.mobile.entity.MobileEntity;
import com.sunil.mobile.util.SFUtil;

public class MobileDAOImpl implements MobileDAO{
	
	private SessionFactory factory = SFUtil.getFactory();
	Transaction trans=null;
    @Override
    public int save(MobileEntity entity) {
    	int key = 0;
		try (Session session = factory.openSession()) {
			trans = session.beginTransaction();
			key = (int) session.save(entity);
			session.flush();
			session.clear();
		
		trans.commit();
    	return key;
		}
    }
	@Override
	public void read(int id) {
		try (Session session = factory.openSession()) {
			Query query = session.createQuery("from MobileEntity");
			List<MobileEntity> list = query.list();
			for (MobileEntity mobileEntity : list) {
				System.out.println(mobileEntity);
			}
		}
	}
	@Override
	public double readPriceByName() {
		System.out.println("invoked readPriceByName()");
	Session session=null;
		try {
			session=factory.openSession();
			Query query = session.createQuery(" select price from MobileEntity where name='SONY' ");
			Object obj = query.uniqueResult();
			if(obj!=null) {
				Double price = (Double) obj;
				return price;
				
			}
			
		} catch(HibernateException e) {
			System.out.println(e.getMessage());
		}finally {
			if(Objects.nonNull(session)) {
				session.close();
				System.out.println("session closed");
				
			}else {
				System.out.println("session not closed");
			}
		}
		return 0;
	}
	@Override
	public double readTotalPrice() {
		System.out.println("invoked readTotalPrice()");
		Session session=null;
			try {
				session=factory.openSession();
				Query query = session.createQuery(" select sum(price) from MobileEntity ");
				Object obj = query.uniqueResult();
				if(obj!=null) {
					Double totalprice = (Double) obj;
					return totalprice;
					
				}
				
			} catch(HibernateException e) {
				System.out.println(e.getMessage());
			}finally {
				if(Objects.nonNull(session)) {
					session.close();
					System.out.println("session closed");
					
				}else {
					System.out.println("session not closed");
				}
			}
		
		return 0;
	}
	@Override
	public double readMaxPrice() {
		System.out.println("invoked readMaxPrice()");
		Session session=null;
			try {
				session=factory.openSession();
				Query query = session.createQuery(" select max(price) from MobileEntity ");
				Object obj = query.uniqueResult();
				if(obj!=null) {
					Double maxprice = (Double) obj;
					return maxprice;
					
				}
				
			} catch(HibernateException e) {
				System.out.println(e.getMessage());
			}finally {
				if(Objects.nonNull(session)) {
					session.close();
					System.out.println("session closed");
					
				}else {
					System.out.println("session not closed");
				}
			}
		
		return 0;
	}
	@Override
	public double readMinPrice() {
		System.out.println("invoked readMinPrice()");
		Session session=null;
			try {
				session=factory.openSession();
				Query query = session.createQuery(" select min(price) from MobileEntity ");
				Object obj = query.uniqueResult();
				if(obj!=null) {
					Double minprice = (Double) obj;
					return minprice;
					
				}
				
			} catch(HibernateException e) {
				System.out.println(e.getMessage());
			}finally {
				if(Objects.nonNull(session)) {
					session.close();
					System.out.println("session closed");
					
				}else {
					System.out.println("session not closed");
				}
			}
		return 0;
	}
	
	public int updatePriceById() {
		try (Session session = factory.openSession()) {
			Query query = session.createQuery("update MobileEntity mobile set mobile.price='25000' where mobile.id='1'");
			session.beginTransaction();
			query.executeUpdate();
			session.getTransaction().commit();
			
		}
		return 0;
	}


}
