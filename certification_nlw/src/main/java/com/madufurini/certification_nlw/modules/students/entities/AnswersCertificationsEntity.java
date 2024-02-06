package com.madufurini.certification_nlw.modules.students.entities;

import java.util.UUID;

import lombok.Data; 
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;  

@Data
@AllArgsConstructor // Construtor com todos os atributos
@NoArgsConstructor //Construtor vazio
public class AnswersCertificationsEntity{
    
    private UUID id;
    private UUID certificationId;
    private UUID studentId;
    private UUID questionID;
    private UUID answerID;
    private boolean isCorrect;

}