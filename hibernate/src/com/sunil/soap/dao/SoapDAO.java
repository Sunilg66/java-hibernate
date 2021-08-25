package com.sunil.soap.dao;

import com.sunil.soap.dto.SoapDTO;

public interface SoapDAO {
	
	int save(SoapDTO entity);
	
	int saveAndUpdate(SoapDTO entity);
	
	int delete(SoapDTO entity);
	
	int read(SoapDTO entity);
	

}
