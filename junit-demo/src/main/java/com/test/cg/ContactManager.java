package com.test.cg;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ContactManager {
	
	Map<String, Contact> contactList = new HashMap<String, Contact>();
	
	public void addContact(String firstName, String lastName, String phone) {
		Contact contact = new Contact(firstName, lastName, phone);
		validateContact(contact);
		contactList.put("first", contact);
	}
	
	public Collection<Contact> getAllContacts() {
		return contactList.values();
	}
	
	private void validateContact(Contact contact) {
		contact.validateFirstName();
		contact.validateLastName();
		contact.validatePhone();
	}

}
