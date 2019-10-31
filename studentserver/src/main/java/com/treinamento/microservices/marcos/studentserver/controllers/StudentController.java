package com.treinamento.microservices.marcos.studentserver.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treinamento.microservices.marcos.studentserver.dto.StudentDTO;
import com.treinamento.microservices.marcos.studentserver.services.StudentService;

@RestController
@RequestMapping("/")
public class StudentController {

	@Autowired
	public StudentService studentService;

	@Autowired
	private Environment env;

	@GetMapping("/")
	public String home() {
		return "Student service running at port: " + env.getProperty("local.server.port");
	}

	@PostMapping("/addStudent")
	public void addStudent(@RequestBody(required = true) StudentDTO studentDTO) {
		studentService.addStudent(studentDTO);
	}
}