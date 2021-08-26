package com.sunil.dryFruit.dao;

import com.sunil.dryFruit.dto.DryFruitDTO;

public interface DryFruitDAO {

	int save(DryFruitDTO entity);

	void read(int id);

	void update(DryFruitDTO entity);

	void delete(DryFruitDTO entity);

}
