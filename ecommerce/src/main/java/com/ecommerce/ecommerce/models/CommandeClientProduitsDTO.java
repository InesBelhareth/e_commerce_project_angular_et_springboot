package com.ecommerce.ecommerce.models;

import java.util.List;

public class CommandeClientProduitsDTO {
    public Integer getIdclient() {
        return idclient;
    }

    public void setIdclient(Integer idclient) {
        this.idclient = idclient;
    }

    private Integer idclient;
    private List<Integer> produitIds;


    @Override
    public String toString() {
        return "CommandeClientProduitsDTO{" +
                "idclient='" + idclient + '\'' +
                ", produitIds=" + produitIds +
                '}';
    }


    public List<Integer> getProduitIds() {
        return produitIds;
    }

    public void setProduitIds(List<Integer> produitIds) {
        this.produitIds = produitIds;
    }

    public CommandeClientProduitsDTO() {
    }

    public CommandeClientProduitsDTO(Integer idclient, List<Integer> produitIds) {
        this.idclient = idclient;
        this.produitIds = produitIds;
    }
}
