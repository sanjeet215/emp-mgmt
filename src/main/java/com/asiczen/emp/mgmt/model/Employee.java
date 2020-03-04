package com.asiczen.emp.mgmt.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee extends AuditModel {

	private static final long serialVersionUID = -7485158457327339250L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;

	@Column(name = "empid", nullable = false)
	String empId;

	@Column(name = "empfname", nullable = false)
	String empFirstName;

	@Column(name = "emplname", nullable = false)
	String empLsatName;

	@Column(name = "empEmailId", nullable = false)
	String empEmailId;

	@Column(name = "nationalId", nullable = false)
	String nationalId;

	@Column(name = "empGender", nullable = false)
	String empGender;

	Date Dob;

	Date Doj;

	String maritalStatus;

	String fatherName;

	@Column(name = "empPhoneNo", nullable = false)
	String phoneNo;

	String address;

	String city;

	String country;

	int postalCode;

	String designation;

	String workingLocation;

	String empType;

	boolean empStatus;

	@Column(name = "orgid", nullable = false)
	Long orgId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLsatName() {
		return empLsatName;
	}

	public void setEmpLsatName(String empLsatName) {
		this.empLsatName = empLsatName;
	}

	public String getEmpEmailId() {
		return empEmailId;
	}

	public void setEmpEmailId(String empEmailId) {
		this.empEmailId = empEmailId;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getEmpGender() {
		return empGender;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

	public Date getDob() {
		return Dob;
	}

	public void setDob(Date dob) {
		Dob = dob;
	}

	public Date getDoj() {
		return Doj;
	}

	public void setDoj(Date doj) {
		Doj = doj;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getWorkingLocation() {
		return workingLocation;
	}

	public void setWorkingLocation(String workingLocation) {
		this.workingLocation = workingLocation;
	}

	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
	}

	public boolean isEmpStatus() {
		return empStatus;
	}

	public void setEmpStatus(boolean empStatus) {
		this.empStatus = empStatus;
	}

	public Long getOrgId() {
		return orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empId=" + empId + ", empFirstName=" + empFirstName + ", empLsatName="
				+ empLsatName + ", empEmailId=" + empEmailId + ", nationalId=" + nationalId + ", empGender=" + empGender
				+ ", Dob=" + Dob + ", Doj=" + Doj + ", maritalStatus=" + maritalStatus + ", fatherName=" + fatherName
				+ ", phoneNo=" + phoneNo + ", address=" + address + ", city=" + city + ", country=" + country
				+ ", postalCode=" + postalCode + ", designation=" + designation + ", workingLocation=" + workingLocation
				+ ", empType=" + empType + ", empStatus=" + empStatus + ", orgId=" + orgId + "]";
	}

	public Employee() {
		super();
	}

	public Employee(Long id, String empId, String empFirstName, String empLsatName, String empEmailId,
			String nationalId, String empGender, Date dob, Date doj, String maritalStatus, String fatherName,
			String phoneNo, String address, String city, String country, int postalCode, String designation,
			String workingLocation, String empType, boolean empStatus, Long orgId) {
		super();
		this.id = id;
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLsatName = empLsatName;
		this.empEmailId = empEmailId;
		this.nationalId = nationalId;
		this.empGender = empGender;
		Dob = dob;
		Doj = doj;
		this.maritalStatus = maritalStatus;
		this.fatherName = fatherName;
		this.phoneNo = phoneNo;
		this.address = address;
		this.city = city;
		this.country = country;
		this.postalCode = postalCode;
		this.designation = designation;
		this.workingLocation = workingLocation;
		this.empType = empType;
		this.empStatus = empStatus;
		this.orgId = orgId;
	}

}
