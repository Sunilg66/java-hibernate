package com.sunil.mobile.dao;

import com.sunil.mobile.entity.MobileEntity;

public interface MobileDAO {
	
	int save(MobileEntity entity);
	
	void read(int id);
	
	double readPriceByName(String name);
	
	double readTotalPrice();
	
	double readMaxPrice();
	
	double readMinPrice();
	
	void updatePriceByName(double price,String name);
	
	

}
