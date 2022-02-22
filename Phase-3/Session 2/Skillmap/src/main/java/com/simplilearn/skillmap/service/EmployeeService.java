package com.simplilearn.skillmap.service;

import java.util.List;

import com.simplilearn.skillmap.entity.Employee;

public interface EmployeeService {

	public boolean addEmployee(Employee employee);

	public boolean updateEmployee(Employee employee);

	public boolean deleteEmployee(int employeeId);

	public Employee getEmployeeById(int employeeId);

	public List<Employee> getAllEmployeeDetails();
}