package com.agriconnect.buyer.model;

import javax.swing.plaf.PanelUI;

public class Buyer {
    private int id;
    private String name;
    private String email;
    private String password;

    public Buyer(int id, String name, String email, String password){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public Buyer(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }

}
