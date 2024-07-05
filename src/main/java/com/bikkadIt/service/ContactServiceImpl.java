package com.bikkadIt.service;

import java.util.List;

import com.bikkadIt.dao.ContactDao;
import com.bikkadIt.exception.NoDataFoundException;
import com.bikkadIt.model.Contact;

public class ContactServiceImpl implements ContactService {

	private ContactDao contactDao;

 void setContactDao(ContactDao contactDao) {
		this.contactDao = contactDao;
	}
	
	@Override
	public String getNameById(Integer id) {
		String name = contactDao.findNameById(id);
		String formattedName = name.toUpperCase();
		return formattedName;
	}

	@Override
	public List<String> getAllContactName() {
		 List<String> names = contactDao.findNames();
	
		 if(names==null) {
			 throw new  NoDataFoundException();
		 }
		 return names;
	}

	@Override
	public Contact getContactById(Integer id) {
		Contact contact = contactDao.findById(id);
		
		
		if(contact == null) {
			throw new NoDataFoundException();
	}
	return contact;
	}

}
