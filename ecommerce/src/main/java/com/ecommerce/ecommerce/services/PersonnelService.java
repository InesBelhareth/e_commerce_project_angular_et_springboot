package com.ecommerce.ecommerce.services;

import com.ecommerce.ecommerce.models.Personnel;
import com.ecommerce.ecommerce.models.Product;
import com.ecommerce.ecommerce.repositorys.PersonnelRepository;
import com.ecommerce.ecommerce.responses.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class PersonnelService {
    @Autowired
   private PersonnelRepository personnelRepository;

    public Message ajouterpersonnel(Personnel personnel) {
      Personnel p=personnelRepository.findPersonnelByCin(personnel.getCin()).orElse(null);
      if (p==null){
        personnelRepository.save(personnel);
      return new Message("personnel ajoutee");}
      else {
          throw new IllegalStateException("cin exist");
      }
    }

    public List<Personnel> afficherpersonnel() {
   return personnelRepository.afficherpersonnel();
    }

    public Message supprimerpersonnel(int id) {
        Personnel p = personnelRepository.findById(id).orElse(null);
        if (p == null) {
            throw new IllegalStateException("pas de personnel par ce id");
        } else
        {
           personnelRepository.deleteById(id);
            Message msg = new Message("personnel supprimer ");
            return msg;
        }
    }
    }

