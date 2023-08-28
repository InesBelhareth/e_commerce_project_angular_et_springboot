package com.ecommerce.ecommerce.controllers;

import com.ecommerce.ecommerce.models.Client;
import com.ecommerce.ecommerce.repositorys.ClientRepository;
import com.ecommerce.ecommerce.responses.Message;
import com.ecommerce.ecommerce.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;
    @Autowired
    private ClientRepository clientRepository;
    @PostMapping("/ajouterclient")
    public Message ajouterclient(@RequestBody Client client)
    {return  clientService.ajoutercient(client);}
    @GetMapping ("/clientparid/{id}")

    public Client clientparid(@PathVariable int id){
        return clientService.afficherclientparid(id);
    }
    @PutMapping("/update/{id}")
    public Client mettreAJourEntite(@PathVariable int id, @RequestBody Client cm) {
       return clientService.update(id,cm);}


}
