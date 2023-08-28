import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Client } from './Models/client';
import { Commande } from './Models/commande';

@Injectable({
  providedIn: 'root'
})

export class ClientService {

  constructor(private http:HttpClient) { }
  

  ajoutercommande(commande:Commande):Observable<any>
  {
    return this.http.post("http://localhost:8955/creer",commande) };
    
    ajouterclient(client:Client):Observable<any>
  {    return this.http.post("http://localhost:8955/ajouterclient",client) };
   update(id:number,client :Client):Observable<any>
   {return  this.http.put('http://localhost:8955/update/'+ id,client)};
}
