package com.asiczen.emp.mgmt.controllers;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asiczen.emp.mgmt.model.Employee;
import com.asiczen.emp.mgmt.security.services.EmpServiceImpl;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class EmployeeController {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	EmpServiceImpl empService;
	
	@PostMapping("/emp")
	@PreAuthorize("hasRole('ADMIN') or hasRole('MODERATOR')")
	public ResponseEntity<Employee> createEmployee(@Valid @RequestBody Employee emp){
		return ResponseEntity.status(HttpStatus.CREATED).body(empService.addNewEmployee(emp));
		
	}
	
	@GetMapping("/emp")
	@PreAuthorize("hasRole('ADMIN') or hasRole('MODERATOR')")
	public List<Employee> getAllEmployees(){
		
		//empService.testEmail();
		return empService.getAllEmployees();
	}
	
	@PutMapping("/emp/update")
	@PreAuthorize("hasRole('ADMIN') or hasRole('MODERATOR')")
	public ResponseEntity<Employee> updateDepartment(@Valid @RequestBody Employee emp){
		return ResponseEntity.status(HttpStatus.OK).body(empService.updateEmployee(emp));
		
	}
}
