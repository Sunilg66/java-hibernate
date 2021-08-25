package com.sunil.dryFruit;

import com.sunil.dryFruit.dao.DryFruitDAO;
import com.sunil.dryFruit.dao.DryFruitDAOImpl;
import com.sunil.dryFruit.dto.DryFruitDTO;

public class DryFruitTester {

	public static void main(String[] args) {

		DryFruitDTO dto = new DryFruitDTO(4, "walnuts", "malnad dryfruits", "Karnataka", 320,
				"malnad dryfruits and walnuts");

		DryFruitDAO dao = new DryFruitDAOImpl();

		dao.read(dto);

		dao.save(dto);

		dao.update(dto);

		dao.delete(dto);

	}

}
