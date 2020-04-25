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
public class Matiere {
    private int Id;
    private String lib;
    private int coef;

    public Matiere(String lib, int coef) {
       
        this.lib = lib;
        this.coef = coef;
    }

   

    public String getLib() {
        return lib;
    }

    public int getCoef() {
        return coef;
    }

    @Override
    public String toString() {
        return "Matiere{" + "lib=" + lib + ", coef=" + coef + '}';
    }

    
    

    public void setLib(String lib) {
        this.lib = lib;
    }

    public void setCoef(int coef) {
        this.coef = coef;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.lib);
        hash = 61 * hash + this.coef;
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
        final Matiere other = (Matiere) obj;
        if (this.coef != other.coef) {
            return false;
        }
        if (!Objects.equals(this.lib, other.lib)) {
            return false;
        }
        return true;
    }

    
    
    
    
}
