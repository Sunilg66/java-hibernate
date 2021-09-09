package com.sunil.mobile.dao;

import com.sunil.mobile.entity.MobileEntity;

public interface MobileDAO {
	
	int save(MobileEntity entity);
	
	void read(int id);
	
	double readPriceByName();
	
	double readTotalPrice();
	
	double readMaxPrice();
	
	double readMinPrice();
	
	int updatePriceById();
	
	

}
