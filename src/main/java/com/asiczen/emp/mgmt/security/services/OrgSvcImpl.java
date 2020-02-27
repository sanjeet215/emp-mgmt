package com.asiczen.emp.mgmt.security.services;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiczen.emp.mgmt.exception.ResourceAlreadyExists;
import com.asiczen.emp.mgmt.exception.ResourceNotFoundException;
import com.asiczen.emp.mgmt.model.Organization;
import com.asiczen.emp.mgmt.repository.OrganizationRepository;

@Service
public class OrgSvcImpl {

	@Autowired
	OrganizationRepository orgRepo;
	
	private static final Logger logger = LoggerFactory.getLogger(OrgSvcImpl.class);

	/* Create New Company */
	public Organization createOrganization(Organization org) {
		
		if(orgRepo.existsByorganizationDisplayName(org.getOrganizationDisplayName()))
			throw new ResourceAlreadyExists("Company is already active in DB");
			
		return orgRepo.save(org);
	}

	/* Get All Organizations */
	public List<Organization> getAllOrganization() {

		if (orgRepo.findAll().isEmpty()) {
			throw new ResourceNotFoundException("There are no company registered.");
		} else {
			return orgRepo.findAll();
		}
	}

	public Optional<Organization> getOrganizationbyId(Long id) {

		Optional<Organization> organization = orgRepo.findById(id);

		if (organization.isPresent())
			return organization;
		else
			throw new ResourceNotFoundException("Company with Company Id :" + id + "not Found");
	}

	/* Update Company */

	public Organization updateCompany(Organization newCompany) {

//		if (orgRepo.existsById(newCompany.getId())) {
//			throw new ResourceNotFoundException("Company " + newCompany.getId() + " not found");
//		}

		Optional<Organization> organization = orgRepo.findById(newCompany.getId());
		
		if (! organization.isPresent())
			throw new ResourceNotFoundException("Organization with Id :" + newCompany.getId() + " not Found");
		
		return orgRepo.findById(newCompany.getId()).map(company -> {

			company.setOrganizationDisplayName(newCompany.getOrganizationDisplayName());
			company.setContactEmailId(newCompany.getContactEmailId());
			company.setOrganizationcontact(newCompany.getOrganizationcontact());
			company.setOrganizationDescription(newCompany.getOrganizationDescription());
			company.setContactPersonName(newCompany.getContactPersonName());
			company.setOrganizationLocation((newCompany.getOrganizationLocation()));
			company.setStatus(newCompany.getStatus());

			return orgRepo.save(company);

		}).orElseThrow(() -> new ResourceNotFoundException("Orgnization Id : "+ newCompany.getId() + "not found"));

	}
}