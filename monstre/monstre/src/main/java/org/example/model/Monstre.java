package org.example.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data  // Génère automatiquement les getters, setters, toString(), equals(), hashCode()
@AllArgsConstructor  // Génère un constructeur avec tous les attributs
@NoArgsConstructor   // Génère un constructeur vide
@Document(collection = "monstres") // Collection MongoDB
public class Monstre {

    @Id  // Clé primaire MongoDB (générée automatiquement)
    private String id;

    private String nom;
    private String typeElementaire; // Ex: Feu, Eau, Vent
    private int hp;    // Points de vie
    private int atk;   // Attaque
    private int def;   // Défense
    private int vit;   // Vitesse
    private int niveau = 1;
    private int experience = 0;
    private List<Competence> competences ;

    public Monstre (String id) {
        this.id=id;
    }
 
}