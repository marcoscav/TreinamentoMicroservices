package treinamento.marcoscavalheiro.library.employee.services;

import java.util.List;

import org.springframework.stereotype.Service;

import treinamento.marcoscavalheiro.library.employee.models.Employee;

@Service
public interface EmployeeService {

	Long addEmployee(Employee employee);

	Long updateEmployee(Employee employee);

	void deleteEmployee(Long id);

	List<Employee> listEmployee();

}
