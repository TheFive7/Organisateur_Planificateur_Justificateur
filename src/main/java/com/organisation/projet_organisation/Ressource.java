package com.organisation.projet_organisation;

public class Ressource {
    private String nom;
    private String prenom;
    private String description;
    private Tache assignation;

    public Ressource(String nom, String prenom, String description) {
        this.nom = nom;
        this.prenom = prenom;
        this.description = description;
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
