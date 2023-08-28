package com.ecommerce.ecommerce.controllers;

import com.ecommerce.ecommerce.models.Commande;
import com.ecommerce.ecommerce.models.CommandeClientProduitsDTO;
import com.ecommerce.ecommerce.responses.Message;
import com.ecommerce.ecommerce.services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class CommandeController {
    @Autowired
    private CommandeService commandeService;
    @PostMapping("/creer")
    public Commande créerCommandeAvecClientEtProduits(@RequestBody CommandeClientProduitsDTO dto) {
      return   commandeService.créerCommandeAvecClientEtProduits(dto.getIdclient(), dto.getProduitIds());

    }
}
