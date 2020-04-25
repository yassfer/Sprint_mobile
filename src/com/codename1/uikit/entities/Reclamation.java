/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.uikit.entities;

import java.util.Date;

/**
 *
 * @author User
 */
public class Reclamation {
    private int id;
    private String objet;
    private String contenu;
    private int id_eleve;
    private int id_type;
    private Date date;

    public Reclamation(String objet, String contenu, int id_eleve, int id_type, Date date) {
        this.objet = objet;
        this.contenu = contenu;
        this.id_eleve = id_eleve;
        this.id_type = id_type;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getObjet() {
        return objet;
    }

    public String getContenu() {
        return contenu;
    }

    public int getId_eleve() {
        return id_eleve;
    }

    public int getId_type() {
        return id_type;
    }

    public Date getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public void setId_eleve(int id_eleve) {
        this.id_eleve = id_eleve;
    }

    public void setId_type(int id_type) {
        this.id_type = id_type;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Reclamation{" + "id=" + id + ", objet=" + objet + ", contenu=" + contenu + ", id_eleve=" + id_eleve + ", id_type=" + id_type + ", date=" + date + '}';
    }
    
    
}
