package com.sunil.dryFruit.dao;

import com.sunil.dryFruit.dto.DryFruitDTO;

public interface DryFruitDAO {

	int save(DryFruitDTO entity);

	int read(DryFruitDTO entity);

	int update(DryFruitDTO entity);

	int delete(DryFruitDTO entity);

}
