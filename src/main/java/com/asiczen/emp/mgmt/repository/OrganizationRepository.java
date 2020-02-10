package com.asiczen.emp.mgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asiczen.emp.mgmt.model.Organization;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long> {

	Organization findByorganizationDisplayName(String name);

	boolean existsByorganizationDisplayName(String orgname);
}
