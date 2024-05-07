package com.ilp03.entity;

import java.sql.Date;

public class Employee {
			  int employee_id ;
			  String username;
			  String password;
			  Date created_at;
			  int created_by;
			  public Employee(int employee_id, String username, String password, Date created_at, int created_by,
					int updated_by) {
				super();
				this.employee_id = employee_id;
				this.username = username;
				this.password = password;
				this.created_at = created_at;
				this.created_by = created_by;
				this.updated_by = updated_by;
			}
			public Employee() {
				// TODO Auto-generated constructor stub
			}
			int updated_by;
			public int getEmployee_id() {
				return employee_id;
			}
			public void setEmployee_id(int employee_id) {
				this.employee_id = employee_id;
			}
			public String getUsername() {
				return username;
			}
			public void setUsername(String username) {
				this.username = username;
			}
			public String getPassword() {
				return password;
			}
			public void setPassword(String password) {
				this.password = password;
			}
			public Date getCreated_at() {
				return created_at;
			}
			public void setCreated_at(Date created_at) {
				this.created_at = created_at;
			}
			public int getCreated_by() {
				return created_by;
			}
			public void setCreated_by(int created_by) {
				this.created_by = created_by;
			}
			public int getUpdated_by() {
				return updated_by;
			}
			public void setUpdated_by(int updated_by) {
				this.updated_by = updated_by;
			}

}
