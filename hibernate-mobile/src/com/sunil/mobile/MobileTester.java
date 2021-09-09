package com.sunil.mobile;

import com.sunil.mobile.dao.MobileDAO;
import com.sunil.mobile.dao.MobileDAOImpl;
import com.sunil.mobile.entity.MobileEntity;

public class MobileTester {
	public static void main(String[] args) {
		MobileEntity entity = new MobileEntity("VIVO V15", "Red", true,6500);
		MobileEntity entity1 = new MobileEntity("SONY S12", "Green", true,8500);
		
	
		MobileDAO dao = new MobileDAOImpl();
		dao.save(entity);
		dao.save(entity1);
		dao.read(2);
		
		System.out.println(dao.readPriceByName());
		
		System.out.println(dao.readTotalPrice());
		
		System.out.println(dao.readMaxPrice());
		
		System.out.println(dao.readMinPrice());
		
		System.out.println(dao.updatePriceById());
	}

}
