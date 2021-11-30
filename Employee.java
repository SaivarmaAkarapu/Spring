package com.original.origin.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
		@Id
		private Integer id;
	    private String date_of_joining;
	    private String created_on;
	    private String updated_on;
	    private String is_active;
	    private String user_id;
	    private String dept_id;
	    
	    public Employee() {
	    	  
	    }
	 
	    public Employee(Integer id,String date_of_joining,String created_on,String updated_on,String is_active,String user_id,String dept_id)
    	{
    		this.id=id;
    		this.date_of_joining=date_of_joining;
    		this.updated_on=updated_on;
    		this.is_active=is_active;
    		this.user_id=user_id;
    		this.dept_id=dept_id;
    	}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getDate_of_joining() {
			return date_of_joining;
		}

		public void setDate_of_joining(String date_of_joining) {
			this.date_of_joining = date_of_joining;
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

		public String getUser_id() {
			return user_id;
		}

		public void setUser_id(String user_id) {
			this.user_id = user_id;
		}

		public String getDept_id() {
			return dept_id;
		}

		public void setDept_id(String dept_id) {
			this.dept_id = dept_id;
		}
}
