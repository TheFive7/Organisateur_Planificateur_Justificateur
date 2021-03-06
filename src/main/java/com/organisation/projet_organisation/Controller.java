package com.organisation.projet_organisation;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


import java.util.Arrays;

import static com.organisation.projet_organisation.Ligne.lignes;
import static com.organisation.projet_organisation.Main.*;
import static com.organisation.projet_organisation.Ressource.ressources;

public class Controller {
    public static int actualLigneModify;
    Save save = new Save("r");

    @FXML
    private Pane pane;

    // STAGE MODIFIER
    @FXML
    private Button closeButtonModify;
    @FXML
    private TextField nameFieldModify;
    @FXML
    private TextField surnameFieldModify;
    @FXML
    private TextArea descriptionFieldModify;

    public Controller(){}

    // ADD
    public void addRessource() {
        Ressource ressource = new Ressource("Nom","Prénom","Description");
        ressource.assignLigne(pane,this);
        save.saveRessource();
    }

    // DELETE
    public void deleteRessource(int i) {
        Ligne l = lignes[i];
        ressources[i] = null;
        pane.getChildren().remove(l);
        save.saveRessource();
    }

    // MODIFY
    public void modifyRessource(int i) {
        actualLigneModify = i;
        Stage newStage = new Stage();
        newStage.initStyle(StageStyle.TRANSPARENT);
        newStage.setScene(scene_ressources_modifier);

        save.saveRessource();
        newStage.show();
    }
/*
    public void initModify() {
        nameFieldModify.setText(ressources[actualLigneModify].getLigne().labelnom.getText());
        surnameFieldModify.setText(ressources[actualLigneModify].getLigne().labelprenom.getText());
        descriptionFieldModify.setText(ressources[actualLigneModify].getLigne().textDescription.getText());
    }*/

    public void changeName() {
        lignes[actualLigneModify].labelnom.setText(nameFieldModify.getText());
        ressources[actualLigneModify].setNom(lignes[actualLigneModify].labelnom.getText());
    }

    public void changeSurname() {
        lignes[actualLigneModify].labelprenom.setText(surnameFieldModify.getText());
        ressources[actualLigneModify].setPrenom(lignes[actualLigneModify].labelprenom.getText());
    }

    public void changeDescription() {
        lignes[actualLigneModify].textDescription.setText(descriptionFieldModify.getText());
        ressources[actualLigneModify].setDescription(lignes[actualLigneModify].textDescription.getText());
    }

    public void changeLength(){
        // pour l'instant ne change rien mais change la taille du scroll
        // panel de la vue ressource dans le du
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

    public void exit() {
        System.out.println(Arrays.toString(save.loadRessource()));
        System.out.println(Arrays.toString(ressources));
        System.exit(0);
    }

    // MINI MENU MODIFY
    public void quit() {
        save.saveRessource();
        Stage stage = (Stage) closeButtonModify.getScene().getWindow();
        stage.close();
    }
}