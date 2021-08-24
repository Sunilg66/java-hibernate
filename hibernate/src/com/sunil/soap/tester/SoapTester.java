package com.sunil.soap.tester;

import com.sunil.soap.constant.SoapType;
import com.sunil.soap.dao.SoapDAO;
import com.sunil.soap.dao.SoapDAOImpl;
import com.sunil.soap.dto.SoapDTO;

public class SoapTester {

	public static void main(String[] args) {
	
		SoapDTO dto = new SoapDTO(2,"Mridula","Lemon",true,false,SoapType.DETERGENT);
		
		SoapDAO dao = new SoapDAOImpl();
		dao.save(dto);

	}

}
