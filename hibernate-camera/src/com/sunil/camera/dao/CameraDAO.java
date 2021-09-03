package com.sunil.camera.dao;

import java.util.List;

import com.sunil.camera.entity.CameraEntity;

public interface CameraDAO {

	void save(CameraEntity entity);

	 CameraEntity readById(int id);

	void updateNameById(int id, String name);

	void deleteById(int id);
	
	void saveList(List<CameraEntity> Entity);
	
	void deleteList(List<Integer> id);
	

}
