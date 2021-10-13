package com.organisation.projet_organisation;

import java.util.Date;
import java.util.List;

public class Tache {
    private String Numero;
    private boolean isOT;
    private String nom;
    private String description;
    private Date date_debut;
    private Date date_fin;
    private List<Ressource> ressources;

    public Tache(String numero, boolean isOT, String nom, String description, Date date_debut, Date date_fin, List<Ressource> ressources) {
        Numero = numero;
        this.isOT = isOT;
        this.nom = nom;
        this.description = description;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.ressources = ressources;
    }

    public void newTache() {

    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public boolean isOT() {
        return isOT;
    }

    public void setOT(boolean OT) {
        isOT = OT;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public List<Ressource> getRessources() {
        return ressources;
    }

    public void setRessources(List<Ressource> ressources) {
        this.ressources = ressources;
    }
}
