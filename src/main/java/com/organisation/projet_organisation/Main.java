package com.organisation.projet_organisation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Main extends Application {
    public static Stage primaryStage;

    // SCENES PRINCIPALES
    public static Scene scene_accueil;
    public static Scene scene_taches;
    public static Scene scene_ressources;
    public static Scene scene_vue_perso;

    // SCENES SECONDAIRES
    public static Scene scene_ressources_modifier;

    @Override
    public void start(Stage stage) throws IOException {

        primaryStage = stage;

        // PRINCIPAL
        FXMLLoader fxmlLoaderAccueil = new FXMLLoader(getClass().getResource("accueil.fxml"));
        Parent root_accueil = fxmlLoaderAccueil.load();

        FXMLLoader fxmlLoaderTache = new FXMLLoader(getClass().getResource("taches.fxml"));
        Parent root_taches = fxmlLoaderTache.load();

        FXMLLoader fxmlLoaderRessource = new FXMLLoader(getClass().getResource("ressources.fxml"));
        Parent root_ressources = fxmlLoaderRessource.load();

        FXMLLoader fxmlLoaderVuePerso = new FXMLLoader(getClass().getResource("vue_perso.fxml"));
        Parent root_vue_perso = fxmlLoaderVuePerso.load();

        // SECONDAIRE
        FXMLLoader fxmlLoaderRessourceModifier = new FXMLLoader(getClass().getResource("ressources_modifier.fxml"));
        Parent root_ressources_modifier = fxmlLoaderRessourceModifier.load();

        // SCENES PRINCIPALES
        scene_accueil = new Scene(root_accueil, 1440, 1024);
        scene_taches = new Scene(root_taches, 1440, 1024);
        scene_ressources = new Scene(root_ressources, 1440, 1024);
        scene_vue_perso = new Scene(root_vue_perso, 1440, 1024);

        // SCENES SECONDAIRES
        scene_ressources_modifier = new Scene(root_ressources_modifier, 258, 512);

        // STAGE
        // stage.initStyle(StageStyle.TRANSPARENT);
        stage.setTitle("ORGANISATION");
        stage.setScene(scene_accueil);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}