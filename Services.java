package com.original.origin.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.original.origin.entity.Employee;
import com.original.origin.entity.User;
import com.original.origin.entity.Usertypes;
import com.original.origin.entity.department;
import com.original.origin.repository.DeptRepository;
import com.original.origin.repository.EmpRepository;
import com.original.origin.repository.UserRepository;
import com.original.origin.repository.UserTypeRepository;


@Service
public class Services {
	
	@Autowired
	EmpRepository emprep;
	
	@Autowired
	DeptRepository deptrep;
	
	@Autowired
	UserRepository userep;
	
	@Autowired
	UserTypeRepository usetrep;
	//Employee
	
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return emprep.findAll();
	}

	public Employee getEmployeeById(Integer employeeId) {
		// TODO Auto-generated method stub
		return emprep.getById(employeeId);
	}

	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return emprep.save(employee);
	}
	

	public ResponseEntity<Employee> updateEmployee(Integer employeeId, Employee employeeDetails) {
		// TODO Auto-generated method stub
		Employee employee = emprep.getById(employeeId);
	     
        employee.setId(employeeDetails.getId());
        employee.setDate_of_joining(employeeDetails.getDate_of_joining());
        employee.setCreated_on(employeeDetails.getCreated_on());
        employee.setUpdated_on(employeeDetails.getUpdated_on());
        employee.setIs_active(employeeDetails.getIs_active());
        employee.setUser_id(employeeDetails.getUser_id());
        employee.setDept_id(employeeDetails.getDept_id());
        final Employee updatedEmployee = emprep.save(employee);
        return ResponseEntity.ok(updatedEmployee);
	}

	public Map<String, Boolean> deleteEmployee(Integer employeeId) {
		// TODO Auto-generated method stub
		 Employee employee = emprep.getById(employeeId);
	        emprep.delete(employee);
	        Map<String, Boolean> response = new HashMap<>();
	        response.put("deleted", Boolean.TRUE);
	        return response;
	}
	
	//Department
	
	public List<department> getAllDepts() {
		// TODO Auto-generated method stub
		return deptrep.findAll();
	}
	public department getDeptById(Integer deptId) {
		// TODO Auto-generated method stub
		return deptrep.getById(deptId);
	}
	public department createDepartment(department dept) {
		// TODO Auto-generated method stub
		return deptrep.save(dept);
	}
	public ResponseEntity<department> updateDept(Integer deptId, department deptDetails) {
		// TODO Auto-generated method stub
		department depts = deptrep.getById(deptId);
	     
		depts.setId(deptDetails.getId()); 
        depts.setDept_name(deptDetails.getDept_name());
        depts.setCreated_on(deptDetails.getCreated_on());
        depts.setIs_active(deptDetails.getIs_active());
        final department updatedDept = deptrep.save(depts);
        return ResponseEntity.ok(updatedDept);
	}
	public Map<String, Boolean> deleteDept(Integer deptId) {
		// TODO Auto-generated method stub
		 department depts = deptrep.getById(deptId);
	        deptrep.delete(depts);
	        Map<String, Boolean> response = new HashMap<>();
	        response.put("deleted", Boolean.TRUE);
	        return response;
	}
	
	// User
	public List<User> getAllUsers(){
		return userep.findAll();
	}
	public User getUserById(String  name) {
		return userep.getById(name);
	}
	public User createuser(User user)
	{
		return userep.save(user);
	}
	public ResponseEntity<User> updateUser(String uname, User udetails) {
		// TODO Auto-generated method stub
		User user = userep.getById(uname);
	     
		user.setName(udetails.getName());
		user.setAge(udetails.getAge());
		user.setDate_of_birth(udetails.getDate_of_birth());
		user.setUser_name(udetails.getUser_name());
		user.setPassword(udetails.getPassword());
		user.setUser_type_id(udetails.getUser_type_id());
		user.setIs_active(udetails.getIs_active());
		user.setCreated_on(udetails.getCreated_on());
		user.setUpdated_on(udetails.getUpdated_on());
        final User updatedUser = userep.save(user);
        return ResponseEntity.ok(updatedUser);
	}
	public Map<String, Boolean> deleteUser(String name) {
		// TODO Auto-generated method stub
		 User user = userep.getById(name);
	        userep.delete(user);
	        Map<String, Boolean> response = new HashMap<>();
	        response.put("deleted", Boolean.TRUE);
	        return response;
	}
	
	//User Types
	
	public List<Usertypes> getAllUserstypes(){
		return usetrep.findAll();
	}
	public Usertypes getUsertById(Integer  utid) {
		return usetrep.getById(utid);
	}
	public Usertypes createuserty(Usertypes usert)
	{
		return usetrep.save(usert);
	}
	public ResponseEntity<Usertypes> updateUsert(Integer utId, Usertypes utdtails) {
		// TODO Auto-generated method stub
		Usertypes usert = usetrep.getById(utId);
	    
		usert.setId(utdtails.getId());
		usert.setUser_type_name(utdtails.getUser_type_name());
		usert.setCreated_on(utdtails.getCreated_on());
		usert.setUpdated_on(utdtails.getUpdated_on());
		usert.setIs_active(utdtails.getIs_active());
        final Usertypes updatedUsert = usetrep.save(usert);
        return ResponseEntity.ok(updatedUsert);
	}
	public Map<String, Boolean> deleteUsert(Integer utId) {
		// TODO Auto-generated method stub
		 Usertypes usert = usetrep.getById(utId);
	        usetrep.delete(usert);
	        Map<String, Boolean> response = new HashMap<>();
	        response.put("deleted", Boolean.TRUE);
	        return response;
	}
}
