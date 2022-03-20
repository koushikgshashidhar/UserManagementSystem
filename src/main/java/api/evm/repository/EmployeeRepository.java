package api.evm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import api.evm.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
