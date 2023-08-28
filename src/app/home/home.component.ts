import { Component, OnInit } from '@angular/core';
import { Produit } from '../Models/produit';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {
  

  public listproduit:Produit[]=[];
  
  ngOnInit(): void {

    /*titlanca doub mayahther componenet hetha*/ 
  this.listproduit.push(new Produit(1,"p1","",25,4,""));
  this.listproduit.push(new Produit(2,"p2","",24,3,""));
  this.listproduit.push(new Produit(3,"p3","",23,5,""));
  this.listproduit.push(new Produit(4,"p4","",22,1,""));


}
showproduct()
{
  console.log(this.listproduit);
}
}