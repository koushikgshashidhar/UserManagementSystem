package api.evm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import api.evm.entity.Employee;
import api.evm.service.EmployeeService;

@Controller
public class EmployeeController {

	private EmployeeService employeeservice;

	public EmployeeController(EmployeeService employeeservice) {
		super();
		this.employeeservice = employeeservice;
	}
	
	@GetMapping("/employees")
	public  String listEmployee(Model model)
	{
		model.addAttribute("employees",employeeservice.getAllEmployees());
		return "employee";
	}
	
	@GetMapping("employee/new")
	public  String createEmployeeform(Model model)
	{
		Employee employee= new Employee();
		model.addAttribute("employee", employee);
		return "createEmployee";
	}
	
	@PostMapping("employees")
	public  String saveEmployee(@ModelAttribute("employee") Employee employee)
	{
		employeeservice.saveEmployee(employee);
		return "redirect:/employees";
	}
	
	@GetMapping("/employees/edit/{id}")
	public  String editEmployeeform(@PathVariable long id, Model model)
	{
		model.addAttribute("employee", employeeservice.getEmployeeById(id));
		return "editEmployee";
	}
	
	
	@PostMapping("/employees/{id}")
	public  String updateEmployee(@PathVariable long id,@ModelAttribute("employee") Employee employee,Model model)
	{
		Employee existingEmployee=employeeservice.getEmployeeById(id);
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());
		
		employeeservice.updateEmployee(existingEmployee);
		
		return "redirect:/employees";
	}
	
	@GetMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable long id)
	{
		employeeservice.deleteEmployeeById(id);
		return "redirect:/employees";
	}
	
}
