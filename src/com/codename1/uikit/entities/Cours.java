/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.uikit.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author lenovo
 */
public class Cours {
      private int Id;
      private Date date;
      private String temps_debut;
      private String Temps_fin;
      private int Id_matiere;
      private int Id_classe;
      private int Id_enseignant;
      

    public Cours(Date date, String temps_debut, String Temps_fin, int Id_matiere, int Id_classe, int Id_enseignant) {
        this.date = date;
        this.temps_debut = temps_debut;
        this.Temps_fin = Temps_fin;
        this.Id_matiere = Id_matiere;
        this.Id_classe = Id_classe;
        this.Id_enseignant = Id_enseignant;
        
    }

    public Cours() {
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    

    public int getId() {
        return Id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTemps_debut() {
        return temps_debut;
    }

    public void setTemps_debut(String temps_debut) {
        this.temps_debut = temps_debut;
    }

    public String getTemps_fin() {
        return Temps_fin;
    }

    public void setTemps_fin(String Temps_fin) {
        this.Temps_fin = Temps_fin;
    }

    public int getId_matiere() {
        return Id_matiere;
    }

    public void setId_matiere(int Id_matiere) {
        this.Id_matiere = Id_matiere;
    }

    public int getId_classe() {
        return Id_classe;
    }

    public void setId_classe(int Id_classe) {
        this.Id_classe = Id_classe;
    }

    public int getId_enseignant() {
        return Id_enseignant;
    }

    public void setId_enseignant(int Id_enseignant) {
        this.Id_enseignant = Id_enseignant;
    }

    @Override
    public String toString() {
        return "Cours{" + "date=" + date + ", temps_debut=" + temps_debut + ", Temps_fin=" + Temps_fin + ", Id_matiere=" + Id_matiere + ", Id_classe=" + Id_classe + ", Id_enseignant=" + Id_enseignant + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.date);
        hash = 79 * hash + Objects.hashCode(this.temps_debut);
        hash = 79 * hash + Objects.hashCode(this.Temps_fin);
        hash = 79 * hash + this.Id_matiere;
        hash = 79 * hash + this.Id_classe;
        hash = 79 * hash + this.Id_enseignant;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cours other = (Cours) obj;
        if (this.Id_matiere != other.Id_matiere) {
            return false;
        }
        if (this.Id_classe != other.Id_classe) {
            return false;
        }
        if (this.Id_enseignant != other.Id_enseignant) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (!Objects.equals(this.temps_debut, other.temps_debut)) {
            return false;
        }
        if (!Objects.equals(this.Temps_fin, other.Temps_fin)) {
            return false;
        }
        return true;
    }
      
    
}
