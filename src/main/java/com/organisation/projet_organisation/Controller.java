package com.organisation.projet_organisation;

import static com.organisation.projet_organisation.Main.*;
import static com.organisation.projet_organisation.Ressources.*;

public class Controller {
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
        ressources.add(new Ressource("HENNEQUIN","Maxime","Il est gentil"));
    }

    public void delete_ressource() {
        System.out.println("Ressource supprimmée");
    }

    public void modify_ressource() {
        System.out.println("Ressource modifiée");
    }

    // TACHES

}