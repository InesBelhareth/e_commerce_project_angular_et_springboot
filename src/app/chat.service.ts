import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Chat } from './Models/Chat';

@Injectable({
  providedIn: 'root'
})
export class ChatService {

  constructor(private http:HttpClient) { }
  ajouterchat( chat:Chat):Observable<any>
  {
    return this.http.post("http://localhost:8955/ajouterchat",chat) }}
