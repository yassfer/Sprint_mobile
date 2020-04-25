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
public class Document {
     private int Id;
     private Niveau niveau;
     private String type;
     private String contenu;
     private Date date;
     private int Id_enseignant;

    public Document(Niveau niveau, String type, String contenu, Date date, int Id_enseignant) {
        this.niveau = niveau;
        this.type = type;
        this.contenu = contenu;
        this.date = date;
        this.Id_enseignant = Id_enseignant;
    }

    public Niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId_enseignant() {
        return Id_enseignant;
    }

    public void setId_enseignant(int Id_enseignant) {
        this.Id_enseignant = Id_enseignant;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.niveau);
        hash = 79 * hash + Objects.hashCode(this.type);
        hash = 79 * hash + Objects.hashCode(this.contenu);
        hash = 79 * hash + Objects.hashCode(this.date);
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
        final Document other = (Document) obj;
        if (this.Id_enseignant != other.Id_enseignant) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.contenu, other.contenu)) {
            return false;
        }
        if (this.niveau != other.niveau) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Document{" + "niveau=" + niveau + ", type=" + type + ", contenu=" + contenu + ", date=" + date + ", Id_enseignant=" + Id_enseignant + '}';
    }
     
    
}
