/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.uikit.entities;


import java.util.Date;
import java.util.Objects;
/**
 *
 * @author lenovo
 */
public class AbsenceEleve {
       private int Id;
       private Date Date;
       private String temps_debut;
       private String temps_fin;
       private String Etat;
       private int Id_eleve;
       
    public AbsenceEleve(Date Date, String temps_debut, String temps_fin, String Etat, int Id_eleve) {
        this.Date = Date;
        this.temps_debut = temps_debut;
        this.temps_fin = temps_fin;
        this.Etat = Etat;
        this.Id_eleve = Id_eleve;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public String getTemps_debut() {
        return temps_debut;
    }

    public void setTemps_debut(String temps_debut) {
        this.temps_debut = temps_debut;
    }

    public String getTemps_fin() {
        return temps_fin;
    }

    public void setTemps_fin(String temps_fin) {
        this.temps_fin = temps_fin;
    }

    public String getEtat() {
        return Etat;
    }

    public void setEtat(String Etat) {
        this.Etat = Etat;
    }

    public int getId_eleve() {
        return Id_eleve;
    }

    public void setId_eleve(int Id_eleve) {
        this.Id_eleve = Id_eleve;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.Id;
        hash = 43 * hash + Objects.hashCode(this.Date);
        hash = 43 * hash + Objects.hashCode(this.temps_debut);
        hash = 43 * hash + Objects.hashCode(this.temps_fin);
        hash = 43 * hash + Objects.hashCode(this.Etat);
        hash = 43 * hash + this.Id_eleve;
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
        final AbsenceEleve other = (AbsenceEleve) obj;
        if (this.Id != other.Id) {
            return false;
        }
        if (this.Id_eleve != other.Id_eleve) {
            return false;
        }
        if (!Objects.equals(this.Etat, other.Etat)) {
            return false;
        }
        if (!Objects.equals(this.Date, other.Date)) {
            return false;
        }
        if (!Objects.equals(this.temps_debut, other.temps_debut)) {
            return false;
        }
        if (!Objects.equals(this.temps_fin, other.temps_fin)) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return "AbsenceEleve{" + "Date=" + Date + ", temps_debut=" + temps_debut + ", temps_fin=" + temps_fin + ", Etat=" + Etat + ", Id_eleve=" + Id_eleve + '}';
    }

       
    
}
