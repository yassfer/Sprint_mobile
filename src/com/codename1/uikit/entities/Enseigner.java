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
public class Enseigner {
    private int id;
    private int id_enseignant;
    private int id_classe;

    public Enseigner(int id_enseignant, int id_classe) {
        this.id_enseignant = id_enseignant;
        this.id_classe = id_classe;
    }

    public int getId() {
        return id;
    }

    public int getId_enseignant() {
        return id_enseignant;
    }

    public int getId_classe() {
        return id_classe;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_enseignant(int id_enseignant) {
        this.id_enseignant = id_enseignant;
    }

    public void setId_classe(int id_classe) {
        this.id_classe = id_classe;
    }

    @Override
    public String toString() {
        return "Enseigner{" + "id=" + id + ", id_enseignant=" + id_enseignant + ", id_classe=" + id_classe + '}';
    }
    
    
}
