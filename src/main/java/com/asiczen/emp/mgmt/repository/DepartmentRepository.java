package com.asiczen.emp.mgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asiczen.emp.mgmt.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long>{
	
	Department findBydeptName(String name);

	boolean existsBydeptName(String orgname);
}

