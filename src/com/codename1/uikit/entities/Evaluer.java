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
public class Evaluer {
    private int Id;
    private int Note;
    private int Id_enseignant;

    public Evaluer(int Note, int Id_enseignant) {
        this.Note = Note;
        this.Id_enseignant = Id_enseignant;
    }
    
    public int getId() {
        return Id;
    }

    public int getNote() {
        return Note;
    }
    
    public int getId_enseignant() {
        return Id_enseignant;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNote(int Note) {
        this.Note = Note;
    }
    
    public void setId_enseignant(int Id_enseignant) {
        this.Id_enseignant = Id_enseignant;
    }

    @Override
    public String toString() {
        return "Evaluer{" + "Id=" + Id + ", Note=" + Note + ", Id_enseignant=" + Id_enseignant + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.Id;
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
        final Evaluer other = (Evaluer) obj;
        if (this.Id != other.Id) {
            return false;
        }
        return true;
    }
    
    
}
