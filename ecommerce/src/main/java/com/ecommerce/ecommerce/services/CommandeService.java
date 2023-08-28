package com.ecommerce.ecommerce.services;

import com.ecommerce.ecommerce.models.Client;
import com.ecommerce.ecommerce.models.Commande;
import com.ecommerce.ecommerce.models.Product;
import com.ecommerce.ecommerce.repositorys.ClientRepository;
import com.ecommerce.ecommerce.repositorys.CommandeRepository;
import com.ecommerce.ecommerce.repositorys.ProductRepository;
import com.ecommerce.ecommerce.responses.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeService {
    @Autowired
    private CommandeRepository commandeRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ProductRepository produitRepository;



    public Commande créerCommandeAvecClientEtProduits(Integer idclient, List<Integer> produitIds) {
        Client client = new Client();
        client.setId(idclient);
        client = clientRepository.save(client);

        Commande commande = new Commande();
        commande.setClient(client);

        for (Integer p : produitIds) {
            Product produit = produitRepository.findById(p).orElse(null);
            if (produit != null) {
                Commande nouvelleCommande = new Commande();
                nouvelleCommande.setClient(client);
                nouvelleCommande.setProduct(produit);
                commandeRepository.save(nouvelleCommande);
            }
        }

        return commande;
    }
    }


