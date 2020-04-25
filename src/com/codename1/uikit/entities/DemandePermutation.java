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
public class DemandePermutation {
    
    private int Id;
    private String Nom;
    private String Prenom;
    private int Numero;
    Niveau niveau;
    private String ClasseOrig;
    private String ClasseDest;
    private String nom_eleve2;
    private String prenom_eleve2;
    private int Id_eleve;
    private int Id_eleve2;

    public DemandePermutation() {
    }

    public void setId_eleve2(int Id_eleve2) {
        this.Id_eleve2 = Id_eleve2;
    }

    public int getId_eleve2() {
        return Id_eleve2;
    }

    public DemandePermutation(int Id, String Nom, String Prenom, int Numero, Niveau niveau, String ClasseOrig, String ClasseDest, String nom_eleve2, String prenom_eleve2, int Id_eleve, int Id_eleve2) {
        this.Id = Id;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Numero = Numero;
        this.niveau = niveau;
        this.ClasseOrig = ClasseOrig;
        this.ClasseDest = ClasseDest;
        this.nom_eleve2 = nom_eleve2;
        this.prenom_eleve2 = prenom_eleve2;
        this.Id_eleve = Id_eleve;
        this.Id_eleve2 = Id_eleve2;
    }

     

   
    public int getId() {
        return Id;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public int getNumero() {
        return Numero;
    }

    public Niveau getNiveau() {
        return niveau;
    }

    public String getClasseOrig() {
        return ClasseOrig;
    }

    public String getClasseDest() {
        return ClasseDest;
    }
    
    public String getNomAmi() {
        return Nom;
    }

    public String getPrenomAmi() {
        return Prenom;
    }
   

    public int getId_eleve() {
        return Id_eleve;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

    public void setClasseOrig(String ClasseOrig) {
        this.ClasseOrig = ClasseOrig;
    }

    public void setClasseDest(String ClasseDest) {
        this.ClasseDest = ClasseDest;
    }

    public String getNom_eleve2() {
        return nom_eleve2;
    }

    public String getPrenom_eleve2() {
        return prenom_eleve2;
    }

    public void setNom_eleve2(String nom_eleve2) {
        this.nom_eleve2 = nom_eleve2;
    }

    public void setPrenom_eleve2(String prenom_eleve2) {
        this.prenom_eleve2 = prenom_eleve2;
    }

  
    public void setId_eleve(int Id_eleve) {
        this.Id_eleve = Id_eleve;
    }

 

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.Id;
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
        final DemandePermutation other = (DemandePermutation) obj;
        if (this.Id != other.Id) {
            return false;
        }
        return true;
    }
    
}
