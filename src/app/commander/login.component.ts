import { Component, Input, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ClientService } from '../client.service';
import { Produit } from '../Models/produit';
import { Commande } from '../Models/commande';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})

export class LoginComponent implements OnInit{
  @Input() listproduitcommander:Produit[]=[];

  listparid :any[]=[];
  commande!:Commande;


  constructor(private service:ClientService){};
 
  ngOnInit(): void {
    
//     console.log(this.listproduitcommander);
//    console.log("---------------")
    for(let i=0;i<this.listproduitcommander.length ;++i)
   {
  this.listparid.push(this.listproduitcommander[i].id);}
  console.log(this.listparid);}

  ajoutercommande1(form:NgForm)
      { const nom=document.getElementById("nom") as HTMLInputElement;
      const tel=document.getElementById("tel")as HTMLInputElement;
      const adr=document.getElementById("adr")as HTMLInputElement;
      if (nom.value=="" ||  tel.value ==""|| adr.value =="" )
      {
        Swal.fire({
          icon: 'error',
          title: 'Oops...',
          text: 'Veuillez remplir tous les champs.',
        })
      }
      else{


        const commande={
        idclient:"123",
        produitIds:this.listparid}
        if (this.listparid.length==0)
        {
          Swal.fire({
            icon: 'error',
            title: 'Oops...',
            text: 'Aucun Produit!',
            footer: 'Choisir au moins un produit pour commander</a>'
        })}
        else{
      this.service.ajoutercommande(commande).subscribe
     (
       (data)=>
           {
             console.log(data["client"]["id"]);
             this.service.update(data["client"]["id"],form.value).subscribe
             (
                   (data)=>
                   {
                     console.log(data);
                     Swal.fire(
                      'Commande confirmée avec succès.!',
                      'Paiement à la livraison',
                      
                    )
                   },
                   (errr)=>
                   {
                     console.log(errr);
                     Swal.fire({
                      icon: 'error',
                      title: 'Oops...',
                      text: 'Something went wrong!',
                      footer: '<a href="">Why do I have this issue?</a>'
                    })
                   }
                   )
           },
           (errr)=>
           {
             console.log(errr);
           }
           )
          
          }
          }}
//   ajoutercliente(form:NgForm)
//   {
   
//  this.service.update(id,form.value).subscribe
//  (
//        (data)=>
//        {
//          console.log(data);
//        },
//        (errr)=>
//        {
//          console.log(errr);
//        }
//        );}

        }