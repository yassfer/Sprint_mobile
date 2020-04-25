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
public class DocumentLike {
    private int id;
    private int user_id;
    private int document_id;

    public DocumentLike(int user_id, int document_id) {
        this.user_id = user_id;
        this.document_id = document_id;
    }

    public int getId() {
        return id;
    }

    public int getUser_id() {
        return user_id;
    }

    public int getDocument_id() {
        return document_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setDocument_id(int document_id) {
        this.document_id = document_id;
    }

    @Override
    public String toString() {
        return "DocumentLike{" + "id=" + id + ", user_id=" + user_id + ", document_id=" + document_id + '}';
    }
    
    
}
