import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ChatService } from '../chat.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.scss']
})
export class ContactComponent {
  constructor(private service:ChatService){};

  ajouterchate(form:NgForm)
  {
if(form.value.chat==""|| form.value.nom==""||form.value.email=="")
{
  Swal.fire({
    icon: 'error',
    title: 'Oops...',
    text: 'Veuillez remplir tous les champs.',
  })}
  else{

    this.service.ajouterchat(form.value).subscribe

      (
        (data)=>
            {
              console.log(data);
              Swal.fire({
                title: 'Votre message a été envoyé avec succès',
              
              })
            },
            (errr)=>
            {
              console.log(errr);
            }
            )
  

  }}
}
