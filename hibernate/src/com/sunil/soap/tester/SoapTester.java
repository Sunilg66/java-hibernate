package com.sunil.soap.tester;

import com.sunil.soap.constant.SoapType;
import com.sunil.soap.dao.SoapDAO;
import com.sunil.soap.dao.SoapDAOImpl;
import com.sunil.soap.dto.SoapDTO;

public class SoapTester {

	public static void main(String[] args) {

		SoapDTO dto = new SoapDTO(6, "Mahesh", "lime", true, false, SoapType.HUMAN);

		SoapDAO dao = new SoapDAOImpl();

		dao.read(2);
		
		dao.save(dto);

		dao.saveAndUpdate(dto);

		dao.delete(dto);

	}

}
