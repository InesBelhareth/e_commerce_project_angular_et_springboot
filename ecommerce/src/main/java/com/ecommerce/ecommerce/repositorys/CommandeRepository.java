package com.ecommerce.ecommerce.repositorys;

import com.ecommerce.ecommerce.models.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository  extends JpaRepository<Commande,Integer> {
}
