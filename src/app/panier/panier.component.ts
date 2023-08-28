import { Component, OnInit } from '@angular/core';
import { Produit } from '../Models/produit';
import { Router } from '@angular/router';
import { PanierService } from '../panier.service';

@Component({
  selector: 'app-panier',
  templateUrl: './panier.component.html',
  styleUrls: ['./panier.component.scss']
})
export class PanierComponent implements OnInit {
  produitsPanier: Produit[] = [];
  montanttotale:number=0;
nbrproduits=0;
  constructor(private service:PanierService){
  this.produitsPanier = this.service.obtenirpanier();
  this.montanttotale=this.service.obtenirtotale();
     this.nbrproduits=this.produitsPanier.length;
    

}
  
ngOnInit(): void {
console.log(this.nbrproduits);
  }


 
}
