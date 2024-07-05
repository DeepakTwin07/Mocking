package com.bikkadIt.model;

public class Contact {

	private Integer contactId;
	private String contactname;
	private long contactNumber;
	
	public Integer getContactId() {
		return contactId;
	}
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	public String getContactname() {
		return contactname;
	}
	public void setContactname(String contactname) {
		this.contactname = contactname;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", contactname=" + contactname + ", contactNumber=" + contactNumber
				+ "]";
	}
	
	
	
	
	
}
