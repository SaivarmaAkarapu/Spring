package com.original.origin.controller;
import java.util.List;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.original.origin.entity.Employee;
import com.original.origin.entity.User;
import com.original.origin.entity.Usertypes;
import com.original.origin.entity.department;
import com.original.origin.service.Services;


@RestController
public class MyController {
	    @Autowired
	    private Services serv;

	    //Employee
	    
	    @GetMapping("/emp")
	    public List<Employee> getAllEmployees() {
	        return this.serv.getAllEmployees();
	    }
	    @GetMapping("/emp/{id}")
	    public Employee getEmployeeById(@PathVariable(value = "id") Integer employeeId){
	    	 return this.serv.getEmployeeById(employeeId);
	    }

		@PostMapping("/emp")
	    public Employee createEmployee( @RequestBody Employee employee) {
	        return this.serv.createEmployee(employee);
	    }
	    @PutMapping("/emp/{id}")
	    public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Integer employeeId,
	        @RequestBody Employee employeeDetails)  {
	    	return  this.serv.updateEmployee(employeeId, employeeDetails);
	    }
	    @DeleteMapping("/emp/{id}")
	    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Integer employeeId)
	    {
	       return this.serv.deleteEmployee(employeeId);
	    }
	    
	    //Departments
	     
	    @GetMapping("/dept")
	    public List<department> getAl(){
	    	return this.serv.getAllDepts();
	    }
	    @GetMapping("/dept/{id}")
	    public department getDeptById(@PathVariable(value= "id") Integer deptId)
	    {
	    	return this.serv.getDeptById(deptId);
	    }
	    @PostMapping("/dept")
	    public department createDepartment(@RequestBody department dept)
	    {
	    	return this.serv.createDepartment(dept);
	    }
	    @PutMapping("/dept/{id}")
	    public ResponseEntity<department> updateDept(@PathVariable(value = "id") Integer deptId,
		        @RequestBody department deptDetails){
	    	return this.serv.updateDept(deptId, deptDetails);
	    }
	    @DeleteMapping("/dept/{id}")
	    public Map<String, Boolean> deleteDept(@PathVariable(value = "id") Integer deptId){
	    	return this.serv.deleteDept(deptId);
	    }
	    
	    //Users
	    
	    @GetMapping("/user")
	    public List<User> getAllu(){
	    	return this.serv.getAllUsers();
	    }
	    @GetMapping("/user/{id}")
	    public User getUBI(@PathVariable(value="id") String name) {
	    	return this.serv.getUserById(name);
	    }
	    @PostMapping("/user")
	    public User createUser(@RequestBody User user)
	    {
	    	return this.serv.createuser(user);
	    }
	    @PutMapping("/user/{name}")
	    public ResponseEntity<User> updateu(@PathVariable(value ="name") String uname,
	    		@RequestBody User udetails)
	    {
	    	return this.serv.updateUser(uname, udetails);
	    }
	    @DeleteMapping("user/{name}")
	    public Map<String, Boolean> deleteu(@PathVariable(value = "name") String uname){
	    	return this.serv.deleteUser(uname);
	    }
	    
	    //UserTypes
	    
	    @GetMapping("/uset")
	    public List<Usertypes> getallut(){
	    	return this.serv.getAllUserstypes();
	    }
	    @GetMapping("/uset/{id}")
	    public Usertypes getutById(@PathVariable(value="id") Integer id) {
	    	return this.serv.getUsertById(id);
	    }
	    @PostMapping("/uset")
	    public Usertypes createUsert(@RequestBody Usertypes usert)
	    {
	    	return this.serv.createuserty(usert);
	    }
	    @PutMapping("/uset/{id}")
	    public ResponseEntity<Usertypes> updateusert(@PathVariable(value ="id") Integer id,
	    		@RequestBody Usertypes udtails)
	    {
	    	return this.serv.updateUsert(id, udtails);
	    }
	    @DeleteMapping("/uset/{id}")
	    public Map<String, Boolean> deleteut(@PathVariable(value = "id") Integer id){
	    	return this.serv.deleteUsert(id);
	    }
}
