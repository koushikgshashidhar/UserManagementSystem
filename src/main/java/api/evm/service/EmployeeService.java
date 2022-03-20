package api.evm.service;

import java.util.List;

import api.evm.entity.Employee;

public interface EmployeeService {
	
	List <Employee> getAllEmployees();
	
	Employee saveEmployee(Employee employee);
	Employee getEmployeeById(long id);

	Employee updateEmployee(Employee employee);
	void deleteEmployeeById(long id);
}
