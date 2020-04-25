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
public class Membres {
    private int id;
    private String nom;
    private int id_club;

    public Membres(String nom, int id_club) {
        this.nom = nom;
        this.id_club = id_club;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getId_club() {
        return id_club;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setId_club(int id_club) {
        this.id_club = id_club;
    }

    @Override
    public String toString() {
        return "Membres{" + "id=" + id + ", nom=" + nom + ", id_club=" + id_club + '}';
    }
    
    
}
