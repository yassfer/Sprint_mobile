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
public class Eleve extends User{
    private String nom;
    private String pernom;
    private String adresse;
    private String Date_de_naissance;
    private int numero;
    private String Sexe;
    private String login;
    private String mot_de_passe;
    private int Id_classe;

    public Eleve(String nom, String pernom, String adresse, String Date_de_naissance, int numero, String Sexe, String login, String mot_de_passe, int Id_classe, String username, String username_canonical, String email, String email_canonical, boolean enabled, String salt, String password, Date last_login, String confirmation_token, Date password_requested_at, String roles) {
        super(username, username_canonical, email, email_canonical, enabled, salt, password, last_login, confirmation_token, password_requested_at, roles);
        this.nom = nom;
        this.pernom = pernom;
        this.adresse = adresse;
        this.Date_de_naissance = Date_de_naissance;
        this.numero = numero;
        this.Sexe = Sexe;
        this.login = login;
        this.mot_de_passe = mot_de_passe;
        this.Id_classe = Id_classe;
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

    public String getLogin() {
        return login;
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }

    public int getId_classe() {
        return Id_classe;
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

    public void setLogin(String login) {
        this.login = login;
    }

    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }

    public void setId_classe(int Id_classe) {
        this.Id_classe = Id_classe;
    }

    @Override
    public String toString() {
        super.toString();
        return "Eleve{" + "nom=" + nom + ", pernom=" + pernom + ", adresse=" + adresse + ", Date_de_naissance=" + Date_de_naissance + ", numero=" + numero + ", Sexe=" + Sexe + ", login=" + login + ", mot_de_passe=" + mot_de_passe + ", Id_classe=" + Id_classe + '}';
    }

         
}
