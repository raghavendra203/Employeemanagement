package com.example.employee_management.service;

	import com.example.employee_management.Employee;
	import com.example.employee_management.repository.Employeerepository;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import java.util.List;
	@Service
	public class Employeeservice {
		 @Autowired
		    private Employeerepository repo;

		    public List<Employee> getAll() {
		        return repo.findAll();
		    }

		    public void save(Employee emp) {
		        repo.save(emp);
		    }

		    public Employee get(Long id) {
		        return repo.findById(id).orElse(null);
		    }

		    public void delete(Long id) {
		        repo.deleteById(id);
		    }


}
