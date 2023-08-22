package com.nt.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nt.model.Department;

@Repository
public class DepartmentRepository {

	private List<Department> departments = new ArrayList<>();

	public Department addDepartment(Department department) {
		departments.add(department);
		return department;
	}

	public Department findById(long id) {
		return departments.stream().filter(department -> department.getId().equals(id)).findFirst().orElseThrow();
	}

	public List<Department> findAll() {
		return departments;
	}
}
