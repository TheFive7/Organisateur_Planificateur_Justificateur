package com.organisation.projet_organisation;

import javafx.scene.layout.Pane;
import java.io.Serializable;

import static com.organisation.projet_organisation.Ligne.lignes;

public class Ressource implements Serializable {
    static int compteur = 0;

    private String nom;
    private String prenom;
    private String description;
    private Tache assignation;
    public static Ressource[] ressources = new Ressource[250];

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

    public void assignLigne(Pane pane, Controller controller) {
        Ligne ligne = null;
        compteur = 0;
        for (Ressource ressource:ressources) {
            if(ressource==null){
                ligne = new Ligne(compteur,controller);
                break;
            }
            compteur ++;
        }

        if (ligne!=null) {
            ligne.setNom(getNom());
            ligne.setPrenom(getPrenom());
            ligne.setDescription(getDescription());

            lignes[compteur] = ligne;
            ressources[compteur] = this;
            pane.getChildren().add(ligne);
        }
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDescription() {
        return description;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
