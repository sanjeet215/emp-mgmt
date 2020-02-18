package com.asiczen.emp.mgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asiczen.emp.mgmt.model.Empinout;

@Repository
public interface EmpinoutRepository extends JpaRepository<Empinout,Long>{

}
