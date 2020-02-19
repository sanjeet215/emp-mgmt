package com.asiczen.emp.mgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asiczen.emp.mgmt.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
