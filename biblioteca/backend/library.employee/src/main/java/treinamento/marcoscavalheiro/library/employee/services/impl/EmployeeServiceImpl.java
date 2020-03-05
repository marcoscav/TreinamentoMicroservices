package treinamento.marcoscavalheiro.library.employee.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import treinamento.marcoscavalheiro.library.employee.models.Employee;
import treinamento.marcoscavalheiro.library.employee.repositories.EmployeeRepository;
import treinamento.marcoscavalheiro.library.employee.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@Override
	public Long addEmployee(Employee employee) {
		return repository.save(employee).getId();
	}

	@Override
	public Long updateEmployee(Employee employee) {
		Optional<Employee> optionalEmployee = repository.findById(employee.getId());
		if (optionalEmployee.isPresent()) {
			Employee originalEmployee = optionalEmployee.get();
			if (employee.getFirstName() != null) originalEmployee.setFirstName(employee.getFirstName());
			if (employee.getLastName() != null) originalEmployee.setLastName(employee.getLastName());
			if (employee.getDocumentNumber() != null) originalEmployee.setDocumentNumber(employee.getDocumentNumber());
			return repository.save(originalEmployee).getId();
		}
		return null;
	}

	@Override
	public void deleteEmployee(Long id) {
		repository.deleteById(id);
	}

	@Override
	public List<Employee> listEmployee() {
		return repository.findAll();
	}

}
