package com.madufurini.certification_nlw.modules.students.entities;

import java.util.List;
import java.util.UUID;

import lombok.Data; 
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;  

@Data
@AllArgsConstructor // Construtor com todos os atributos
@NoArgsConstructor //Construtor vazio
public class StudentEntity{

    private UUID id;
    private String email;
    private List<CertificationStudentEntity> certificationStudentEntity;

}