/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.uikit.entities;

import java.util.Date;

/**
 *
 * @author User
 */
public class Exercice {
    private int id;
    private String contenu;
    private Date date;
    private int id_cahier;
    private String matiere;

    public Exercice(String contenu, Date date, int id_cahier, String matiere) {
        this.contenu = contenu;
        this.date = date;
        this.id_cahier = id_cahier;
        this.matiere = matiere;
    }

    public int getId() {
        return id;
    }

    public String getContenu() {
        return contenu;
    }

    public Date getDate() {
        return date;
    }

    public int getId_cahier() {
        return id_cahier;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setId_cahier(int id_cahier) {
        this.id_cahier = id_cahier;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    @Override
    public String toString() {
        return "Exercice{" + "id=" + id + ", contenu=" + contenu + ", date=" + date + ", id_cahier=" + id_cahier + ", matiere=" + matiere + '}';
    }
    
    
}
