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
 * @author MSI
 */
public class Evenement {
     private int Id;
     private String nom;
     private String type;
     private Date date;
     private int prix;
     private String temps;
     private int Id_club;
     private String nom_club;

    public Evenement(String nom, Date date,int prix,String temps,String type, int Id_club) {
        this.nom = nom;
        this.type=type;
        this.date = date;
        this.prix=prix;
        this.temps=temps;
        this.Id_club = Id_club;
    }
        public Evenement(String nom, Date date,int prix,String temps,String type, int Id_club,String nom_club) {
        this.nom = nom;
        this.type=type;
        this.date = date;
                this.prix=prix;
        this.temps=temps;
        this.Id_club = Id_club;
        this.nom_club=nom_club;
    }
        public Evenement(int Id,String nom, Date date,int prix,String temps,String type, int Id_club) {
        this.Id=Id;
        this.nom = nom;
        this.type=type;
        this.date = date;
        this.prix=prix;
        this.temps=temps;
        this.Id_club = Id_club;
    }
        
                public Evenement(int Id,String nom,int prix,String temps, Date date,String type) {
        this.Id=Id;
        this.nom = nom;
        this.type=type;
        this.date = date;
                this.prix=prix;
        this.temps=temps;
    }
     public Evenement(String nom, Date date,int prix,String temps,String type) {
        this.nom = nom;
        this.type=type;
        this.date = date;
                this.prix=prix;
        this.temps=temps;
    }

    public Evenement() {
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getTemps() {
        return temps;
    }

    public void setTemps(String temps) {
        this.temps = temps;
    }

    public String getNom_club() {
        return nom_club;
    }

    public void setNom_club(String nom_club) {
        this.nom_club = nom_club;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId_club() {
        return Id_club;
    }

    public void setId_club(int Id_club) {
        this.Id_club = Id_club;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.nom);
        hash = 19 * hash + Objects.hashCode(this.type);
        hash = 19 * hash + Objects.hashCode(this.date);
        hash = 19 * hash + this.Id_club;
        hash = 19 * hash + Objects.hashCode(this.nom_club);
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
        final Evenement other = (Evenement) obj;
        if (this.Id_club != other.Id_club) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.nom_club, other.nom_club)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Evenement{" + "nom=" + nom + ", type=" + type + ", date=" + date + ", Id_club=" + Id_club + ", nom_club=" + nom_club + '}';
    }

    

    


    
}
