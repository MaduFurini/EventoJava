package com.madufurini.certification_nlw.modules.students.dto;

import lombok.Data; 
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;  

@Data
@AllArgsConstructor // Construtor com todos os atributos
@NoArgsConstructor //Construtor vazio
public class VerifyIfHasCertificationDTO{

    private String email;
    private String technology;

}