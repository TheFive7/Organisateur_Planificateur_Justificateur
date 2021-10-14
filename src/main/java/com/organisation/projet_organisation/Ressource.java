package com.organisation.projet_organisation;

import javafx.scene.layout.Pane;

public class Ressource {
    static int compteur = 0;

    private String nom;
    private String prenom;
    private String description;
    private Tache assignation;
    private Ligne ligne;
    public static Ressource[] ressources = new Ressource[250];

    public Ressource(Pane pane, Controller controller, String nom, String prenom, String description) {
        this.nom = nom;
        this.prenom = prenom;
        this.description = description;

        compteur = 0;
        for (Ressource ressource:ressources) {
            if(ressource==null){
                this.ligne = new Ligne(compteur,controller);
                break;
            }
            compteur ++;
        }

        if (ligne!=null) {
            ligne.setNom(getNom());
            ligne.setPrenom(getPrenom());
            ligne.setDescription(getDescription());

            ressources[compteur] = this;
            pane.getChildren().add(ligne);
        }
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

    public String getPrenom() {
        return prenom;
    }

    public String getDescription() {
        return description;
    }

    public Ligne getLigne() { return ligne; }
}
