package com.ilp03.entity;

import java.sql.Date;

public class Purchase {
	
	private int purchase_id;
	private int request_id;
	private int employee_id;
	private  int vendor_id;
	private int billing_id;   
	private String status;
	private Date created_at;
	private Employee employee;
	private Request request;
	private Asset asset;
	private Vender vender;
	public int getPurchase_id() {
		return purchase_id;
	}
	public void setPurchase_id(int purchase_id) {
		this.purchase_id = purchase_id;
	}
	public int getRequest_id() {
		return request_id;
	}
	public void setRequest_id(int request_id) {
		this.request_id = request_id;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public int getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}
	public int getBilling_id() {
		return billing_id;
	}
	public void setBilling_id(int billing_id) {
		this.billing_id = billing_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Request getRequest() {
		return request;
	}
	public void setRequest(Request request) {
		this.request = request;
	}
	public Asset getAsset() {
		return asset;
	}
	public void setAsset(Asset asset) {
		this.asset = asset;
	}
	public Vender getVender() {
		return vender;
	}
	public void setVender(Vender vender) {
		this.vender = vender;
	}
	public Purchase(int purchase_id, int request_id, int employee_id, int vendor_id, int billing_id, String status,
			Date created_at, Employee employee, Request request, Asset asset, Vender vender) {
		super();
		this.purchase_id = purchase_id;
		this.request_id = request_id;
		this.employee_id = employee_id;
		this.vendor_id = vendor_id;
		this.billing_id = billing_id;
		this.status = status;
		this.created_at = created_at;
		this.employee = employee;
		this.request = request;
		this.asset = asset;
		this.vender = vender;
	}
	public Purchase() {
		// TODO Auto-generated constructor stub
	}
	
	
	       
}
