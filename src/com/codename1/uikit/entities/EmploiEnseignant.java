/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.uikit.entities;

import java.util.Date;

/**
 *
 * @author lenovo
 */
public class EmploiEnseignant {
       private int Id;
       private Date date_debut;
       private Date date_fin;
       private int Id_enseignant;

    public EmploiEnseignant(Date date_debut, Date date_fin, int Id_enseignant) {
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.Id_enseignant = Id_enseignant;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public EmploiEnseignant() {
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

    public int getId_enseignant() {
        return Id_enseignant;
    }

    public void setId_enseignant(int Id_enseignant) {
        this.Id_enseignant = Id_enseignant;
    }
       
       
}
