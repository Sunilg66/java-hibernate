package com.sunil.camera;

import java.util.ArrayList;
import java.util.List;

import com.sunil.camera.dao.CameraDAO;
import com.sunil.camera.dao.CameraDAOImpl;
import com.sunil.camera.entity.CameraEntity;

public class CameraTester {
	
	public static void main(String[] args) {
		
		CameraDAO dao = new CameraDAOImpl();
		
		CameraEntity en = new CameraEntity("SamsungA60","Samsung",50,70,true,true,true);
		
		CameraEntity en1 = new CameraEntity("NokiaS30","Nokia",260,50,true,true,false);
		
		CameraEntity en2 = new CameraEntity("KonikaLM56","Konika",180,80,true,false,true);
				
		dao.save(en);
		dao.save(en1);
		dao.save(en2);
		
		dao.readById(2);
		
		dao.updateNameById(4, "CanonDigital plus ");
		
		List<CameraEntity> list = new ArrayList<CameraEntity>();
		list.add(en);
		list.add(en1);
		list.add(en2);
		
		dao.saveList(list);
		
		dao.deleteById(3);
		
		List<Integer> ls = new ArrayList<>();
		ls.add(20);
		ls.add(21);
		dao.deleteList(ls);
		
		
		
		
	}

}
