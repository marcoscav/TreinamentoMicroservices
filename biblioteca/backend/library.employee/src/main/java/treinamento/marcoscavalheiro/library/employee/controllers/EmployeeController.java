package treinamento.marcoscavalheiro.library.employee.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import treinamento.marcoscavalheiro.library.employee.models.Employee;
import treinamento.marcoscavalheiro.library.employee.models.dto.EmployeeDTO;
import treinamento.marcoscavalheiro.library.employee.services.EmployeeService;

@CrossOrigin(origins = "http://localhost:4200") //FIXME Habilitado somente para permitir rodar no mesmo ambiente (angular + spring ambos em localhost)
@RestController
@RequestMapping("/")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping("/add-employee")
	public ResponseEntity<Long> addEmployee(@RequestBody EmployeeDTO employee) {
		return new ResponseEntity<>(service.addEmployee(EmployeeDTO.parseDTO(employee)), HttpStatus.CREATED);
	}

	@PutMapping("/update-employee")
	public ResponseEntity<Long> updateEmployee(@RequestBody EmployeeDTO employee) {
		Long idUpdated = service.updateEmployee(EmployeeDTO.parseDTO(employee));
		if (idUpdated == null) return new ResponseEntity<>(HttpStatus.NOT_FOUND); 
		return new ResponseEntity<>(idUpdated, HttpStatus.NO_CONTENT);
	}

	@DeleteMapping("/delete-employee/{id}")
	public ResponseEntity<Void> updateEmployee(@PathVariable Long id) {
		service.deleteEmployee(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@GetMapping("/list-employee")
	public ResponseEntity<List<EmployeeDTO>> listEmployee() {
		List<Employee> result = service.listEmployee();
		List<EmployeeDTO> listResultDTO = new ArrayList<>();
		for (Employee employee : result) {
			listResultDTO.add(EmployeeDTO.parseEntity(employee));
		}
		return new ResponseEntity<>(listResultDTO, HttpStatus.OK);
	}

}
