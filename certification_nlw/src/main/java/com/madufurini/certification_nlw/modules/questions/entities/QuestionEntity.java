package com.madufurini.certification_nlw.modules.questions.entities;


import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data; 
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;  
import java.util.List;

import com.madufurini.certification_nlw.modules.questions.entities.AlternativesEntity;

@Data
@AllArgsConstructor // Construtor com todos os atributos
@NoArgsConstructor //Construtor vazio
@Entity(name = "questions")
public class QuestionEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(length = 50)
    private String technology;

    private String description;

    @OneToMany
    @JoinColumn(name = "question_id")
    private List<AlternativesEntity> alternatives;

    @CreationTimestamp
    private LocalDateTime createdAt;
}