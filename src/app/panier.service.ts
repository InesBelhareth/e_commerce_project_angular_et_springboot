import { Injectable } from '@angular/core';
import { Produit } from './Models/produit';
import { HttpClient } from '@angular/common/http';
import { Client } from './Models/client';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PanierService {
private panier:Produit[]=[];
private montant:number=0;
ajouteraupanier(produit:Produit):void
{
  this.panier.push(produit);



}
obtenirpanier():Produit[]
{return this.panier;

}
obtenirtotale():number
{
  for (let i = 0 ;i<this.panier.length;++i)
  {
    this.montant+=this.panier[i].prix;
  }
  return this.montant;
}

}

