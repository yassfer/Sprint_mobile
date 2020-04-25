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
public class Participants {
    private int id;
    private String nom;
    private int id_event;
    private int test;

    public Participants(String nom, int id_event, int test) {
        this.nom = nom;
        this.id_event = id_event;
        this.test = test;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getId_event() {
        return id_event;
    }

    public int getTest() {
        return test;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setId_event(int id_event) {
        this.id_event = id_event;
    }

    public void setTest(int test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "Participants{" + "id=" + id + ", nom=" + nom + ", id_event=" + id_event + ", test=" + test + '}';
    }
    
    
}
