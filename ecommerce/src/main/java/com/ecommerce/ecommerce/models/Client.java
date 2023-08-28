package com.ecommerce.ecommerce.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue
    private  int id ;
    private  String nomprenom;
    private  String adresse;
    private  String tel;

    public Client() {
    }

    public Client(int id, String nomprenom, String adresse, String tel, List<Commande> commandes) {
        this.id = id;
        this.nomprenom = nomprenom;
        this.adresse = adresse;
        this.tel = tel;
        this.commandes = commandes;
    }


    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nomprenom='" + nomprenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomprenom() {
        return nomprenom;
    }

    public void setNomprenom(String nomprenom) {
        this.nomprenom = nomprenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Client(int id, String nomprenom, String adresse, String tel) {
        this.id = id;
        this.nomprenom = nomprenom;
        this.adresse = adresse;
        this.tel = tel;
    }
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Commande> commandes = new ArrayList<>();
}
