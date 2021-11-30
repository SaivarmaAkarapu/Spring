package com.original.origin.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class department {
	@Id
	private Integer id;
	private String dept_name;
	private String created_on;
	private String is_active;
	
	public department()
	{
		
	}
	public department(Integer id,String dept_name,String created_on,String is_active) {
		this.id=id;
		this.dept_name=dept_name;
		this.created_on=created_on;
		this.is_active=is_active;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public String getCreated_on() {
		return created_on;
	}
	public void setCreated_on(String created_on) {
		this.created_on = created_on;
	}
	public String getIs_active() {
		return is_active;
	}
	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}
	
}
