/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.uikit.entities;

import java.util.Date;

/**
 *
 * @author lenovo
 */
public abstract class User {
      
        protected String username;
        protected String username_canonical;
        protected String email;
        protected String email_canonical;
        protected boolean enabled;
        protected String salt;
        protected String password;
        protected Date last_login;
        protected String confirmation_token;
        protected Date password_requested_at;
        protected String roles;

    public User(String username, String username_canonical, String email, String email_canonical, boolean enabled, String salt, String password, Date last_login, String confirmation_token, Date password_requested_at, String roles) {
        this.username = username;
        this.username_canonical = username_canonical;
        this.email = email;
        this.email_canonical = email_canonical;
        this.enabled = enabled;
        this.salt = salt;
        this.password = password;
        this.last_login = last_login;
        this.confirmation_token = confirmation_token;
        this.password_requested_at = password_requested_at;
        this.roles = roles;
    }


    public String getUsername() {
        return username;
    }

    public String getUsername_canonical() {
        return username_canonical;
    }

    public String getEmail() {
        return email;
    }

    public String getEmail_canonical() {
        return email_canonical;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public String getSalt() {
        return salt;
    }

    public String getPassword() {
        return password;
    }

    public Date getLast_login() {
        return last_login;
    }

    public String getConfirmation_token() {
        return confirmation_token;
    }

    public Date getPassword_requested_at() {
        return password_requested_at;
    }

    public String getRoles() {
        return roles;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUsername_canonical(String username_canonical) {
        this.username_canonical = username_canonical;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEmail_canonical(String email_canonical) {
        this.email_canonical = email_canonical;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLast_login(Date last_login) {
        this.last_login = last_login;
    }

    public void setConfirmation_token(String confirmation_token) {
        this.confirmation_token = confirmation_token;
    }

    public void setPassword_requested_at(Date password_requested_at) {
        this.password_requested_at = password_requested_at;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", username_canonical=" + username_canonical + ", email=" + email + ", email_canonical=" + email_canonical + ", enabled=" + enabled + ", salt=" + salt + ", password=" + password + ", last_login=" + last_login + ", confirmation_token=" + confirmation_token + ", password_requested_at=" + password_requested_at + ", roles=" + roles + '}';
    }

   
    
    
        
}
