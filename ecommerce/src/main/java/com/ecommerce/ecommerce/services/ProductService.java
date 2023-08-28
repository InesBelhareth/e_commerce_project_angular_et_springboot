package com.ecommerce.ecommerce.services;

import com.ecommerce.ecommerce.models.Product;
import com.ecommerce.ecommerce.repositorys.ProductRepository;
import com.ecommerce.ecommerce.responses.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
   private ProductRepository productRepository;

    public void ajouterproduit(Product product) {
productRepository.save(product);    }

    public List<Product> afficherproduit()
    {
     return   productRepository.afficherproduit();
    }

    public Product afficherproduitparid(int id) {
        Product p= productRepository.findById(id).orElse(null);
if (p==null)
{
  throw new IllegalStateException("pas de produit par ce id");
}
else return p;
    }

    public Message supprimerproduit(int id) {
        Product p = productRepository.findById(id).orElse(null);
        if (p == null) {
            throw new IllegalStateException("pas de produit par ce id");
        } else
        {
            productRepository.deleteById(id);
            Message msg = new Message("produit supprimer ");
            return msg;
        }
    }}
