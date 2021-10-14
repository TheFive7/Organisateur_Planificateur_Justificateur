package com.organisation.projet_organisation;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

import static com.organisation.projet_organisation.Main.*;
import static com.organisation.projet_organisation.Ressource.ressources;

public class Controller {
    @FXML
    private Pane pane;

    public Controller(){}

    // LIGNE
    public void addRessource() {
        Ressource ressource = new Ressource("Nom","Prénom","Description (in english)");
        ressources.add(ressource);
        Ligne ligne = new Ligne(ressources.size());

        // LIGNE
        ligne.setNom(ressource.getNom());
        ligne.setPrenom(ressource.getPrenom());
        ligne.setDescription(ressource.getDescription());

        pane.getChildren().add(ligne);
    }

    // ACCUEIL
    public void continue_click() {
        primaryStage.setScene(scene_taches);
    }

    // MENU
    public void ressources_click() {
        primaryStage.setScene(scene_ressources);
    }

    public void taches_click() {
        primaryStage.setScene(scene_taches);
    }

    public void vue_perso_click() {
        primaryStage.setScene(scene_vue_perso);
    }

    // ADD/DELETE/MODIFY
    public void add_ressource() {
        System.out.println("Ressource ajoutée");
        ressources.add(new Ressource("HENNEQUIN","Maxime","Il est gentil !"));
        System.out.println(ressources.toString());
    }

    public void delete_ressource() {
        System.out.println("Ressource supprimmée");
    }

    public void modify_ressource() {
        System.out.println("Ressource modifiée");
    }

    // TACHES

}