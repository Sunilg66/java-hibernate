package com.sunil.mobile;

import com.sunil.mobile.dao.MobileDAO;
import com.sunil.mobile.dao.MobileDAOImpl;
import com.sunil.mobile.entity.MobileEntity;
import com.sunil.mobile.service.MobileService;
import com.sunil.mobile.service.MobileServiceImpl;

public class MobileTester {
	public static void main(String[] args) {
		MobileEntity entity = new MobileEntity("Nokia 1100", "Black", true,2500);
		MobileEntity entity1 = new MobileEntity("Xiomi X5", "Gold", true,19000);
		
	
		MobileService service = new MobileServiceImpl();
		service.save(entity);
		service.save(entity1);
		//dao1.read(2);
		
		System.out.println(service.readPriceByName("Samsung S8"));
		
		System.out.println(service.readTotalPrice());
		
		System.out.println(service.readMaxPrice());
		
		System.out.println(service.readMinPrice());
		
		service.updatePriceByName(28000,"Realme 5");
	}

}
