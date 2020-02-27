package com.asiczen.emp.mgmt.security.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiczen.emp.mgmt.exception.ResourceNotFoundException;
import com.asiczen.emp.mgmt.model.Department;
import com.asiczen.emp.mgmt.model.Employee;
import com.asiczen.emp.mgmt.repository.EmployeeRepository;

@Service
public class EmpServiceImpl {

	@Autowired
	EmployeeRepository empRepo;
	
	/* Get All Employees */
	public List<Employee> getAllEmployees() {

		if (empRepo.findAll().isEmpty()) {
			throw new ResourceNotFoundException("There are no employees Present in DB");
		} else {
			return empRepo.findAll();
		}
	}
	
	/* Add new Employee */
	
	public Employee addNewEmployee(Employee emp) {
		//empRepo.deleteAll();
		
		return empRepo.save(emp);
	}
	
	/*Update Employee */
	
	
	/* delete Employee */
	public void deleteEmployee(Employee emp) {
		empRepo.delete(emp);
	}
	
	// Add one Employee for Testing
	
	public void addEmp() {
		Employee emp = new Employee();
		
		emp.setEmpId("az12345");
		emp.setEmpFirstName("Test");
		emp.setEmpLsatName("test");
		emp.setEmpEmailId("test@gmail.com");
		emp.setNationalId("Tetss");
		emp.setEmpGender("test");
		emp.setOrgId(23L);
		empRepo.save(emp);
		
		
		
	}
	
	
}
