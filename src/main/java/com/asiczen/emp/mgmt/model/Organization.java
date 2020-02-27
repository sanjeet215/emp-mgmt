package com.asiczen.emp.mgmt.model;

//public class Organization {

//
//}

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Organization")
public class Organization extends AuditModel {

	private static final long serialVersionUID = 1430772540666749972L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String organizationDisplayName;

	@Column(nullable = false)
	private String organizationDescription;

	@Column(nullable = false)
	private String organizationLocation;

	@Column(nullable = false)
	private String contactPersonName;

	@Column(nullable = false)
	private String contactEmailId;

	@Column(nullable = false)
	private String organizationcontact;

	private String status;

	private String regDate;

	public Organization() {
		super();
	}

	public Organization(Long id, String organizationDisplayName, String organizationDescription,
			String organizationLocation, String contactPersonName, String contactEmailId, String organizationcontact,
			String status, String regDate) {
		super();
		this.id = id;
		this.organizationDisplayName = organizationDisplayName;
		this.organizationDescription = organizationDescription;
		this.organizationLocation = organizationLocation;
		this.contactPersonName = contactPersonName;
		this.contactEmailId = contactEmailId;
		this.organizationcontact = organizationcontact;
		this.status = status;
		this.regDate = regDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrganizationDisplayName() {
		return organizationDisplayName;
	}

	public void setOrganizationDisplayName(String organizationDisplayName) {
		this.organizationDisplayName = organizationDisplayName;
	}

	public String getOrganizationDescription() {
		return organizationDescription;
	}

	public void setOrganizationDescription(String organizationDescription) {
		this.organizationDescription = organizationDescription;
	}

	public String getOrganizationLocation() {
		return organizationLocation;
	}

	public void setOrganizationLocation(String organizationLocation) {
		this.organizationLocation = organizationLocation;
	}

	public String getContactPersonName() {
		return contactPersonName;
	}

	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}

	public String getContactEmailId() {
		return contactEmailId;
	}

	public void setContactEmailId(String contactEmailId) {
		this.contactEmailId = contactEmailId;
	}

	public String getOrganizationcontact() {
		return organizationcontact;
	}

	public void setOrganizationcontact(String organizationcontact) {
		this.organizationcontact = organizationcontact;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "Organization [id=" + id + ", organizationDisplayName=" + organizationDisplayName
				+ ", organizationDescription=" + organizationDescription + ", organizationLocation="
				+ organizationLocation + ", contactPersonName=" + contactPersonName + ", contactEmailId="
				+ contactEmailId + ", organizationcontact=" + organizationcontact + ", status=" + status + ", regDate="
				+ regDate + "]";
	}

}
