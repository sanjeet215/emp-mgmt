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

	public Organization(Long id, String organizationDisplayName, String organizationDescription, String organizationLocation,
			String contactPersonName, String contactEmailId, String organizationcontact) {
		super();
		this.id = id;
		this.organizationDisplayName = organizationDisplayName;
		this.organizationDescription = organizationDescription;
		this.organizationLocation = organizationLocation;
		this.contactPersonName = contactPersonName;
		this.contactEmailId = contactEmailId;
		this.organizationcontact = organizationcontact;
	}

	public Organization() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getorganizationDisplayName() {
		return organizationDisplayName;
	}

	public void setorganizationDisplayName(String organizationDisplayName) {
		this.organizationDisplayName = organizationDisplayName;
	}

	public String getorganizationDescription() {
		return organizationDescription;
	}

	public void setorganizationDescription(String organizationDescription) {
		this.organizationDescription = organizationDescription;
	}

	public String getorganizationLocation() {
		return organizationLocation;
	}

	public void setorganizationLocation(String organizationLocation) {
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

	public String getorganizationcontact() {
		return organizationcontact;
	}

	public void setorganizationcontact(String organizationcontact) {
		this.organizationcontact = organizationcontact;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "organization [id=" + id + ", organizationDisplayName=" + organizationDisplayName + ", organizationDescription="
				+ organizationDescription + ", organizationLocation=" + organizationLocation + ", contactPersonName="
				+ contactPersonName + ", contactEmailId=" + contactEmailId + ", organizationcontact=" + organizationcontact + "]";
	}

}
