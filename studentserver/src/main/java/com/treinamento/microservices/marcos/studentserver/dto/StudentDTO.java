package com.treinamento.microservices.marcos.studentserver.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDTO implements Serializable {

	private static final long serialVersionUID = 1597364045401183359L;
	
	private String name;
	
	private Long dateOfBirth;
	
	private String documentNumber;
	
	private byte[] photo;
	
}