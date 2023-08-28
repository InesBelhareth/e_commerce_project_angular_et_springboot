import { Component, Input, OnInit } from '@angular/core';
import { Produit } from '../Models/produit';
import { ProduitService } from '../produit.service';

@Component({
  selector: 'app-liste-produit',
  templateUrl: './liste-produit.component.html',
  styleUrls: ['./liste-produit.component.scss']
})
export class ListeProduitComponent implements OnInit {
  constructor(private service:ProduitService){}
 
  
  @Input() produits:Produit[]=[]
  ngOnInit(): void {
  // console.log(this.produits)
    this.service.consulterlisteproduit().subscribe  
     (
  (data)=>
      {
        this.produits=data;
      },
      (errr)=>
      {
        console.log(errr);
      }
      )
  }

}
