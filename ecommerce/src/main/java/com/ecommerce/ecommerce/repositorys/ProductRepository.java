package com.ecommerce.ecommerce.repositorys;


import com.ecommerce.ecommerce.models.Personnel;
import com.ecommerce.ecommerce.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    @Query(value= "SELECT * from product",nativeQuery = true)
    List<Product> afficherproduit();
}
