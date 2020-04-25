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
public class PasserTest {
    private int Id;
    private int Score;
    private int Id_condidat;
    
    public PasserTest(){}

    public PasserTest(int Score, int Id_condidat) {
        this.Score = Score;
        this.Id_condidat = Id_condidat;
    }

    public int getId() {
        return Id;
    }

    public int getScore() {
        return Score;
    }

    public int getId_eleve() {
        return Id_condidat;
    }
    
    public void setId(int Id) {
        this.Id = Id;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }

    public void setId_eleve(int Id_condidat) {
        this.Id_condidat = Id_condidat;
    }

    @Override
    public String toString() {
        return "PasserTest{" + "Id=" + Id + ", Score=" + Score + ", Id_condidat=" + Id_condidat + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.Id;
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
        final PasserTest other = (PasserTest) obj;
        if (this.Id != other.Id) {
            return false;
        }
        return true;
    }
    
    
    
}
