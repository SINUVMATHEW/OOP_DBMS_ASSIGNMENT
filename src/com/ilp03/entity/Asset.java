package com.ilp03.entity;

import java.sql.Date;

public class Asset {
	private int asset_id;
	private int type_id;
	private int purchase_id;
	private Date created_at;
	private int managed_by;
	public int getAsset_id() {
		return asset_id;
	}
	public void setAsset_id(int asset_id) {
		this.asset_id = asset_id;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public int getPurchase_id() {
		return purchase_id;
	}
	public void setPurchase_id(int purchase_id) {
		this.purchase_id = purchase_id;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public int getManaged_by() {
		return managed_by;
	}
	public void setManaged_by(int managed_by) {
		this.managed_by = managed_by;
	}
	public Asset(int asset_id, int type_id, int purchase_id, Date created_at, int managed_by) {
		super();
		this.asset_id = asset_id;
		this.type_id = type_id;
		this.purchase_id = purchase_id;
		this.created_at = created_at;
		this.managed_by = managed_by;
	}
	public Asset() {
		// TODO Auto-generated constructor stub
	}
	
}
