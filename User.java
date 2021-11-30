package com.original.origin.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Userr")
public class User {
	@Id
	private String name;
	private Integer age;
	private String date_of_birth;
	private String user_name;
	private String password;
	private String user_type_id;
	private String is_active;
	private String created_on;
	private String updated_on;
	

	public User() {
	
	}
	public User(String name, Integer age, String date_of_birth, String user_name, String password, String user_type_id,String is_active, String created_on, String updated_on) {
		this.name = name;
		this.age = age;
		this.date_of_birth = date_of_birth;
		this.user_name = user_name;
		this.password = password;
		this.user_type_id = user_type_id;
		this.is_active = is_active;
		this.created_on = created_on;
		this.updated_on = updated_on;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser_type_id() {
		return user_type_id;
	}
	public void setUser_type_id(String user_type_id) {
		this.user_type_id = user_type_id;
	}
	public String getIs_active() {
		return is_active;
	}
	public void setIs_active(String is_active) {
		this.is_active = is_active;
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
}