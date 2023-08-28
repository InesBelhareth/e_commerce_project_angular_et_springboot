package com.ecommerce.ecommerce.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private  int id;
private String nom;

private  String img;
private Double rate;
private  Double prix;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }



    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Product() {

    }

    public Product(int id, String nom, String img, Double rate, Double prix) {
        this.id = id;
        this.nom = nom;

        this.img = img;
        this.rate = rate;
        this.prix = prix;
    }


    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", img='" + img + '\'' +
                ", rate=" + rate +
                ", prix=" + prix +
                '}';
    }
}
