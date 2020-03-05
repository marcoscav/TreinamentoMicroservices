package treinamento.marcoscavalheiro.library.employee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import treinamento.marcoscavalheiro.library.employee.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
