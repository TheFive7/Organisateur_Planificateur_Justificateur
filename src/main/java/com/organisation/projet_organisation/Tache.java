package com.organisation.projet_organisation;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Tache implements Serializable {
    private String numero;
    private boolean isOT;
    private String nom;
    private String description;
    private Date date_debut;
    private Date date_fin;
    private List<Ressource> ressources;
    public static Tache[] taches = new Tache[250];

    public Tache(String numero, boolean isOT, String nom, String description, Date date_debut, Date date_fin, List<Ressource> ressources) {
        this.numero = numero;
        this.isOT = isOT;
        this.nom = nom;
        this.description = description;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.ressources = ressources;
    }
}
