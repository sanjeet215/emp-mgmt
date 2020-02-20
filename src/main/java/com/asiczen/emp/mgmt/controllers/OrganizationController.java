package com.asiczen.emp.mgmt.controllers;

import java.util.Date;
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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asiczen.emp.mgmt.model.Organization;
import com.asiczen.emp.mgmt.security.services.OrgSvcImpl;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class OrganizationController {

	private static final Logger logger = LoggerFactory.getLogger(OrganizationController.class);
	
	@Autowired
	OrgSvcImpl orgService;
	
	
	@PostMapping("/org/create")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<Organization> createDepartment(@Valid @RequestBody Organization org){
		org.setCreatedAt(new Date());
		org.setUpdatedAt(new Date());
		return ResponseEntity.status(HttpStatus.CREATED).body(orgService.createOrganization(org));
		
	}
	
	@GetMapping("/org")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<List<Organization>> getAllCompanies(){
		return ResponseEntity.status(HttpStatus.OK).body(orgService.getAllOrganization());
	}
	
}
