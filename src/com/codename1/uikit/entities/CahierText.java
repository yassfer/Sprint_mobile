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
public class CahierText {
    private int Id;
    private String lib;
    private String contenu;
    private int Id_classe;

    public CahierText(String lib, String contenu, int Id_classe) {
        this.lib = lib;
        this.contenu = contenu;
        this.Id_classe = Id_classe;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
    public String getLib() {
        return lib;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public int getId_classe() {
        return Id_classe;
    }

    public void setId_classe(int Id_classe) {
        this.Id_classe = Id_classe;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.Id;
        hash = 79 * hash + Objects.hashCode(this.lib);
        hash = 79 * hash + Objects.hashCode(this.contenu);
        hash = 79 * hash + this.Id_classe;
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
        final CahierText other = (CahierText) obj;
        if (this.Id != other.Id) {
            return false;
        }
        if (this.Id_classe != other.Id_classe) {
            return false;
        }
        if (!Objects.equals(this.lib, other.lib)) {
            return false;
        }
        if (!Objects.equals(this.contenu, other.contenu)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "CahierText{" + "lib=" + lib + ", contenu=" + contenu + ", Id_classe=" + Id_classe + '}';
    }
    
}
