package com.treinamento.microservices.marcos.studentserver.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.treinamento.microservices.marcos.studentserver.dto.StudentDTO;
import com.treinamento.microservices.marcos.studentserver.entities.Student;
import com.treinamento.microservices.marcos.studentserver.repositories.StudentRepository;

@Service
public class StudentService {

	@Autowired
	public StudentRepository studentRepository;
	
	@Transactional
	public void addStudent(StudentDTO studentDTO) {
		if (isStudentValid(studentDTO)) {
			Student student = new Student();
			student.setName(studentDTO.getName());
			student.setDateOfBirth(studentDTO.getDateOfBirth());
			student.setDocumentNumber(studentDTO.getDocumentNumber());
			student.setPhoto(studentDTO.getPhoto());
			studentRepository.save(student);
		}
		
	}
	
	private boolean isStudentValid(StudentDTO studentDTO) {
		return (studentDTO.getName() != null)
				&& (studentDTO.getDateOfBirth() != null)
				&& (studentDTO.getDocumentNumber() != null);
	}
	

}
