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
public class Classe {
     private int Id;
     private String lib;
     private Niveau niveau;

    public Classe(String lib, Niveau niveau) {
        this.lib = lib;
        this.niveau = niveau;
    }

    public Classe() {
    }
    
    @Override
    public String toString() {
        return "Classe{" + "lib=" + lib + ", niveau=" + niveau + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.Id;
        hash = 29 * hash + Objects.hashCode(this.lib);
        hash = 29 * hash + Objects.hashCode(this.niveau);
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
        final Classe other = (Classe) obj;
        if (this.Id != other.Id) {
            return false;
        }
        if (!Objects.equals(this.lib, other.lib)) {
            return false;
        }
        if (this.niveau != other.niveau) {
            return false;
        }
        return true;
    }
   
    

    public String getLib() {
        return lib;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }

    public Niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
     
    
}
