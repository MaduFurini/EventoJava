package com.madufurini.certification_nlw.modules.students.usecases;

import org.springframework.stereotype.Service;

import com.madufurini.certification_nlw.modules.students.dto.VerifyIfHasCertificationDTO;

@Service
public class VerifyIfHasCertificationUseCase { //Regra de negócio

    public boolean execute(VerifyIfHasCertificationDTO dto){
    if ("teste@teste.com".equals(dto.getEmail()) && "JAVA".equals(dto.getTechnology())) {
            return true;
        }

        return false;
    }

}