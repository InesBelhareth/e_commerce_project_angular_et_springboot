package com.ecommerce.ecommerce.repositorys;

import com.ecommerce.ecommerce.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Integer> {
}
