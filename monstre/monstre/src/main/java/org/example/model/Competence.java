package org.example.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data  // Génère automatiquement les getters, setters, toString(), equals(), hashCode()
@AllArgsConstructor  // Génère un constructeur avec tous les attributs
@NoArgsConstructor   // Génère un constructeur vide
public class Competence {

    @Id
    private String id;

    private String nom;
    private String degatsBase; 
    private String degaSup;   
    private int cooldown; 
    private int niveauAmelioration;  
    private int niveauAmeliorationMax;

}