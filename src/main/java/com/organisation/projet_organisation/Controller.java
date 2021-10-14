package com.organisation.projet_organisation;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import static com.organisation.projet_organisation.Main.*;
import static com.organisation.projet_organisation.Ressource.ressources;

public class Controller {
    public static int actualLigneModify;

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
        new Ressource(pane,this,"Nom","Prénom","Description");
    }

    // DELETE
    public void deleteRessource(int i) {
        Ressource r = ressources[i];
        ressources[i] = null;
        pane.getChildren().remove(r.getLigne());
    }

    // MODIFY
    public void modifyRessource(int i) {
        actualLigneModify = i;
        Stage newStage = new Stage();
        newStage.initStyle(StageStyle.TRANSPARENT);
        newStage.setScene(scene_ressources_modifier);

/*        nameFieldModify.setText(ressources[actualLigneModify].getLigne().labelnom.getText());
        surnameFieldModify.setText(ressources[actualLigneModify].getLigne().labelprenom.getText());
        descriptionFieldModify.setText(ressources[actualLigneModify].getLigne().textDescription.getText());*/

        newStage.show();
    }

    public void changeName() {
        ressources[actualLigneModify].getLigne().labelnom.setText(nameFieldModify.getText());
    }

    public void changeSurname() {
        ressources[actualLigneModify].getLigne().labelprenom.setText(surnameFieldModify.getText());
    }

    public void changeDescription() {
        ressources[actualLigneModify].getLigne().textDescription.setText(descriptionFieldModify.getText());
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

    public void exit() { System.exit(0); }

    // MINI MENU
    public void quit() {
        Stage stage = (Stage) closeButtonModify.getScene().getWindow();
        stage.close();
    }
}