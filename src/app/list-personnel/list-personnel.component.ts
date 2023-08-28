import { Component, Input, OnInit } from '@angular/core';
import { Personnel } from '../Models/personnel';
import { PersonnelService } from '../personnel.service';

@Component({
  selector: 'app-list-personnel',
  templateUrl: './list-personnel.component.html',
  styleUrls: ['./list-personnel.component.scss']
})
export class ListPersonnelComponent implements OnInit {
  @Input() listepersonnel:Personnel[]=[];
  constructor(private service:PersonnelService){}
  ngOnInit(): void {
    this.service.consulterlistepersonnel().subscribe  
  (
    (data)=>
   {
     this.listepersonnel=data;
   },
   (errr)=>
   {
     console.log(errr);
   }
   )
  }
  
  
}


