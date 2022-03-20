package api.evm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import api.evm.entity.Employee;
import api.evm.repository.EmployeeRepository;
import api.evm.service.EmployeeService;

@Service
public class EmployeeServiceImpl  implements EmployeeService{

	private EmployeeRepository employeeRepository;
	
	
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}



	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}



	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}



	@Override
	public Employee getEmployeeById(long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).get();
	}



	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}



	@Override
	public void deleteEmployeeById(long id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
	}

}
