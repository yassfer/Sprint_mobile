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
public class Client {
    private int id;
    private String login;
    private String mdp;

    public Client(){
        
    }
    public Client(String login, String mdp) {
        this.login = login;
        this.mdp = mdp;
    }
    
 
    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", login=" + login + ", mdp=" + mdp + '}';
    }
    
    
}
