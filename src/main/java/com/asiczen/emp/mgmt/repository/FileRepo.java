package com.asiczen.emp.mgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asiczen.emp.mgmt.model.FileProp;

@Repository
public interface FileRepo extends JpaRepository<FileProp,Long>{

}
