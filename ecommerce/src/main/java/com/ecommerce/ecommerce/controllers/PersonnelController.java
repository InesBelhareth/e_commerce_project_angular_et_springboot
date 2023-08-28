package com.ecommerce.ecommerce.controllers;

import com.ecommerce.ecommerce.models.Personnel;
import com.ecommerce.ecommerce.responses.Message;
import com.ecommerce.ecommerce.services.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class PersonnelController {
    @Autowired
    private PersonnelService personnelService;
    @PostMapping("/ajouterpersonnel")
    public Message ajouterpersonnel(@RequestBody Personnel personnel)
    {
      return   personnelService.ajouterpersonnel(personnel);

    }
    @GetMapping("/afficherpersonnel")
        public List<Personnel> afficherpersonnel()
    {
        return personnelService.afficherpersonnel();   }
    @DeleteMapping("/supprimerpersonnel/{id}")
    public Message supprimerpersonnel(@PathVariable int id)
    {
        return personnelService.supprimerpersonnel(id);    }
}



