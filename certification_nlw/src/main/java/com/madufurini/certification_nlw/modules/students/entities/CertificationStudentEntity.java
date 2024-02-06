package com.madufurini.certification_nlw.modules.students.entities;

import java.util.List;
import java.util.UUID;

import lombok.Data; 
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;  

@Data
@AllArgsConstructor // Construtor com todos os atributos
@NoArgsConstructor //Construtor vazio
public class CertificationStudentEntity{

    private UUID id;
    private UUID studentId;
    private String technology;
    private int grade;
    List<AnswersCertificationsEntity> answersCertificationsEntities;


}