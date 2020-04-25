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
public class Test {
    private int Id;
    private String Question;
    private String Repense1;
    private String Repense2;
    private String Repense3;
    private String RepenseJust;

    public Test(){}
    
    public Test(String Question, String Repense1, String Repense2, String Repense3, String RepenseJust) {
        this.Question = Question;
        this.Repense1 = Repense1;
        this.Repense2 = Repense2;
        this.Repense3 = Repense3;
        this.RepenseJust = RepenseJust;
    }

    public int getId() {
        return Id;
    }

    public String getQuestion() {
        return Question;
    }

    public String getRepense1() {
        return Repense1;
    }

    public String getRepense2() {
        return Repense2;
    }

    public String getRepense3() {
        return Repense3;
    }

    public String getRepenseJust() {
        return RepenseJust;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setQuestion(String Question) {
        this.Question = Question;
    }

    public void setRepense1(String Repense1) {
        this.Repense1 = Repense1;
    }

    public void setRepense2(String Repense2) {
        this.Repense2 = Repense2;
    }

    public void setRepense3(String Repense3) {
        this.Repense3 = Repense3;
    }

    public void setRepenseJust(String RepenseJust) {
        this.RepenseJust = RepenseJust;
    }

    @Override
    public String toString() {
        return "Test{" + "Id=" + Id + ", Question=" + Question + ", Repense1=" + Repense1 + ", Repense2=" + Repense2 + ", Repense3=" + Repense3 + ", RepenseJust=" + RepenseJust + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.Id;
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
        final Test other = (Test) obj;
        if (this.Id != other.Id) {
            return false;
        }
        return true;
    }
    
    
    
}
