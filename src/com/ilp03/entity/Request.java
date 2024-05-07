package com.ilp03.entity;

import java.sql.Date;

public class Request {
	          int request_id; 
			  String asset_title ;
			  int asset_count;
			  public Request(int request_id, String asset_title, int asset_count, Date asset_life, int employee_id,
					Date created_at) {
				super();
				this.request_id = request_id;
				this.asset_title = asset_title;
				this.asset_count = asset_count;
				this.asset_life = asset_life;
				this.employee_id = employee_id;
				this.created_at = created_at;
			}
			public Request() {
				// TODO Auto-generated constructor stub
			}
			Date asset_life;
			  int employee_id;
			  Date created_at;
			public int getRequest_id() {
				return request_id;
			}
			public void setRequest_id(int request_id) {
				this.request_id = request_id;
			}
			public String getAsset_title() {
				return asset_title;
			}
			public void setAsset_title(String asset_title) {
				this.asset_title = asset_title;
			}
			public int getAsset_count() {
				return asset_count;
			}
			public void setAsset_count(int asset_count) {
				this.asset_count = asset_count;
			}
			public Date getAsset_life() {
				return asset_life;
			}
			public void setAsset_life(Date asset_life) {
				this.asset_life = asset_life;
			}
			public int getEmployee_id() {
				return employee_id;
			}
			public void setEmployee_id(int employee_id) {
				this.employee_id = employee_id;
			}
			public Date getCreated_at() {
				return created_at;
			}
			public void setCreated_at(Date created_at) {
				this.created_at = created_at;
			}

}
