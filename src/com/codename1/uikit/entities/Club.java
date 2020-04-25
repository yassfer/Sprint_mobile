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
public class Club {
     private int Id;
     private String nom;
     private Date date_f;
     private String type;
     private int nombre_e;

    public Club(int Id,String nom, Date date_f, String type,int nombre_e) {
        this.Id=Id;
        this.nom = nom;
        this.date_f = date_f;
        this.type = type;
        this.nombre_e=nombre_e;
    }
        public Club(int Id,String nom, Date date_f, String type) {
        this.Id=Id;
        this.nom = nom;
        this.date_f = date_f;
        this.type = type;
    }
    
    public Club(String nom, Date date_f, String type,int nombre_e) {
        this.nom = nom;
        this.date_f = date_f;
        this.type = type;
        this.nombre_e=nombre_e;
    }
        public Club(String nom, Date date_f, String type) {
        this.nom = nom;
        this.date_f = date_f;
        this.type = type;
    }

   

    public Club() {
    }
    
    public void setNombre_e(int nombre_e) {
        this.nombre_e = nombre_e;
    }

    public int getNombre_e() {
        return nombre_e;
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

    public Date getDate_f() {
        return date_f;
    }

    public void setDate_f(Date date_f) {
        this.date_f = date_f;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.nom);
        hash = 83 * hash + Objects.hashCode(this.date_f);
        hash = 83 * hash + Objects.hashCode(this.type);
        hash = 83 * hash + this.nombre_e;
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
        final Club other = (Club) obj;
        if (this.nombre_e != other.nombre_e) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.date_f, other.date_f)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Club{" + "nom=" + nom + ", date_f=" + date_f + ", type=" + type + ", nombre_e=" + nombre_e + '}';
    }

  
    
}
