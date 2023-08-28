package com.ecommerce.ecommerce.controllers;

import com.ecommerce.ecommerce.models.Product;
import com.ecommerce.ecommerce.responses.Message;
import com.ecommerce.ecommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping ("/ajouterproduit")
    public  void ajouterproduit(@RequestBody Product product)
    {
        productService.ajouterproduit(product);
    }
    @GetMapping("/afficherproduit")
    public List<Product> afficherproduit()
    {
       return productService.afficherproduit();
    }
    @GetMapping("/afficherproduitparid/{id}")
    public Product afficherproduitparid(@PathVariable int id)
     {return productService.afficherproduitparid(id);}

    @DeleteMapping("/supprimerproduit/{id}")
   public Message supprimerproduit(@PathVariable int id)
    {
return productService.supprimerproduit(id);    }
}