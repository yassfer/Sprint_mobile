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
public class MenuDuJour {
    private int id;
    private int plat_id;
    private Date date;
    private int nombreReservation;

    public MenuDuJour(int plat_id, Date date, int nombreReservation) {
        this.plat_id = plat_id;
        this.date = date;
        this.nombreReservation = nombreReservation;
    }

    public int getId() {
        return id;
    }

    public int getPlat_id() {
        return plat_id;
    }

    public Date getDate() {
        return date;
    }

    public int getNombreReservation() {
        return nombreReservation;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPlat_id(int plat_id) {
        this.plat_id = plat_id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setNombreReservation(int nombreReservation) {
        this.nombreReservation = nombreReservation;
    }

    @Override
    public String toString() {
        return "MenuDuJour{" + "id=" + id + ", plat_id=" + plat_id + ", date=" + date + ", nombreReservation=" + nombreReservation + '}';
    }
    
    
}
