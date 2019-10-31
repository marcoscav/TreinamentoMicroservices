package com.treinamento.microservices.marcos.studentserver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.treinamento.microservices.marcos.studentserver.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}