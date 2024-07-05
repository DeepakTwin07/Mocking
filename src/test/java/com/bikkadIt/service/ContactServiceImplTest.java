package com.bikkadIt.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.easymock.EasyMock;
import org.junit.jupiter.api.Test;

import com.bikkadIt.dao.ContactDao;
import com.bikkadIt.model.Contact;

class ContactServiceImplTest {

	@Test
	public void getAllContactNameTest() {

		// We are doing mcok for dependent object DAO
		ContactDao daoprorxy = EasyMock.createMock(ContactDao.class);

		// We create our own list

		List<String> list = new ArrayList<>();

		list.add("Rahul");
		list.add("Sachin");
		list.add("Rathod");

		EasyMock.expect(daoprorxy.findNames()).andReturn(list);

		EasyMock.replay(daoprorxy);

		ContactServiceImpl contactServiceImpl = new ContactServiceImpl();
		contactServiceImpl.setContactDao(daoprorxy);

		List<String> actualList = contactServiceImpl.getAllContactName();

		Integer expectedList = 3;

		assertEquals(expectedList, actualList.size());

	}

	@Test
	public void getContactByIdTest() {

		ContactDao daoproxy = EasyMock.createMock(ContactDao.class);

		ContactServiceImpl contactServiceImpl = new ContactServiceImpl();

		contactServiceImpl.setContactDao(daoproxy);

		Contact contact = new Contact();
		contact.setContactId(777);
		contact.setContactname("Rahul");
		contact.setContactNumber(121545451);

		Integer id = 777;
		EasyMock.expect(daoproxy.findById(id)).andReturn(contact);

		EasyMock.replay(daoproxy);

		Contact originalContact = contactServiceImpl.getContactById(id);

		String contactName = "Rahul";
		assertEquals(contactName, originalContact.getContactname());
		assertEquals(id,originalContact.getContactId());
		assertEquals(121545451,originalContact.getContactNumber());
		
		
		}

}
