package com.sunil.bird;

import com.sunil.bird.constants.BirdType;
import com.sunil.bird.dao.BirdDAO;
import com.sunil.bird.dao.BirdDAOImpl;
import com.sunil.bird.entity.BirdEntity;

public class BirdTester {

	public static void main(String[] args) {
		
		BirdEntity entity = new BirdEntity(5,"Sparrow","brown",2,true,BirdType.HUMMINGBIRD,4,true,"short",false);
		
		BirdDAO dao = new BirdDAOImpl();
		dao.save(entity);
		
		BirdEntity en = dao.readById(2);
		System.out.println(en);
		

		dao.updateNameById(2, "Penguine");
		
		dao.deleteById(1);
	}

}
