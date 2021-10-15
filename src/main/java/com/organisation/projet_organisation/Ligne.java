package com.organisation.projet_organisation;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

public class Ligne extends Pane {
    int id;
    Label labelnom;
    Label labelprenom;
    TextArea textDescription;

    Ligne(int numero, Controller controller) {
        id = numero;

        // Layout
        setLayoutY(157 + (107*numero));
        setPrefHeight(107);setPrefWidth(1440);

        // Font
        Font font18 = new Font(18);
        Font font14 = new Font(14);

        // IMAGE
        ImageView imageView = new ImageView();
        imageView.setImage(new Image("file:src/main/resources/com/organisation/projet_organisation/ligne.png"));

        // LABEL NOM
        labelnom = new Label();
        labelnom.setFont(font18);
        labelnom.setLayoutX(37);labelnom.setLayoutY(40);
        labelnom.setPrefHeight(29);labelnom.setPrefWidth(125);

        // LABEL PRENOM
        labelprenom = new Label();
        labelprenom.setFont(font18);
        labelprenom.setLayoutX(185);labelprenom.setLayoutY(40);
        labelprenom.setPrefHeight(29);labelprenom.setPrefWidth(125);

        // DESCRIPTION
        textDescription = new TextArea();
        textDescription.setWrapText(true);
        textDescription.setFont(font14);
        textDescription.setLayoutX(329);textDescription.setLayoutY(17);
        textDescription.setPrefHeight(70);textDescription.setPrefWidth(224);
        textDescription.setDisable(true);

        // ASSIGNATION
        TextArea textAssignation = new TextArea();
        textAssignation.setWrapText(true);
        textAssignation.setFont(font14);
        textAssignation.setLayoutX(588);textAssignation.setLayoutY(17);
        textAssignation.setPrefHeight(70);textAssignation.setPrefWidth(224);

        // MODIFY
        Button button_modify = new Button();
        button_modify.setLayoutX(1038); button_modify.setLayoutY(25);
        button_modify.setMinHeight(55);button_modify.setMinWidth(55);
        button_modify.setMnemonicParsing(false);
        button_modify.setOpacity(0);
        button_modify.setOnAction(actionEvent -> controller.modifyRessource(id));

        // DELETE
        Button button_delete = new Button();
        button_delete.setLayoutX(1302); button_delete.setLayoutY(25);
        button_delete.setMinHeight(55);button_delete.setMinWidth(55);
        button_delete.setMnemonicParsing(false);
        button_delete.setOpacity(0);
        button_delete.setOnAction(actionEvent -> controller.deleteRessource(id));

        getChildren().addAll(imageView,labelnom,labelprenom,textDescription,textAssignation,button_modify,button_delete);
    }

    void setNom(String nom) {
        labelnom.setText(nom);
    }

    void setPrenom(String prenom) {
        labelprenom.setText(prenom);
    }

    void setDescription(String description) {
        textDescription.setText(description);
    }
}
