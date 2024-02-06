package com.madufurini.certification_nlw.modules.students.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired; 


import com.madufurini.certification_nlw.modules.students.dto.VerifyIfHasCertificationDTO;
import com.madufurini.certification_nlw.modules.students.usecases.VerifyIfHasCertificationUseCase;


@RestController
@RequestMapping("/students")
public class StudentController{

    //Preciso usar meu USECASE
    //Preciso instanciar meu use case
    @Autowired //Gerenciar e instanciar meu useCase
    private VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;

    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody VerifyIfHasCertificationDTO verifyIfHasCertificationDTO) // Receber um objeto 
{
        //Email e tecnologia 

        var result = this.verifyIfHasCertificationUseCase.execute(verifyIfHasCertificationDTO);
        if (result){
            return "Usuário já fez a prova";
        }
        //Mostrar no terminal
        System.out.println(verifyIfHasCertificationDTO);
        return "Usuário pode fazer a prova";
    }

}