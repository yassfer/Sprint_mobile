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
public class TypeRec {
    private int id;
    private String lib;

    public TypeRec(String lib) {
        this.lib = lib;
    }

    public int getId() {
        return id;
    }

    public String getLib() {
        return lib;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }

    @Override
    public String toString() {
        return "TypeRec{" + "id=" + id + ", lib=" + lib + '}';
    }
    
    
}
