import { Component, Input, NgZone, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Produit } from 'src/app/Models/produit';
import { ProduitService } from '../produit.service';
import { PanierService } from '../panier.service';

@Component({
  selector: 'app-produit',
  templateUrl: './produit.component.html',
  styleUrls: ['./produit.component.scss']
})
export class ProduitComponent implements OnInit {
  constructor(private service:PanierService, private router:Router,private ngZone:NgZone)
  {};
  @Input() produit : Produit= new Produit();
  ngOnInit(): void {
    // console.log(this.produit)
    }
    naviguerverspanier(id:any)
    {
      const link=["panier",id];
      this.router.navigate(link);
    }
  ajouterAuPanier(produit:Produit){
    this.service.ajouteraupanier(produit);
    
  }
  // heartActive = false;

  // toggleHeartColor() {
  //   this.ngZone.run(() => {
  //     this.heartActive = !this.heartActive;
  //   });}
    heartActive = false;

    toggleHeartColor() {
      this.heartActive =!this.heartActive;
      console.log("ok")

    }
  
}
