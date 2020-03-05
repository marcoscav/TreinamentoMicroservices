package treinamento.marcoscavalheiro.library.employee.models.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import treinamento.marcoscavalheiro.library.employee.models.Employee;

@Getter
@Setter
public class EmployeeDTO implements Serializable {

	private static final long serialVersionUID = 8253410897801401709L;

	private Long id;

	private String firstName;

	private String lastName;

	private Integer documentNumber;

	public static Employee parseDTO(EmployeeDTO dto) {
		Employee employee = new Employee();
		employee.setId(dto.getId());
		employee.setFirstName(dto.getFirstName());
		employee.setLastName(dto.getLastName());
		employee.setDocumentNumber(dto.getDocumentNumber());
		return employee;
	}

	public static EmployeeDTO parseEntity(Employee employee) {
		EmployeeDTO dto = new EmployeeDTO();
		dto.setId(employee.getId());
		dto.setFirstName(employee.getFirstName());
		dto.setLastName(employee.getLastName());
		dto.setDocumentNumber(employee.getDocumentNumber());
		return dto;
	}

}
