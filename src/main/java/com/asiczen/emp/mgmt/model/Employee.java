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
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;

	@Column(name = "empid", nullable = false)
	String empId;

	@Column(name = "empfname", nullable = false)
	String empFirstName;

	@Column(name = "emplname", nullable = false)
	String empLsatName;

	@Column(name = "empEmailId", nullable = true)
	String empEmailId;

	@Column(name = "nationalId", nullable = true)
	String nationalId;

	@Column(name = "empGender", nullable = true)
	String empGender;

	Date Dob;

	Date Doj;

	String maritalStatus;

	String fatherName;

	String contact_Info;

	String job_Title;

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

	public String getContact_Info() {
		return contact_Info;
	}

	public void setContact_Info(String contact_Info) {
		this.contact_Info = contact_Info;
	}

	public String getJob_Title() {
		return job_Title;
	}

	public void setJob_Title(String job_Title) {
		this.job_Title = job_Title;
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

	public String getEmpGender() {
		return empGender;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

	

}
