package com.sunil.mobile.service;

import com.sunil.mobile.entity.MobileEntity;

public interface MobileService {

	int save(MobileEntity entity);

	boolean readPriceByName(String name);

	double readTotalPrice();

	double readMaxPrice();

	double readMinPrice();
	
	boolean updatePriceByName(double price,String name);

}
