package com.bikkadIt.service;


import java.util.List;

import com.bikkadIt.model.Contact;

public interface ContactService {

	public String getNameById(Integer id);
	
	public List<String> getAllContactName();
	
	public Contact getContactById(Integer id);
}

