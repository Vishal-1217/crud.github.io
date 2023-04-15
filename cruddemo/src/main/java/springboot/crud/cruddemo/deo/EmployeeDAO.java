package springboot.crud.cruddemo.deo;

import java.util.List;

import springboot.crud.cruddemo.entity.Employee;

public interface EmployeeDAO {
	List<Employee> findAll();
	
	Employee findById(int theId);
	
	Employee save (Employee theEmployee);
	
	void deletebyId(int theId);

}
