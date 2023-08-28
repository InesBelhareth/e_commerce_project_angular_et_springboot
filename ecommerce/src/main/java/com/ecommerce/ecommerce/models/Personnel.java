package com.ecommerce.ecommerce.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Personnel {
    @Id
    @GeneratedValue
    private  int id;
    private  String cin;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    private String img;
    private  String nom;
    private String  prenom;
    private String post;

    @Override
    public String toString() {
        return "Personnel{" +
                "cin='" + cin + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", post='" + post + '\'' +
                '}';
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Personnel() {
    }

    public Personnel(String cin, String nom, String prenom, String post) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.post = post;
    }
}
