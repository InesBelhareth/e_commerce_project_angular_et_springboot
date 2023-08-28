package com.ecommerce.ecommerce.services;

import com.ecommerce.ecommerce.models.Client;
import com.ecommerce.ecommerce.repositorys.ClientRepository;
import com.ecommerce.ecommerce.responses.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
   private ClientRepository clientRepository;

    public Message ajoutercient(Client client) {
        clientRepository.save(client);
        return  new Message("clientajouter");
    }

    public Client afficherclientparid(int id) {
Client c=clientRepository.findById(id).orElse(null);
        if (c==null)
        {
            throw new IllegalStateException("pas de client par ce id");
        }
        else return c;
    }

    public Client update(int id,Client cm) {
        Client c = clientRepository.findById(id)
                .orElse(null);

        // Mettez à jour les propriétés nécessaires de l'entité existante avec les valeurs de l'entité modifiée
        // par exemple : entiteExistante.setPropriete(entiteModifiee.getPropriete());
        c.setNomprenom(cm.getNomprenom());
        c.setAdresse(cm.getAdresse());
        c.setTel(cm.getTel());

        return clientRepository.save(c);
    }
}
