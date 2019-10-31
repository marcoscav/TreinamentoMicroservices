package com.treinamento.microservices.marcos.studentserver.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TB_STUDENT", schema = "DBO")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_STUDENT", nullable = false, unique = true)
	private Long id;

	@Column(name = "DS_NAME", nullable = false) 
	private String name;

	@Column(name = "DT_DATEBIRTH", nullable = false)
	private Long dateOfBirth;

	@Column(name = "NU_DOCUMENT", nullable = false)
	private String documentNumber;

	@Column(name = "BT_PHOTO", nullable = true)
	private byte[] photo;
}