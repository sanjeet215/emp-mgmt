package com.asiczen.emp.mgmt.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asiczen.emp.mgmt.model.Employee;
import com.asiczen.emp.mgmt.security.services.EmpServiceImpl;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/mod")
public class ModControllers {
	
	private static final Logger logger = LoggerFactory.getLogger(ModControllers.class);
	
	@Autowired
	EmpServiceImpl empService;
	
	
	@GetMapping("/getallemp")
	@PreAuthorize("hasRole('ADMIN') or hasRole('MODERATOR')")
	public List<Employee> getAllEmployees(){
		empService.addEmp();
		return empService.getAllEmployees();
	}
	

}
