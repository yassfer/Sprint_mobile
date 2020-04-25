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
public class Notif {
    private int id;
    private int id_eleve;
    private Date date;

    public Notif(int id_eleve, Date date) {
        this.id_eleve = id_eleve;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public int getId_eleve() {
        return id_eleve;
    }

    public Date getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_eleve(int id_eleve) {
        this.id_eleve = id_eleve;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Notif{" + "id=" + id + ", id_eleve=" + id_eleve + ", date=" + date + '}';
    }
    
    
}
