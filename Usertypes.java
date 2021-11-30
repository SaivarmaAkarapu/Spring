package com.original.origin.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "usertypes")
public class Usertypes {
	@Id
	Integer id;
	String user_type_name;
	String created_on;
	String updated_on;
	String is_active;
	public Usertypes() {
	
	}
	public Usertypes(Integer id, String user_type_name, String created_on, String updated_on, String is_active) {
		super();
		this.id = id;
		this.user_type_name = user_type_name;
		this.created_on = created_on;
		this.updated_on = updated_on;
		this.is_active = is_active;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUser_type_name() {
		return user_type_name;
	}
	public void setUser_type_name(String user_type_name) {
		this.user_type_name = user_type_name;
	}
	public String getCreated_on() {
		return created_on;
	}
	public void setCreated_on(String created_on) {
		this.created_on = created_on;
	}
	public String getUpdated_on() {
		return updated_on;
	}
	public void setUpdated_on(String updated_on) {
		this.updated_on = updated_on;
	}
	public String getIs_active() {
		return is_active;
	}
	public void setIs_active(String is_active) {
		this.is_active = is_active;
	} 

}
