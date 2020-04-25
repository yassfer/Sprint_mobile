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
public class Plat {
    private int id;
    private String nom;
    private String chef;
    private String type;
    private String image;
    private String descri;

    public Plat(String nom, String chef, String type, String image, String descri) {
        this.nom = nom;
        this.chef = chef;
        this.type = type;
        this.image = image;
        this.descri = descri;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getChef() {
        return chef;
    }

    public String getType() {
        return type;
    }

    public String getImage() {
        return image;
    }

    public String getDescri() {
        return descri;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setChef(String chef) {
        this.chef = chef;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    @Override
    public String toString() {
        return "Plat{" + "id=" + id + ", nom=" + nom + ", chef=" + chef + ", type=" + type + ", image=" + image + ", descri=" + descri + '}';
    }
    
    
}
