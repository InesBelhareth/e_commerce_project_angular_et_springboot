package com.ecommerce.ecommerce.models;

import jakarta.persistence.*;

@Entity
public class Commande {
    @Id
    @GeneratedValue
    private  int id;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Commande(int id, Client client, Product product) {
        this.id = id;
        this.client = client;
        this.product = product;
    }

    public Commande() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "id=" + id +
                ", client=" + client +
                ", product=" + product +
                '}';
    }
}
