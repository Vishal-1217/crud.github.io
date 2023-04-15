package springboot.crud.cruddemo.service;

import java.util.List;

import springboot.crud.cruddemo.entity.Employee;

public interface EmployeeService {

	List<Employee>findAll();
	
	Employee findById(int theId);
	
	Employee save (Employee theEmployee);
	
	void deletebyId(int theId);

}
