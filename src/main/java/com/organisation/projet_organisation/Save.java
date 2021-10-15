package com.organisation.projet_organisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import static com.organisation.projet_organisation.Ressource.ressources;

public class Save {
    String chemin;
    String type;

    Save(String s){
        type = s;
        if (type.equals("r")) chemin = "ressources.txt";
        if (type.equals("t")) chemin = "taches.txt";
    }

    public void saveRessource() {
        try {
            FileOutputStream file = new FileOutputStream(chemin);
            ObjectOutputStream output = new ObjectOutputStream(file);
            output.writeObject(ressources);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Ressource[] loadRessource() {
        Ressource[] ressources = null;
        try {
            FileInputStream fileStream = new FileInputStream("ressources.txt");
            ObjectInputStream input = new ObjectInputStream(fileStream);
            ressources = (Ressource[]) input.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ressources;
    }
}
