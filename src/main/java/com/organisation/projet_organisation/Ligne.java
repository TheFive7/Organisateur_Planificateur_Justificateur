package com.organisation.projet_organisation;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class Ligne extends Pane {
    Ligne() {
        // IMAGE
        ImageView imageView = new ImageView();
        imageView.setImage(new Image("@ligne.png"));

        // LABEL NOM

        // LABEL PRENOM

        // DESCRIPTION

        // ASSIGNATION

        // MODIFY
        Button button_modify = new Button();
        button_modify.setLayoutX(1123); button_modify.setLayoutY(25);
        button_modify.setMinHeight(55);button_modify.setMinWidth(55);
        button_modify.setMnemonicParsing(false);
        button_modify.setOpacity(0);
        button_modify.setOnAction(actionEvent -> {System.out.println("Ressource modifiée");});

        // DELETE
        Button button_delete = new Button();
        button_delete.setLayoutX(1240); button_delete.setLayoutY(25);
        button_delete.setMinHeight(55);button_delete.setMinWidth(55);
        button_delete.setMnemonicParsing(false);
        button_delete.setOpacity(0);
        button_delete.setOnAction(actionEvent -> {System.out.println("Ressource supprimmée");});

        // ADD
        Button button_add = new Button();
        button_add.setLayoutX(1354); button_add.setLayoutY(25);
        button_add.setMinHeight(55);button_add.setMinWidth(55);
        button_add.setMnemonicParsing(false);
        button_add.setOpacity(0);
        button_add.setOnAction(actionEvent -> {System.out.println("Ressource ajoutée");});

        getChildren().addAll(imageView,button_modify,button_delete,button_add);
    }
}
