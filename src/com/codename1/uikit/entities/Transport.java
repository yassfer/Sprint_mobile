/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.uikit.entities;


/**
 *
 * @author User
 */
public class Transport {
    private int id;
    private String reference;
    private String circuit;
    private String nomChauffeur;
    private String prenomChauffeur;
    private int nombreDePlace;
    private String temps_debut;
    private String temps_fin;

    public Transport(String reference, String circuit, String nomChauffeur, String prenomChauffeur, int nombreDePlace, String temps_debut, String temps_fin) {
        this.reference = reference;
        this.circuit = circuit;
        this.nomChauffeur = nomChauffeur;
        this.prenomChauffeur = prenomChauffeur;
        this.nombreDePlace = nombreDePlace;
        this.temps_debut = temps_debut;
        this.temps_fin = temps_fin;
    }

    public int getId() {
        return id;
    }

    public String getReference() {
        return reference;
    }

    public String getCircuit() {
        return circuit;
    }

    public String getNomChauffeur() {
        return nomChauffeur;
    }

    public String getPrenomChauffeur() {
        return prenomChauffeur;
    }

    public int getNombreDePlace() {
        return nombreDePlace;
    }

    public String getTemps_debut() {
        return temps_debut;
    }

    public String getTemps_fin() {
        return temps_fin;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setCircuit(String circuit) {
        this.circuit = circuit;
    }

    public void setNomChauffeur(String nomChauffeur) {
        this.nomChauffeur = nomChauffeur;
    }

    public void setPrenomChauffeur(String prenomChauffeur) {
        this.prenomChauffeur = prenomChauffeur;
    }

    public void setNombreDePlace(int nombreDePlace) {
        this.nombreDePlace = nombreDePlace;
    }

    public void setTemps_debut(String temps_debut) {
        this.temps_debut = temps_debut;
    }

    public void setTemps_fin(String temps_fin) {
        this.temps_fin = temps_fin;
    }

    @Override
    public String toString() {
        return "Transport{" + "id=" + id + ", reference=" + reference + ", circuit=" + circuit + ", nomChauffeur=" + nomChauffeur + ", prenomChauffeur=" + prenomChauffeur + ", nombreDePlace=" + nombreDePlace + ", temps_debut=" + temps_debut + ", temps_fin=" + temps_fin + '}';
    }
    
    
}
