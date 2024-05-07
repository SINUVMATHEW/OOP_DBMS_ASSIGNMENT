package com.ilp03.entity;

public class Vender {
	public Vender(int vendor_id, String vendorName, long vendorContact) {
		super();
		this.vendor_id = vendor_id;
		this.vendorName = vendorName;
		this.vendorContact = vendorContact;
	}
	public Vender() {
		// TODO Auto-generated constructor stub
	}
	int vendor_id;
	String vendorName;
	long vendorContact;
	public int getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public long getVendorContact() {
		return vendorContact;
	}
	public void setVendorContact(long vendorContact) {
		this.vendorContact = vendorContact;
	}

}
