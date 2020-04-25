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
 * @author soff1
 */
public class Candid {
    private String nom;
    private String pernom;
    private String adresse;
    private String Date_de_naissance;
    private int numero;
    private String Sexe;
    Niveau niveau;
    private int Numero_parent;
    private String Email_parent;
    private Integer score ;

    public Candid(String nom, String pernom, String adresse, String Date_de_naissance, int numero, String Sexe, Niveau niveau, int Numero_parent, String Email_parent, Integer score) {
        this.nom = nom;
        this.pernom = pernom;
        this.adresse = adresse;
        this.Date_de_naissance = Date_de_naissance;
        this.numero = numero;
        this.Sexe = Sexe;
        this.niveau = niveau;
        this.Numero_parent = Numero_parent;
        this.Email_parent = Email_parent;
        this.score = score;
    }

    public String getNom() {
        return nom;
    }

    public String getPernom() {
        return pernom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getDate_de_naissance() {
        return Date_de_naissance;
    }

    public int getNumero() {
        return numero;
    }

    public String getSexe() {
        return Sexe;
    }

    public Niveau getNiveau() {
        return niveau;
    }

    public int getNumero_parent() {
        return Numero_parent;
    }

    public String getEmail_parent() {
        return Email_parent;
    }

    public Integer getScore() {
        return score;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPernom(String pernom) {
        this.pernom = pernom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setDate_de_naissance(String Date_de_naissance) {
        this.Date_de_naissance = Date_de_naissance;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSexe(String Sexe) {
        this.Sexe = Sexe;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

    public void setNumero_parent(int Numero_parent) {
        this.Numero_parent = Numero_parent;
    }

    public void setEmail_parent(String Email_parent) {
        this.Email_parent = Email_parent;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Candid{" + "nom=" + nom + ", pernom=" + pernom + ", adresse=" + adresse + ", Date_de_naissance=" + Date_de_naissance + ", numero=" + numero + ", Sexe=" + Sexe + ", niveau=" + niveau + ", Numero_parent=" + Numero_parent + ", Email_parent=" + Email_parent + ", score=" + score + '}';
    }
   
    
    
      }
