package api.evm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import api.evm.entity.Employee;
import api.evm.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeVaccineManagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EmployeeVaccineManagementApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeerepository ;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/*Employee emp1 =new Employee("koushik","G","kgs@gmail.com");
		employeerepository.save(emp1);
		
		Employee emp2 =new Employee("Aalok","yadav","Aalok@gmail.com");
		employeerepository.save(emp2);
		
		Employee emp3 =new Employee("Sanjay","S","Aalok@gmail.com");
		employeerepository.save(emp3);
		*/
	}

}
