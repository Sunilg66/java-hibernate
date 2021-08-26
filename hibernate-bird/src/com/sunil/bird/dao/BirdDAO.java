package com.sunil.bird.dao;

import com.sunil.bird.entity.BirdEntity;

public interface BirdDAO {
	
	int save(BirdEntity entity);
	
	BirdEntity readById(int pk);

}
