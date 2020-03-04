package com.asiczen.emp.mgmt.security.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiczen.emp.mgmt.exception.ResourceAlreadyExists;
import com.asiczen.emp.mgmt.exception.ResourceNotFoundException;
import com.asiczen.emp.mgmt.model.Department;
import com.asiczen.emp.mgmt.repository.DepartmentRepository;

@Service
public class DeptServiceImpl {
	
	@Autowired
	DepartmentRepository deptRepo;
	
	/* Create New Company */
	public Department createDepartment(Department dept) {
		
		if(deptRepo.existsBydeptName(dept.getDeptName()))
			throw new ResourceAlreadyExists("Department is already active in DB");
		return deptRepo.save(dept);
	}

	/* Get All Departments */
	public List<Department> getAllDepartments() {

		if (deptRepo.findAll().isEmpty()) {
			throw new ResourceNotFoundException("There are no Department registered.");
		} else {
			return deptRepo.findAll();
		}
	}
	
	/*Get Department by Id*/

	public Optional<Department> getDepartmentbyId(Long id) {

		Optional<Department> department = deptRepo.findById(id);

		if (department.isPresent())
			return department;
		else
			throw new ResourceNotFoundException("Department with department Id :" + id + "not Found");
	}

	/* Update Department */

	public Department updateDepartment(Department newDept) {

//		if (deptRepo.existsById(newDept.getDeptId())) {
//			throw new ResourceNotFoundException("Department " + newDept.getDeptId() + " not found");
//		}
		
		Optional<Department> department = deptRepo.findById(newDept.getDeptId());
		if (!department.isPresent())
			throw new ResourceNotFoundException("Department " + newDept.getDeptId() + " not found");

		return deptRepo.findById(newDept.getDeptId()).map(ndepartment -> {

			ndepartment.setDeptName(newDept.getDeptName());
			ndepartment.setDescription(newDept.getDescription());
			ndepartment.setUpdatedAt(new Date());
			return deptRepo.save(ndepartment);

		}).orElseThrow(() -> new ResourceNotFoundException("Department ID "+ newDept.getDeptId() + "not found"));

	}

}
