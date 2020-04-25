/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.uikit.entities;

import java.util.Objects;

/**
 *
 * @author lenovo
 */
public class Carnetnote {
     private int Id;
     private String annee_scolaire;
     private String Matiere;
     private Float note;
     
     private int Id_eleve;

    public String getAnnee_scolaire() {
        return annee_scolaire;
    }

    public String getMatiere() {
        return Matiere;
    }

    public Float getNote() {
        return note;
    }

    

    public int getId_eleve() {
        return Id_eleve;
    }

    public Carnetnote(String annee_scolaire, String Matiere, Float note, int Id_eleve) {
        this.annee_scolaire = annee_scolaire;
        this.Matiere = Matiere;
        this.note = note;
        this.Id_eleve = Id_eleve;
    }

    public Carnetnote() {
    }

    
    

    public void setAnnee_scolaire(String annee_scolaire) {
        this.annee_scolaire = annee_scolaire;
    }

    public void setMatiere(String Matiere) {
        this.Matiere = Matiere;
    }

    public void setNote(Float note) {
        this.note = note;
    }

    

    public void setId_eleve(int Id_eleve) {
        this.Id_eleve = Id_eleve;
    }

    @Override
    public String toString() {
        return "Carnetnote{" + "Id=" + Id + ", annee_scolaire=" + annee_scolaire + ", Matiere=" + Matiere + ", note=" + note + ", Id_eleve=" + Id_eleve + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.Id;
        hash = 59 * hash + Objects.hashCode(this.annee_scolaire);
        hash = 59 * hash + Objects.hashCode(this.Matiere);
        hash = 59 * hash + Objects.hashCode(this.note);
        hash = 59 * hash + this.Id_eleve;
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
        final Carnetnote other = (Carnetnote) obj;
        if (this.Id != other.Id) {
            return false;
        }
        if (this.Id_eleve != other.Id_eleve) {
            return false;
        }
        if (!Objects.equals(this.annee_scolaire, other.annee_scolaire)) {
            return false;
        }
        if (!Objects.equals(this.Matiere, other.Matiere)) {
            return false;
        }
        if (!Objects.equals(this.note, other.note)) {
            return false;
        }
        return true;
    }

   

    
     
    
}
