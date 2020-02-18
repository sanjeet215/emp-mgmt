package com.asiczen.emp.mgmt.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiczen.emp.mgmt.model.Empinout;
import com.asiczen.emp.mgmt.repository.EmpinoutRepository;

@Service
public class EmpinoutServicImpl {

	@Autowired
	EmpinoutRepository emplogrepo;
	
	public Empinout storeEmpInOut(Empinout empinout) {
		return emplogrepo.save(empinout);
	}
	
}
