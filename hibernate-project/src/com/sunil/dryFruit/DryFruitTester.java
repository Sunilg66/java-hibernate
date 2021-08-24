package com.sunil.dryFruit;

import com.sunil.dryFruit.dao.DryFruitDAO;
import com.sunil.dryFruit.dao.DryFruitDAOImpl;
import com.sunil.dryFruit.dto.DryFruitDTO;

public class DryFruitTester {

	public static void main(String[] args) {
		
		DryFruitDTO dto = new DryFruitDTO(2,"Cashew","Tulunadu Flavours","Karnataka",680,"Natura");
		
		DryFruitDAO dao = new DryFruitDAOImpl();
		dao.save(dto);

	}

}
