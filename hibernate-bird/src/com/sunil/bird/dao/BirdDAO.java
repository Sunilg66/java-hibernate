package com.sunil.bird.dao;

import com.sunil.bird.entity.BirdEntity;

public interface BirdDAO {
	
	int save(BirdEntity entity);
	
	BirdEntity readById(int pk);
	
	void updateNameById(int id,String name);
	
	void deleteById(int id);

}
