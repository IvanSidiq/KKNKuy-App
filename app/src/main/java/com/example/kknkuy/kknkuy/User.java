package com.example.kknkuy.kknkuy;


import java.io.Serializable;

public class User implements Serializable{
    private String name, email, nimp, pass, key;

    public User(){
    }

    public String getKey(){
        return key;
    }

    public void setKey(String key){
        this.key = key;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String name){
        this.email = email;
    }

    public String getNimp(){
        return nimp;
    }

    public void setNimp(String name){
        this.nimp = nimp;
    }

    public User(String nm, String eml, String nmp){
        name = nm;
        email = eml;
        nimp = nmp;
    }


}

