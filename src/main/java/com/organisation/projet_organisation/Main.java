package com.organisation.projet_organisation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    public static Stage primaryStage;

    // PARENT
    public static Parent root_ressources;

    // SCENE
    public static Scene scene_accueil;
    public static Scene scene_taches;
    public static Scene scene_ressources;
    public static Scene scene_vue_perso;

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;

        FXMLLoader fxmlLoaderAccueil = new FXMLLoader(getClass().getResource("accueil.fxml"));
        Parent root_accueil = fxmlLoaderAccueil.load();

        Parent root_taches = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("taches.fxml")));

        FXMLLoader fxmlLoaderRessource = new FXMLLoader(getClass().getResource("ressources.fxml"));
        // Controller controller = fxmlLoaderRessource.getController();
        root_ressources = fxmlLoaderRessource.load();

        Parent root_vue_perso = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("vue_perso.fxml")));

        scene_accueil = new Scene(root_accueil, 1440, 1024);
        scene_taches = new Scene(root_taches, 1440, 1024);
        scene_ressources = new Scene(root_ressources, 1440, 1024);
        scene_vue_perso = new Scene(root_vue_perso, 1440, 1024);

        // controller.addRessource();

        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setTitle("ORGANISATION");
        stage.setScene(scene_accueil);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}