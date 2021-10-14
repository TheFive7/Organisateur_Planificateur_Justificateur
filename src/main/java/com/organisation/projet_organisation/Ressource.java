package com.organisation.projet_organisation;

import java.util.ArrayList;
import java.util.List;

import static com.organisation.projet_organisation.Controller.*;
import static com.organisation.projet_organisation.Main.*;

public class Ressource {
    private String nom;
    private String prenom;
    private String description;
    private Tache assignation;

    public static List<Ressource> ressources = new ArrayList<>();

    public Ressource(String nom, String prenom, String description) {
        this.nom = nom;
        this.prenom = prenom;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Ressource {" +
                "nom = " + nom + '\'' +
                ", prenom = " + prenom + '\'' +
                ", description = " + description + '\'' +
                ", assignation = " + assignation +
                " }";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Tache getAssignation() {
        return assignation;
    }

    public void setAssignation(Tache assignation) {
        this.assignation = assignation;
    }
}
