import { Component, Input, OnInit } from '@angular/core';
import { Personnel } from '../Models/personnel';

@Component({
  selector: 'app-personnel',
  templateUrl: './personnel.component.html',
  styleUrls: ['./personnel.component.scss']
})
export class PersonnelComponent implements OnInit {
  @Input() personnel:Personnel=new Personnel(); 
  ngOnInit(): void {
  }


}
