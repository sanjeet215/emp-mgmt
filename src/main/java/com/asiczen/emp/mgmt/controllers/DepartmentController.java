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

import com.asiczen.emp.mgmt.model.Department;
import com.asiczen.emp.mgmt.security.services.DeptServiceImpl;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class DepartmentController {

	private static final Logger logger = LoggerFactory.getLogger(DepartmentController.class);
	
	@Autowired
	DeptServiceImpl deptService;
	
	/*Create/Add Department*/
	@PostMapping("/dept")
	@PreAuthorize("hasRole('ADMIN') or hasRole('MODERATOR')")
	public ResponseEntity<Department> createDepartment(@Valid @RequestBody Department dept){
		return ResponseEntity.status(HttpStatus.CREATED).body(deptService.createDepartment(dept));
		
	}
	
	/*Update/Deactivate Department*/
	
	@PutMapping("/dept/update")
	@PreAuthorize("hasRole('ADMIN') or hasRole('MODERATOR')")
	public ResponseEntity<Department> updateDepartment(@Valid @RequestBody Department dept){
		return ResponseEntity.status(HttpStatus.OK).body(deptService.updateDepartment(dept));
		
	}
	
	
	/*Get all Departments*/
	@GetMapping("/dept")
	@PreAuthorize("hasRole('ADMIN') or hasRole('MODERATOR')")
	public ResponseEntity<List<Department>> getAllDepartments(){
		return ResponseEntity.status(HttpStatus.OK).body(deptService.getAllDepartments());
	}
	
	
	/* Department for drop down based on access*/
}
