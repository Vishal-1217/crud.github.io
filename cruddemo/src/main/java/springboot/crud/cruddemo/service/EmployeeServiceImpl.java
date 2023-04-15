package springboot.crud.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import springboot.crud.cruddemo.deo.EmployeeDAO;
import springboot.crud.cruddemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeDAO employeeDAO;
	
	
	@Autowired
	public EmployeeServiceImpl(EmployeeDAO thEmployeeDAO) {
		employeeDAO = thEmployeeDAO;
	}
	

	@Override
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}


	@Override
	public Employee findById(int theId) {
		return employeeDAO.findById(theId);
	}

	@Transactional
	@Override
	public Employee save(Employee theEmployee) {
		return employeeDAO.save(theEmployee);
	}

	@Transactional
	@Override
	public void deletebyId(int theId) {
		employeeDAO.deletebyId(theId);
		
	}
	
	


	
	
	

}
