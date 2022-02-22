package com.simplilearn.skillmap.dao;

import java.util.List;

import com.simplilearn.skillmap.entity.Employee;

public interface EmployeeDao {

	public boolean addEmployee(Employee employee);

	public boolean updateEmployee(Employee employee);

	public boolean deleteEmployee(int employeeId);

	public boolean approveEmployee(int employeeId);

	public Employee getEmployeeById(int employeeId);

	public Employee getEmployeeByApproval(boolean flag);

	public List<Employee> getAllEmployeeDetails();

	public boolean validateEmployee(String employeeEmail, String employeePassword);
}